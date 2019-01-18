package chapter01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//	최빈수구하기
public class Solution1204 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//	test case 입력 받기
		int tc = sc.nextInt();
		
		//	학생 수만큼의 점수를 저장하는 배열
		int[] arr = new int[1001];
		
		//	tc만큼 순회
		for(int i = 0; i < tc; i++) {
			
			//	Key와 value를 묶어 하나의 entry로 저장한다
			Map<Integer, Integer> dic = new HashMap<Integer, Integer>();
			int max = 0;
			int mode = 0;
			
			
			for(int j = 0; j < arr.length; j++) {
			//	배열 순회하며 1000개의 점수 입력 받기
				arr[j] = sc.nextInt();
				
				//	key값이 null이면
				if(dic.get(arr[j]) == null) {
					//	1을 추가
					dic.put(arr[j], 1);
				} else {
					//	값이 있으면, 그 값을 가져와서 1을 더함
					dic.put(arr[j], dic.get(arr[j]) + 1 );
				}
				
				//	값이 최댓값보다 크면
				if(dic.get(arr[j]) > max) {
					//	max값 수정
					max = dic.get(arr[j]);
					//	mode에 저장
					mode = arr[j];
					//	max값과 동일하면
				} else if(max == dic.get(arr[j])) {
					//	mode와 arr[j] 중 가장 큰 값을 mode로 갱신 
					mode = Math.max(mode, arr[j]);
				}
				
			}
			System.out.println("#" + (i+1) + " " + mode);
		}
	}
	
}
