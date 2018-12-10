#include "pch.h"
#include <iostream>
using namespace std;
// queue


// <-(데이터 추출)head---------------------------tail(데이터 입력) <-//
class queue {
private:
	int arr[100];
	int head;
	int tail;
	int size;
public:
	queue() {
		//	생성자
		head = 0;	// 가장 앞 데이터
		tail = 0;	//	가장 마지막 데이터 옆이  tail 의미
		size = 0;
	}
	//	데이터 입력 push
	void push(int data) {
		arr[tail] = data;
		tail++;
		size++;	// 사이즈 늘려주기
	}
	//	데이터 추출(삭제) pop
	void pop() {
		head++;
		size--;	//	사이즈 줄여주기
	}
	//	맨 앞 데이터 확인 front
	int front() {
		return arr[head];
	}
	
	//	사이즈 확인 getSize
	int getSize() {
		return size;
	}
};


int main()
{
	queue q;

	//	data push
	for (int i = 0; i < 10; i++) {
		q.push(i);
	}

	while (q.getSize()) {
		//	확인하고 pop
		cout << q.front() << endl;
		q.pop();
	}
}
