/*
Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.
*/

function findOdd(A) {
  
    A.sort(); 
  
    let slidingIndex = 0;
    let numToSlide = 0;
    let isDone = false;
    
    if(A.length === 1) return A[0];
    
    while(!isDone) {
      let count = 0;
      let resultArray = [];
      for(i = slidingIndex; i < A.length; i++) {
        if(A[i] === A[slidingIndex]) {
          count++;
          resultArray.push(A[i]);
          numToSlide++;
        }
      }
      slidingIndex = numToSlide;
      if(count % 2 != 0) {
         isDone = true;
         return resultArray[0];
         }
    }   
  }