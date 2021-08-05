/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that 
determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.
*/

function isIsogram(str){
    let myArray = str.toLowerCase().split("").sort();
    for(let i = 0; i < myArray.length - 1; i++) {
      if(myArray[i] === myArray[i+1]) {
        return false;
      }
    }  
    return true;
  }