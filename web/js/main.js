// import loginFormView from "./views/login-form-view.js";
//
import LoginFormView from "./views/login-form-view.js";
import LoginController from "./controller/LoginController.js";

const tag = "[main]"


document.addEventListener("DOMContentLoaded", main);

function main() {
    console.log(tag,"main")
    let loginFormView = new LoginFormView();
    let loginController = new LoginController({loginFormView});
}
