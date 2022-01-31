function runProgram(input) {
  input = input.trim().split("\n");
  for (let i = 1; i < input.length; i = i + 2) {
    let size = Number(input[i]);
    let arr = input[i + 1].split(" ").map(Number);
    MadAngles(size, arr);
  }
}
function MadAngles(n, array) {
  let l = 0,
    r = n - 1;
  while (l < r) {
    var t = array[l] / 2;
    l++;

    if (t <= array[r]) {
      if (array[r] == t) {
        r--;
        t = 0;
      } else if (array[r] > t) {
        var remain = array[r] - t;
        array[r] = remain;
        t = 0;
      }
    } else {
      while (t !== 0 && l !== r) {
        if (array[r] > t) {
          var remain = array[r] - t;
          array[r] = remain;
          t = 0;
        } else {
          var t = t - array[r];
          r--;
        }
      }
    }
  }
  console.log(l, n - l);
}
if (process.env.USERNAME === "kapish") {
  runProgram(`
  2
5
2 9 8 2 7
8
5 6 4 5 7 8 9`);
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
