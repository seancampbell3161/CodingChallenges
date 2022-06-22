/*
Your task is to sort a given string. Each word in the string will contain a single number. 
This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
*/

function order(words){
    let result = [];
    words.split(' ').forEach(word => {
        const index = word.match(/\d+/)-1;
        result[index] = word;
    });
    return result.join(' ');
}