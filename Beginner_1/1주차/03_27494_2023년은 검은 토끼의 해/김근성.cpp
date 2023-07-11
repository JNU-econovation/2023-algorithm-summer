#include <iostream>
#include <algorithm>
#include <stdio.h>
#include <queue>
#include <stack>
#include <set>
#include <cmath>
#include <cstring>
#include <deque>
#include <list>
#define MAX 2147483647
#define PI 3.141592653589793
#define ll long long
#define MOD 10000
#define TARGET 20
#define MODULAR(x,y) (((x)%MOD)+((y)%MOD))%MOD
#define MODULARF(x,y) (((x)%MOD)*((y)%MOD))%MOD
#define MODULARM(x,y) (((x)%MOD)-((y)%MOD))%MOD
using namespace std;
int arr[] = {3,2,0,2,100};
int main() {
	int n;
	cin>>n;

	int temp;
	int point;
	int ans = 0;
	for (int i = 2023; i <= n; i++) {
		temp = i;
		point = 0;
		while (temp > 0) {
			if (temp % 10 == arr[point]) {
				point++;
			}
			temp/=10;
		}
		if(point == 4) ans++;
	}

	cout<<ans;
}