/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(s) {
        return "Hello World"
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */