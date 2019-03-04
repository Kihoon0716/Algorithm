//  문자열 다루기 기본
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        //    문자열의 길이 확인
        if( s.length() == 4 || s.length() == 6) {
          //    숫자이면 t 리턴
            if(isStringInt(s)) {
                return true;
          //    문자포함하면 f 리턴
            } else {
                return false;
            }
        } else return false;
    }
      
    public static boolean isStringInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
  }