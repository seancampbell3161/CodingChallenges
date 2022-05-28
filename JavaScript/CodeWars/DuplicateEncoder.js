function duplicateEncode(word) { 
    let charArray = new Array();
    let duplicates = new Array();
    
    word.toLowerCase().split('').forEach(c => {
      charArray.includes(c) ? duplicates.push(c) : charArray.push(c);
    });
    
    return word.toLowerCase().split('').map(c => {
      return duplicates.includes(c) ? ')' : '(';
    }).join('');
  }