let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().split("\n");

const num = Number(input[0]);
let arr1 = input[1].split(" ").map((x) => Number(x));
let arr2 = input[2].split(" ").map((x) => Number(x));

let DP = new Array(num + 1).fill(0).map(() => new Array(100).fill(0));

for (let i = 1; i <= num; i++) {
  for (let k = 1; k < 100; k++) {
    let l = arr1[i - 1];
    let j = arr2[i - 1];
    if (k < l) {
      DP[i][k] = DP[i - 1][k];
    } else {
      DP[i][k] = Math.max(j + DP[i - 1][k - l], DP[i - 1][k]);
    }
  }
}

console.log(DP[num][99]);
