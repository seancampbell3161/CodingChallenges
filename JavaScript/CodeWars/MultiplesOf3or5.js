function solution(number){
    let array = new Array();
    for (let i = 2; i < number; i++) {
      if (i % 3 === 0 || i % 5 === 0) array.push(i);
    }
    return array.reduce((acc, i) => acc + i, 0);
}