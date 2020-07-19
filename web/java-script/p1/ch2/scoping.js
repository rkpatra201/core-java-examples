

var a = 20;

function first() {
    var b = 10;
    function second() {
        var c = 30;
        console.log(a, b, c); // lexically defined scope. own scope and outer scope until global scope
        third();
    }
    second();
}
first();
function third() {
    var d = 40;
    console.log(a, d); // global scope and current scope
  //  console.log(a, c, d);// c not defined
}