/**
 * basic operators
 */
var x, y;
 x = 10;
 y = 20;
 // arithmatic
 console.log(x+y);
 console.log(x*y);
 console.log(y/x)
 console.log(y%x);
 console.log(y-x);

 // logical
 console.log(y!=x);
 console.log(y > x);
 console.log(y < x);
 console.log(y || !0);
 console.log(!0 || y);
 console.log(y && 0);

 // bitwise
 
 console.log(y^x);
 console.log(y&&x);
 console.log(y|x);
 console.log(~y);
 
 // unary
 var x = 10;
 x++;
 console.log(x);
 x--;
 x--;
 console.log(x);
 x*=2;
 console.log(x);
 // precedence
 // https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Operator_Precedence
 