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
