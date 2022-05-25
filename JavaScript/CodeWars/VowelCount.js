function getCount(str) {
    let vowelsCount = 0;
    let vowels = ['a','e','i','o','u'];
    
    str.split('').map(c => vowels.includes(c) ? vowelsCount++ : null);
    
    return vowelsCount;
  }