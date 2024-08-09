/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
   // int count=0;
    //for(int i=0;i<args.length;i++){
     //   count++;
   // }
    return args.length;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */