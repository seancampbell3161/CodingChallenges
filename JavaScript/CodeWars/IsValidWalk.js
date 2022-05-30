/*
The city provides its citizens with a Walk Generating App on their phones -- 
everytime you press the button it sends you an array of one-letter strings representing 
directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only a single block for each letter 
(direction) and you know it takes you one minute to traverse one city block, so create a function 
that will return true if the walk the app gives you will take you exactly ten minutes and will return you to your starting point. Return false otherwise.
*/
function isValidWalk(walk) {
    let count = val => walk.filter((d) => {return d==val;}).length;
    return walk.length==10 && count('n')==count('s') && count('w')==count('e');
  }