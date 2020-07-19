/**
 * true: other than false.
 * false: 0, null, empty string, nan, undefined
 */

var x;
if (!x) {
    console.log('value of ' + x)
}

var age = 23;
if (age == '23') {
    console.log('type coercion comparison');
}

if (!(age === '23')) {
    console.log('without type coercion comparison');
}