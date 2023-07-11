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
vector<int> v;
int main() {
	int n,m;
	cin>>n>>m;

	int a;
	for (int i = 1; i <= n; i++) {
		cin>>a;
		v.push_back(a);
	}
	int ans = 0;
	for (int i = 0; i < v.size() - 2; i++) {
		for (int j = i + 1; j < v.size() - 1; j++) {
			for (int k = j + 1; k < v.size(); k++) {
				if (m - (v[i] + v[k] + v[j]) >= 0) {
					ans = max(ans, (v[i] + v[k] + v[j]));
				}
			}
		}
	}

	cout<<ans;
	
}