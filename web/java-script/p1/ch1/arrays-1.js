
// forEach function
let numberArray = [1,2,3,4,5,6,7,8,9];
let oddNumbers = numberArray.filter((value, index, array) => {
      if(value % 2){
          console.log(value);
          return value;
      }
});
console.log(typeof oddNumbers);
console.log(oddNumbers);

// map function

let mappedValue = [1,2,3].map( (value, currentValue, currentIndex, array)=> {
   return value * 10;
});
console.log(mappedValue) //returns [10,20,30]

// using reduce
let reducedValue = [10,1,2,3,4,5,6,7,8,9].reduce( (value, currentValue, index, array)=> {
   return value + currentValue;
});
console.log(reducedValue) //returns 55