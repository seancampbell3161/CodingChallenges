// Create a function with two arguments that will return an array of the first (n) multiples of (x).

function countBy(x, n) {
    var z = [];
    let multiplier = 1;
    
    for(i = 0; i < n; i++) {
      let result = x * multiplier;
      z.push(result);
      multiplier++;
    }
  
    return z;
  }