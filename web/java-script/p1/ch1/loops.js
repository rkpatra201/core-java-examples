var persons = [{
    firstName: 'John',
    age: 28
},
{
    firstName: 'Ben',
    age: 31
},
{
    firstName: 'Doe',
    age: 33
},
{
    firstName: 'Loki',
    age: 34
},
{
    firstName: 'Mitchel',
    age: 36
}
]

console.log(persons.length);
console.log(persons[2]);

for (var i = 0; i < persons.length; i++) {
    console.log(persons[i]);
}

console.log('using continue');
for (var i = 0; i < persons.length; i++) {
    if (persons[i].age % 2 == 0) {
        continue;
    }
    console.log(persons[i]);
}

console.log('using break')
for (var i = 0; i < persons.length; i++) {
    if (i == 3) {
        break;
    }
    console.log(persons[i]);
}

console.log('using while');
var i = 0;
while(i < persons.length)
{
    console.log(persons[i]);
    i++;
}