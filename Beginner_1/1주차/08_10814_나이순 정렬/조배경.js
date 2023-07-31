let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().split("\n");

let totalNum = input[0];
let age = [];
for (let i = 1; i <= totalNum; i++) {
  age.push(input[i].split(" "));
}

age.sort((a, b) => a[0] - b[0]);

let answer = "";

for (let i = 0; i < totalNum; i++) {
  answer += age[i][0] + " " + age[i][1] + "\n";
}

console.log(answer);
