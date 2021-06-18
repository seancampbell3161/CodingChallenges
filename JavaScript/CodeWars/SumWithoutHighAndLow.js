/*
    Sum all the numbers of the array except the highest and the lowest element (the value, not the index!)
*/


function sumArray(array) {
  
    let sum = 0;
    
    array.sort(function(a, b) {return a - b});
    
    for(i = 1; i < array.length - 1; i++) {
      sum += array[i];
    }
    
    return sum;
  
  }