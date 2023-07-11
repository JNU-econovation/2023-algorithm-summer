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
int arr[6];

int main() {
	cin.tie(0);
	cout.tie(0);
	ios::sync_with_stdio(0);

	int n;
	cin>>n;
	
	int ans = -1;
	int ansNum = 0;

	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= 5; j++) {
			cin>>arr[j];
		}

		for (int a = 1; a <= 3; a++) {
			for (int b = a + 1; b <= 4; b++) {
				for (int c = b + 1; c <= 5; c++) {
					if (ans <= (arr[a] + arr[b] + arr[c]) % 10) {
						ans = (arr[a] + arr[b] + arr[c]) % 10;
						ansNum = i;
					}
				}
			}
		}
	}

	cout<<ansNum;
}