// import loginFormView from "./views/login-form-view.js";
//
import LoginFormView from "./views/login-form-view.js";
import LoginController from "./controller/LoginController.js";
import FruitFormView from "./views/fruit-form-view.js";
import FruitController from "./controller/FruitController.js";

const tag = "[main]"


document.addEventListener("DOMContentLoaded", main);

function main() {
    console.log(tag,"main")
    const loginFormView = new LoginFormView();
    const fruitFormView = new FruitFormView();
    const loginController = new LoginController({loginFormView});
    const fruitController = new FruitController({fruitFormView})
}
