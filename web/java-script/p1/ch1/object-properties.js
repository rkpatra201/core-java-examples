/**
 * objects in js
 */
var person={
    firstName:'john',
    lastName:'doe',
    age:28,
    isMarried:false,
    friends:['noel','davis']
}

console.log(person);
console.log(person.firstName);
console.log(person['firstName']);
console.log(person.friends[0]);

person.firstName ='Ben';
person['lastName'] = 'jhonson';
person.friends.push('roger');
// person['friends[3]']='alex';

console.log(person);
