import View from "./view.js";
import {on, qs, qsAll} from "./helper.js";

const tag = '[Tag]'


export default class FruitFormView extends View {
    constructor() {
        super(qs("#fruit-form-view"));
        this.nameInput = qs("#nameInput", this.element);
        this.colorInput = qs("#colorInput", this.element);
        this.submitInput = qs("[type=button]", this.element);
        this.inputArray = qsAll("[type=text]", this.element);
        console.log(this.submitInput);
        this.eventBinding();
    }

    eventBinding() {
        on(this.submitInput, "click", (event) => this.registerFruit(event))
        this.inputArray.forEach(input => on(input, "keyup", (event) => this.registerFruitByKeyup(event)))

    }

    registerFruit(event) {
        event.preventDefault();

        const name = this.nameInput.value;
        const color = this.colorInput.value;
        this.emit("@register", {name, color})
    }

    registerFruitByKeyup(event) {
        event.preventDefault();


        if (event.keyCode != 13) {
            return;
        }
        let name = this.nameInput.value;
        let color = this.colorInput.value;
        console.log("name ", name, "color =>", color);

        if (name == '' || color == '') {
            console.log("null value");
            this.nameInput.value = ''
            this.nameInput.colorInput = ''
            alert("둘다 입력해야 합니다. ")
            return
        }
        this.emit("@register", {name, color})
    }
}
