function runProgram(input) {
  input = input.trim().split("\n");
  //   console.log(input);

  for (let i = 1; i < input.length; i += 2) {
    // console.log(i);
    let size = +input[i].split(" ");
    let arr = input[i + 1].split(" ").map(Number);
    // console.log(size, arr);
    console.log(func(arr));
  }
}
function func(arr) {
  // find index of last negative number
  let neg = 0;
  for (let i = arr.length - 1; i >= 0; i--) {
    if (arr[i] < 0) {
      neg = i;
      break;
    }
  }
  let sum = 0;
  for (let i = 0; i <= neg; i++) {
    sum += arr[i];
  }
  if (sum < 0) {
    return Math.abs(sum) + 1;
  }
  return 1;
}

if (process.env.USERNAME === "kapish") {
  runProgram(`
  3
5
-3 2 -3 4 2
2
1 2
3
1 -2 -3
`);
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
