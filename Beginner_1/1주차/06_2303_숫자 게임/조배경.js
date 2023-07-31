let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().split("\n");

let totalNum = input[0];
let newArr = [];
let people = [];
let result = [];
let answer = [];

let maxArr = [];
let maxNum = 0;

// 각 사람 별로 배열을 구한 후 합을 구함
for (let i = 1; i <= totalNum; i++) {
  newArr[i - 1] = input[i]
    .split(" ")
    .map((x) => Number(x))
    .reduce((a, b) => a + b);

  people[i - 1] = input[i].split(" ").map((x) => Number(x));

  for (let k = 0; k < 4; k++) {
    for (let j = 1; j < 5 - k; j++) {
      result.push(
        (newArr[i - 1] - (people[i - 1][k] + people[i - 1][j + k])) % 10
      );
    }
    answer[i - 1] = result;
  }
  result = [];
  maxArr.push(Math.max(...answer[i - 1]));
  maxNum = Math.max(...maxArr);
}

let answerPeople = [];

for (let i = 0; i < totalNum; i++) {
  maxArr[i] === maxNum ? answerPeople.push(i + 1) : undefined;
}

console.log(Math.max(...answerPeople));
