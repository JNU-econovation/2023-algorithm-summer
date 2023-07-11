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

struct Info {
	int age;
	string name;
	int index;

	Info(int a, string b, int c) {
		age = a;
		name = b;
		index = c;
	}
};
bool sorting(Info a, Info b) {
	if (a.age == b.age) {
		return a.index <b.index;
	}
	else {
		return a.age <b.age;
	}
}

int main() {
	cin.tie(0);
	cout.tie(0);
	ios::sync_with_stdio(0);

	int n;
	cin>>n;
	int a;
	string b;
	vector<Info> v;

	for (int i = 1; i <= n; i++) {
		cin>>a>>b;
		v.push_back(Info(a,b,i));
	}

	sort(v.begin(),v.end(),sorting);

	for (int i = 0; i < n; i++) {
		cout<<v[i].age<<" "<<v[i].name<<"\n";
	}
}