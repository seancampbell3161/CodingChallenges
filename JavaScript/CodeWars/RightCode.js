function printerError(s) {
    let result = 0;
      s.split('').forEach((ele) => {
        return ele.charCodeAt() > 109 ? result++ : result;
      }, 0);
    return result + '/' + s.length;
}