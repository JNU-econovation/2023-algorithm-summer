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
int arr[1000001];
int main() {
	cin.tie(0);
	cout.tie(0);
	ios::sync_with_stdio(0);

	vector<pair<int,int>> v;
	int n;
	cin>>n;
	int a;
	for (int i = 1; i <= n; i++) {
		cin>>a;
		v.push_back({a,i});
	}

	sort(v.begin(),v.end());

	int index = -1;
	int num = -1;
	for (int i = 0; i < n; i++) {
		if (num != v[i].first) {
			num = v[i].first;
			index++;
		}
		arr[v[i].second] = index;
	}

	for (int i = 1; i <= n; i++) {
		cout<<arr[i]<<" ";
	}
}