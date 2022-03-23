const array = [-1, 3, 5, -9, 6];

function kadanasAlogrithamForMaximumArray(array) {
  let curretBestArray = array[0];
  let currentBestSum = array[0];
  let overAllBestSum = array[0];
  let overAllBestArray = array[0];
  for (let i = 1; i < array.length; i++) {
    curretBestArray = Math.max(array[i], curretBestArray + array[i]);
    currentBestSum = Math.max(currentBestSum, curretBestArray);
    if (currentBestSum > overAllBestSum) {
      overAllBestSum = currentBestSum;
      overAllBestArray = curretBestArray;
    }
  }
  return overAllBestArray;
}
console.log(kadanasAlogrithamForMaximumArray(array));
