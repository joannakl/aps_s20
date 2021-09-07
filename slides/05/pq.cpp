#include <queue>
#include <iostream>
using namespace std;

bool cmp(int a, int b) {
	return a > b;
}

int main (){
	//priority_queue<int> q;
	priority_queue<int, vector<int>, greater<int> > q;
	q.push(3);
	q.push(5);
	q.push(7);
	q.push(2);
	cout << q.top() << "\n"; // 7
	q.pop();
	cout << q.top() << "\n"; // 5
	q.pop();
	q.push(6);
	cout << q.top() << "\n"; // 6
	q.pop();

}
