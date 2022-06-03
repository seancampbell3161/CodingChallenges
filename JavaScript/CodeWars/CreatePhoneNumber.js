/*
Write a function that accepts an array of 10 integers (between 0 and 9), 
that returns a string of those numbers in the form of a phone number.
*/
function createPhoneNumber(numbers){
    return numbers.reduce((p, c) => p.replace('x', c), "(xxx) xxx-xxxx");
}