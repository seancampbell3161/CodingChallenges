/*
Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, 
the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.
*/

function longestDistinct(s1, s2) {
    let result = (s1, s2) => [...new Set(s1 + s2)].sort().join('');
}
