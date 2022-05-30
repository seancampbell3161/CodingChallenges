/*
Implement the function unique_in_order which takes as argument a sequence 
and returns a list of items without any elements with the same value next to 
each other and preserving the original order of elements.

Example:
uniqueInOrder('AAAABBBCCDAABBB') == ['A', 'B', 'C', 'D', 'A', 'B']
*/

function uniqueInOrder(iterable) {
    let arr = new Array(); 
    iterable instanceof Array ? null : iterable = iterable.split('');  
    iterable.forEach(c => { if(arr[arr.length -1] !== c) arr.push(c)} ); 
    return arr;
}