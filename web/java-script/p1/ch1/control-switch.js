/**
 * ternary operator
 */
var x, y, z;
x = 10;
y = 20;
z = 30;

var result = x > y ? x > z ? x : z : y > z ? y : z;
console.log(result);

/**
 * switch case
 */
var country = 'canada';

switch (country) {
    case 'india':
        console.log('I am indian');
        break;
    case 'canada':
        console.log('I am canadian');
        break;
    default:
        console.log('I am some part of the world');
}

age = 17

switch (true) {
    case age < 18 && age > 13:
        console.log('teen');
        break;
    case age < 13:
        console.log('child');
        break;
    default:
        console.log('adult');
}