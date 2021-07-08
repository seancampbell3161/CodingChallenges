// Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep..."

var countSheep = function (num){
    result = "";
    for(i = 0; i < num; i++) {
      result += (i+1) + " sheep...";
    }
    return result;
  }