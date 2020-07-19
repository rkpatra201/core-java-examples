/**
 * variables and data types.
 */
var firstName = 'john';// STRING
var lastName = 'doe';
var age = 28;// NUMBER

var fullAge = true; // BOOLEAN
var job; // UNDEFINED

//console.log(firstName, lastName, age, fullAge, job)

// variable can start with $ _ alphabet
// varaible should not be reserved keyword

/**
 * mutation and coercion
 */
// age converted to string from number: coercion
console.log(firstName+ ' ' + age);

var job, isMarried;

isMarried = false;
// boolean also coercion
console.log(job+' '+isMarried);

// age was number earlier but now it is string: mutation
age = 'twenty eight';
console.log(age)

var x = function show(){
    console.log('hi');
}
var employee = {name:'john', age:28};
console.log(typeof x);
console.log(typeof age);
console.log(typeof isMarried);
console.log(typeof firstName);
console.log(typeof employee);
console.log(typeof job);

var age = '28';
var doubleAge = age * 2; // automatic type conversion
console.log(doubleAge);

doubleAge = Number(age) * 2;
console.log(doubleAge); // manual type conversion