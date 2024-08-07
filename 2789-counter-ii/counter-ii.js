/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let temp=init;
    return{
       increment:function() {
            return temp+=1;
        },
        
          reset:function() {
            return temp=init;
        },
       decrement:function() {
           return temp-=1;
        }
    }



};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */