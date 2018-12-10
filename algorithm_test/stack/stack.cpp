
#include "pch.h"
#include <iostream>
using namespace std;
//	stack

class stack {
private:
	int arr[100];
	int size;	// top은 size로 구할 수 있음
public:
	stack() {
		size = 0;
	}
	// pop : 삭제
	void pop() {
		size--;

	}
	// push : 삽입
	void push(int data) {
		arr[size] = data;
		size++;
	}
	// size : 확인
	int getSize() {
		return size;
	}
	// top: data 확인
	int top() {
		return arr[size - 1];	//	
	}
};


int main()
{
	stack s;

	//	data push
	for (int i = 0; i < 10; i++) {
		s.push(i);
		//cout << s.top() << endl;
	}
	while (s.getSize() > 0) {
		cout << s.top() << endl;
		s.pop();
	}
}