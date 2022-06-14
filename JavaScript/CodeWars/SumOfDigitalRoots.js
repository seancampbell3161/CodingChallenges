/*
Given n, take the sum of the digits of n. If that value has more than one digit, 
continue reducing in this way until a single-digit number is produced. 
The input will be a non-negative integer.
*/

function digital_root(n) {
    while (n.toString().length !== 1){
      return digital_root(
        n.toString().split('').map(Number).reduce((acc, val) => acc += val, 0)
      );
    }
    return n;
  }