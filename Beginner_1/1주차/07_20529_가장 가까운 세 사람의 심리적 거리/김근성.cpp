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

	int t;
	cin>>t;
	int n;
	string a;
	vector<string> v;
	for (int h = 1; h <= t; h++) {
		cin>>n;

		int ans = 30;
		int temp = 0;

		v.clear();
		for (int i = 1; i <= n; i++) {
			cin >> a;
			v.push_back(a);
		}
		if (n > 32) {
			cout<<0<<"\n";
		}else{
			for (int i = 0; i < v.size() - 2; i++) {
				for (int j = i + 1; j < v.size() - 1; j++) {
					for (int k = j + 1; k < v.size(); k++) {
						temp = 0;
						for (int g = 0; g < 4; g++) {
							temp += v[i][g] != v[j][g];
							temp += v[i][g] != v[k][g];
							temp += v[j][g] != v[k][g];
						}
						ans = min(ans,temp);
					}
				}
			}
			cout<<ans<<"\n";
		}
	}
}