import java.util.*;
import java.io.*;
class Solution {
  public int[] solution(int[] arr) {
      int[] answer = {};
      
      if(arr.length > 1) {
          //    최소값을 삭제하므로 길이 -1
          answer = new int[arr.length-1];
          int minIndex = 0;
          
          for(int i=1; i<arr.length; i++) {
              //    최소값 저장
              if(arr[i] <= arr[minIndex]) {
                  minIndex = i;
              }
          }
          for(int i=0, j=0; i<arr.length; i++) {
              //    최소값이 아니면 answer 배열에 저장
              if( i != minIndex) {
                  answer[j++] = arr[i];
              }
          }
      //    길이 1보다 작으면 -1 출력
      } else {
        answer = new int[1];
        answer[0] = -1;
      }

    return answer;
  }
}