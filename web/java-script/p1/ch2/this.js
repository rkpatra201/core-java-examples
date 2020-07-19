/**
 * use of this
 */
// this depends who calls the function

display();
function display()
{
   // console.log(this);// global this or window object
}

var john = {
    firstName: 'John',
    birthYear: 1990,
    calculateAge: function()
    {
        this.age = 2020 - this.birthYear;
        function inner()
        {
            console.log(this); // global this
        }
      //  inner();
    }
}

john.calculateAge();
console.log(john)

var mark = {
    firstName: 'mark',
    birthYear: 1995
}
// function borrowing
mark.calculateAge = john.calculateAge;
mark.calculateAge();
console.log(mark);