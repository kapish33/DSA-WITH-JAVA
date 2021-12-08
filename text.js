function runProgram(input) {
  input = input.trim().split("\n");
  var test = +input[0];
  var select = 1;
  for (let i = 0; i < test; i++) {
    var size = +input[select++];
    var array = input[select++].trim().split(" ").map(Number);
    // console.log(size, array);
    eatBanana(size, array);
  }
}
function eatBanana(n, array) {
  var left = 0;
  var right = n - 1;
  while (left < right) {
    var time = array[left] / 2;
    left++;

    if (time <= array[right]) {
      if (array[right] == time) {
        right--;
        time = 0;
      } else if (array[right] > time) {
        var remain = array[right] - time;
        array[right] = remain;
        time = 0;
      }
    } else {
      while (time !== 0 && left !== right) {
        if (array[right] > time) {
          var remain = array[right] - time;
          array[right] = remain;
          time = 0;
        } else {
          var time = time - array[right];
          right--;
        }
      }
    }
  }
  console.log(left, n - left);
}
if (process.env.USERNAME === "kapish") {
  runProgram(`
  2 
5 
6 9 8 2 7 
4
4 3 2 1`);
} else {
  process.stdin.resume();
  process.stdin.setEncoding("ascii");
  let read = "";
  process.stdin.on("data", function (input) {
    read += input;
  });
  process.stdin.on("end", function () {
    read = read.replace(/\n$/, "");
    read = read.replace(/\n$/, "");
    runProgram(read);
  });
  process.on("SIGINT", function () {
    read = read.replace(/\n$/, "");
    runProgram(read);
    process.exit(0);
  });
}
