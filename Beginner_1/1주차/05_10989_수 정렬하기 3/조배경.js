let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().split("\n");

let totalNum = input[0];
input.shift();
input.sort();

let answer = "";

for (let i = 0; i < totalNum; i++) {
  answer += +input[i] + "\n";
}

console.log(answer);
