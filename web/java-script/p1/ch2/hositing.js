/**
 * function hositing
 */
display();
// fucntion defintion
function display() {
    console.log('display method');
}


//show(); // show() is not a function.
// function expression
var show = function(){
    console.log('show method');
}
//show(); // it works but will it work if called before. no, it will give type reference error
console.log(age); // undefined becuase it is defined later
var age = 20;
console.log(age); // 20
console.log(height); // error because it is not defined any where.
