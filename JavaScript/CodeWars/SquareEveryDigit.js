function squareDigits(num){
    return parseInt(num.toString().split('').map(i => i*i).join(''))
}