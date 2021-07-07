// Your task is to find the first element of an array that is not consecutive.

function firstNonConsecutive (arr) {

    let array = arr;
    let result = 0;
    let isTriggered = false;
      
    for(i = 0; i < array.length - 1; i++) {
      if (array[i] != (array[i+1]) - 1) {
        console.log(array[i+1]);
        result = array[i+1];
        isTriggered = true;
        break;
      }
    }
    
    if(!isTriggered) return null;
    if(result === 0) return 0;
    
    return result;
  }