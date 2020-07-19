var person = {
    firstName: 'John',
    lastName: 'Doe',
    birthYear: 1990,
    currentAge: function(birthYear){
        return 2020 - birthYear;
    }
}

var age = person.currentAge(1990);
person.age = age;
console.log(person);

// using this with object
person = {
    firstName: 'John',
    lastName: 'Doe',
    birthYear: 1995,
    currentAge: function(){
        return (2020 - this.birthYear);
    }
}
person.age = person.currentAge();
console.log(person);
