var x, y;
x = 10;
y = 10;

if (x < y) {
    console.log(x + ' is bigger than y');
}
else if (x > y) {
    console.log(y + ' is bigger than x');
}
else {
    console.log(x + ' is same as ' + y);
}

var flag = null; // coercion
if (!flag) {
    console.log('it is ' + flag)
}

flag = 'data';

if (flag) {
    console.log('it is ' + flag);
}

flag = 0;

if (!flag) {
    console.log('it is ' + flag);
}