const array = [-1, 3, 5, -9, 6];
function maxArray(array) {
  let currentBestArray = [array[0]];
  let currentBestSum = array[0];
  let overAllBestArray = [array[0]];
  let overAllBestSum = array[0];
  // return max subarray

  for (let i = 1; i < array.length; i++) {
    if (currentBestSum > 0) {
      currentBestArray.push(array[i]);
      currentBestSum += array[i];
      if (overAllBestSum < currentBestSum) {
        overAllBestSum = currentBestSum;
        overAllBestArray = currentBestArray;
      }
    } else {
      currentBestArray = [array[i]];
      currentBestSum = array[i];
    }
  }
  return overAllBestArray;
}
console.log(maxArray(array));
