package mid1.lang.string.method;

import java.sql.SQLOutput;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banna,Orange";

        // split()
        String [] splitStr = str.split(","); // 쉼표(',')를 기준으로 자름.
        for (String s : splitStr) {
            System.out.println(s);
        }

        String joinStr = "";
        for (int i=0; i < splitStr.length; i++) {
            String string = splitStr[i];
            joinStr += string;
            
            //마지막엔 '-' 구분자 안들어가기 하기 위함
            if (i != splitStr.length-1){
                joinStr += '-';
            }
        }
        System.out.println("joinStr : " + joinStr);
        
        // join()
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열 = " + joinedStr);

        // 문자열 배열 연결
        String result = String.join("-", splitStr);
        System.out.println("result = " + result);
    }
}
