/*
You receive an array with your peers' test scores. Now calculate the average and compare your score!

Return True if you're better, else False!
*/

function betterThanAverage(classPoints, yourPoints) {
    let sum = 0;
    classPoints.forEach(element => sum += element);
    sum /= classPoints.length;
    return yourPoints > sum;
}