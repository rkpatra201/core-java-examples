/**
 * functions in js
 */

function sum(x, y) {
    return x + y;
}

var result = sum(10, 20);
console.log(result);

/**
 * function expression
 */
var sumResult = function (x, y) { return x + y };
console.log(sumResult(10, 20));

// if-else (or any statements) dont produce/return value.
// but expression evaluates to a value. like function expression.

/**
 * lambda style function
 */
var result = (x, y) =>{return x + y};
console.log(result(10,20));

/**
 *  returning a function from function
 */
var result = function result(x,y){
    return sum(x,y);
}
console.log(result(10,20));

/**
 * function stored in a variable
 */
var result = function sumFunction(x, y){
    return x + y;
}
console.log(result(10,20));

/**
 * self calling function
 */
var result = (function sumFunction(x, y){
    console.log('self calling ');
    return x + y;
})(10,20);
console.log(result);

/**
 * use of call() method
 */
var result = function test(){
    console.log('call example');
}
result.call();