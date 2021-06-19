/*
Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total. Alternatively, 
if you rent the car for 3 or more days, you get $20 off your total.

Write a code that gives out the total amount for different days(d).
*/

function rentalCarCost(d) {
    let sum = 0;
    
    sum += 40 * d;
    
    if(d >= 3 && d < 7) {
      sum -= 20;
    } else if (d > 6) {
      sum -= 50;
    }
    
    return sum;
  }