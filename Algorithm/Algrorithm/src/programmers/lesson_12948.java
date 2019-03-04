class Solution {
    public String solution(String phone_number) {
        String answer = "";
        //    입력받은 번호의 길이만큼 순회
        for(int i=0; i<phone_number.length();i++){
            //    마지막 4자리 제외한 앞자리 * 대체
            if( i < phone_number.length() - 4) answer +="*";
            //    마지막 4자리는 번호 출력
            else answer+= phone_number.charAt(i);
        }
        return answer;
    }
  }