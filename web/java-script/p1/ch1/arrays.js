/**
 * arrays
 */
var names = ['John','Doe'];
var years = new Array(1990,1991);
console.log(names[0]);
console.log(names.length);
names[0] = 'Ben';
console.log(names);
names[names.length] = 'Marry';
console.log(names);
/**
 * multi data type array
 */
var person = ['John','Doe',28, false];
person.push(6.3); // adds at the end
person.unshift('Mr.'); // adds at beginning
console.log(person);
person.pop(); // remove from last
person.shift(); // remove from first
console.log(person);
console.log(person.indexOf('John')); // -1 when not found
