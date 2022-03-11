function mysol(prices, discount) {
    // sort the prices  
    prices.sort(function(a, b) {
        return a - b;
    }
    // size of array
    var size = prices.length;
    let max = prices[size - 1];
    let val = max*(100-discount)/100;
    let sum = 0;
    for (let i = 0; i < size-1; i++) {
        sum += prices[i];
    }
    return sum+val;
}
