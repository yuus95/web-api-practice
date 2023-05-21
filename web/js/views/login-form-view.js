import {qs} from "./helper.js";
import View from "./view.js";

export default class LoginFormView extends View {
    constructor() {

        super(qs("#login-form"));

        this.emailInput = qs("[type=text]", this.element);
        this.passwordInput = qs("[type=password]", this.element);

        this.eventBinding();
    }

    eventBinding() {
        this.on("submit", (event) => this.handleSubmit(event))
    }

    handleSubmit(event) {
        event.preventDefault()
        const email = this.emailInput.value;
        const password = this.passwordInput.value;
        this.emit("@login", {email, password})
    }
}
