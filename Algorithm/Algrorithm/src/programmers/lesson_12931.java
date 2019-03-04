import java.util.*;

public class Solution {
    public int solution(int n) {
        
        int answer = 0;
        
        while(n!=0) {   
            //  자릿수 쌓기
            answer += n%10;
            //  나머지 뺀 자릿수
            n = n/10;
        }
        return answer;
    }
}