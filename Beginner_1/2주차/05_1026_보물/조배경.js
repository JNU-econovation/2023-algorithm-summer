let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().split("\n");

let num = input[0];
let a_arr = input[1].split(" ");
let b_arr = input[2].split(" ");

a_arr = a_arr.map((x) => Number(x));
a_arr.sort((a, b) => a - b);

b_arr = b_arr.map((x) => Number(x));
b_arr.sort((a, b) => b - a);

let i = 0;
let result = 0;

mul = a_arr.map((x) => x * b_arr[i++]);
result = mul.reduce((a, b) => a + b);
console.log(result);
