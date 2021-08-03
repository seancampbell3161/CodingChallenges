/*
Given three integers a ,b ,c, return the largest number obtained after inserting the following operators and brackets: +, *, ()
*/

function expressionMatter(a, b, c) {
  
    let values = [];
    
    let multiplyAll = a * b * c;
    let addAll = a + b + c;
    let multiplyAddPar = a * (b + c);
    let parAddMultiply = (a + b) * c;
    let addMultiply = a + b * c;
    let multiplyAdd = a * b + c;
  
    
    values.push(multiplyAll);
    values.push(multiplyAddPar);
    values.push(addMultiply);
    values.push(parAddMultiply);
    values.push(addAll);
    values.push(multiplyAdd);
    
    values.sort();
    
    return Math.max(...values);
  }