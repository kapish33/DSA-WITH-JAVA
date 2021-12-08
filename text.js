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
function eatBanana(size, array) {
  //   var fast = 0;
  //   var slow = 0;
  // let make first eat for fast
  let left = 0;
  let right = size - 1;
  while (left < right) {
    // lets make fast eat firts
    let time = array[left++] / 2;
    // pura kaha la ga && kuch part he kaha paya ga
    if (time <= array[right]) {
      // eat
      if (array[right] % time === 0) {
        right--;
      } else {
        var bach = array[right] % time;
        array[right] = bach;
      }
    } else {
      // eat
      while (time !== 0) {
        if (array[right] % time === 0) {
          time -= array[right];
          right--;
        } else {
          var bach = array[right] % time;
          array[right] = bach;
        }
      }
    }
    // return { left, size };
    console.log(left + 1, right);
  }
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
