package chapter01;

import java.util.ArrayList;
import java.util.Scanner;

//	chapter01 : 버블소트
public class BubbleSort {
	public static void main(String[] args) {
		int temp; //	data 저장할 템프
		int data[] = {5,11,7,9,1};
			
		//	bubble sort
		for(int i = 0; i<data.length; i ++) {	//	시간복잡도 : O(N^2)
			for(int j = 0; j<data.length-(i+1); j++) {
				if(data[j] > data[j+1]) {	// 양옆의 data 비교
					//	자리교환
					temp = data[j];	//	swap
					data[j] = data[j+1];
					data[j+1]=temp;
				}
			}
		}
		
		//	출력
		for(int i = 0 ; i < data.length ; i ++) {
			System.out.println(data[i]);
		}
	}
}

