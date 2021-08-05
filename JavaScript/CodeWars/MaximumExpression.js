/*
Given three integers a ,b ,c, return the largest number obtained after inserting the following operators and brackets: +, *, ()
*/

function expressionMatter(a, b, c) {
  
    let values = [];
    
    values.push(a * b * c);
    values.push(a + b + c);
    values.push(a * (b + c));
    values.push((a + b) * c);
    values.push(a + b * c);
    values.push(a * b + c);
    
    return Math.max(...values);
  }