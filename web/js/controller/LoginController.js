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
    }

    async login({detail}) {
        console.log(detail);
        let email = detail.email;
        let password = detail.password;
        console.log("email", email);
        console.log("password", password);
        try {
            const response = await fetch("http://localhost:8080/login", {
                method: "POST", // GET, POST, PUT 등 HTTP 메소드를 지정하세요.
                headers: {
                    Accept: "application/json",
                    // ContentType: "application/json" */// 요청의 Content-Type을 지정하세요.
                },
                body: JSON.stringify({
                    email: email,
                    password: password
                }) // 요청 본문 데이터를 JSON 문자열로 변환하여 전달합니다.
            });

            if (!response.ok) {
                throw new Error("Request failed!"); // 에러 처리
            }

            console.log(response); // 응답 데이터 출력 (개발 시 참고용)
            // 원하는 동작 수행
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
}
