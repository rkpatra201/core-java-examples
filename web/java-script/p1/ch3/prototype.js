console.log('hello');
var Person = function(brithYear,name){
    this.brithYear = brithYear;
    this.name = name;
}
Person.prototype.calculateAge = function(){
    this.age =  2020 - this.brithYear;
    return this.age;
}
Person.prototype.lastName = 'Smith';
var john = new Person(1980,'john');
console.log(john.calculateAge());
console.log(john);
console.log(john.lastName);
console.log(john.hasOwnProperty('age'));
console.log(john.hasOwnProperty('lastName'));
