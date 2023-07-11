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

int main() {
	vector<int> v;
	int a;
	int b = 0;
	for (int i = 1; i <= 9; i++) {
		cin>>a;
		v.push_back(a);
		b+=a;
	}
	sort(v.begin(),v.end());
	for (int i = 0; i < 9; i++) {
		for (int j = i + 1; j < 9; j++) {
			if (b - v[i] - v[j] == 100) {
				for (int k = 0; k < 9; k++) {
					if (k != i && k != j) {
						cout<<v[k]<<"\n";
					}
				}
				return 0;
			}
		}
	}
}