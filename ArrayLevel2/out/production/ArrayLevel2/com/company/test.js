function runProgram(input) {
  input = input.trim().split("\n");
  //   console.log(input);

  for (let i = 1; i < input.length; i += 2) {
    // console.log(i);
    let size = +input[i].split(" ");
    let arr = input[i + 1].split(" ").map(Number);

    console.log(func(arr));
  }
}
function func(arr) {
  let newArr = new Array(6).fill(0);
  // make newArr as freq array
  for (let i = 0; i < arr.length; i++) {
    newArr[arr[i]]++;
  }
  // print MAX FREQUENCY INDEX
  let max = -1;
  let ans = -1;
  for (let i = 0; i < newArr.length; i++) {
    if (newArr[i] > max) {
      max = newArr[i];
      ans = i;
    }
  }
  return ans;
}

if (process.env.USERNAME === "kapish") {
  runProgram(`
  2
6
1 4 4 4 5 3
11
1 2 3 4 5 4 3 2 1 3 4
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
