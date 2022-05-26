function alphabetPosition(text) {
    return text
    .replace(/[^a-z]/gi, '')
    .toLowerCase()
    .split('')
    .map(c => c.charCodeAt(0) - 96)
    .join(' ');
}