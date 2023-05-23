const tag = "[Tag]"


export default class LoginController {

    constructor(
        {loginFormView,}
    ) {
        console.log(tag, "LoginController")
        this.loginForView = loginFormView;
        this.eventBinding();
    }

    eventBinding() {
        this.loginForView.on("@login", (data) => this.login(data))
        this.loginCheck();
    }

    async login({detail}) {
        console.log(detail);
        const email = detail.email;
        const password = detail.password;

        try {
            const response = await fetch("http://localhost:8080/login", {
                method: "POST", // GET, POST, PUT 등 HTTP 메소드를 지정하세요.
                headers: {
                    Accept: "application/json",
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({
                    email: email,
                    password: password
                }) // 요청 본문 데이터를 JSON 문자열로 변환하여 전달합니다.
            });

            if (!response.ok) {
                throw new Error("Request failed!"); // 에러 처리
            }
            const token = await response.text();
            this.saveTokenToStorage(token)
            this.loginCheck();

        } catch (error) {
            console.error(error); // 에러 메시지 출력
        }
    }

    saveTokenToStorage(token) {
        localStorage.setItem('jwt', token); // 로컬 스토리지에 토큰 값을 저장합니다.
    }

// 토큰 값을 웹 스토리지에서 가져오는 함수
    getTokenFromStorage() {
        return localStorage.getItem('jwt'); // 로컬 스토리지에서 토큰 값을 가져옵니다.
    }

    loginCheck() {
        let localToken = this.getTokenFromStorage();
        if (localToken != null) {
            this.loginForView.hide();
        }
    }

}
