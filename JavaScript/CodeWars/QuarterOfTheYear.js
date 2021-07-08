// Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.

function getQuarter(month) {
    return month < 4 ? 1 : month < 7 ? 2 : month < 10 ? 3 : 4;
}
