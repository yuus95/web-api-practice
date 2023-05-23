export default class FruitController {
    constructor({fruitFormView}) {
        this.fruitFormView = fruitFormView;

        this.eventBinding();
    }

    eventBinding() {
        this.fruitFormView.on("@register", (data) => this.register(data))
    }

    async register({detail}) {
        const name = detail.name;
        const color = detail.color;
        try {
            const response = await fetch("http://localhost:8080/fruit", {
                method: "POST",
                headers: {
                    Accept: "application/json",
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({
                    name: name,
                    color: color
                })
            });
            if( response.status != 201){
                throw new Error("Reqeust Failed")
            }
            console.log(response.status);
        } catch (error) {
            console.error(error);
        }
    }
}
