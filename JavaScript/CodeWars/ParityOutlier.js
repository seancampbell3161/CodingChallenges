function findOutlier(integers) {
    return integers.filter(x => x % 2 === 0).length === 1
      ? integers.filter(x => x % 2 === 0)[0]
      : integers.filter(x => x % 2 !== 0)[0];
}