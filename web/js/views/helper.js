/**
 * 헬퍼의 용도는
 *  기존에도 많이 사용하는 메소드 ex) querySelector  같은 것들을
 *  좀 더 쉽게 정의하기 위해 약축어로 정의해놓은 파일이다.
 *
 */

export function qs(selector, scope = document) {
    if (!selector) throw "no selector";

    return scope.querySelector(selector);
}

export function qsAll(selector, scope = document) {
    if (!selector) throw "no selector";

    return Array.from(scope.querySelectorAll(selector));
}

export function on(target, eventName, handler) {
    target.addEventListener(eventName, handler);
}

export function delegate(target, eventName, selector, handler) {
    const emitEvent = (event) => {
        const potentialElements = qsAll(selector, target);

        for (const potentialElement of potentialElements) {
            if (potentialElement === event.target) {
                return handler.call(event.target, event);
            }
        }
    };

    on(target, eventName, emitEvent);
}

export function emit(target, eventName, detail) {
    const event = new CustomEvent(eventName, {detail});
    target.dispatchEvent(event);
}
