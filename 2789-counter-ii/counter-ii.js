var createCounter = function(init) {
    let temp = init;
    return {
        increment: () => ++temp,
        reset: () => temp = init,
        decrement: () => --temp
    };
};
