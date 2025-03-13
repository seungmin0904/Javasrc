package api.util;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenEx {
    public static void main(String[] args) {

        String str = "this is a test";
        StringTokenizer st = new StringTokenizer(str); // 구분자 없으면 공백 기준으로 출력

        // split : String[] // 구분자를 명확하게 명시해야함
        System.out.println("String split() : " + Arrays.toString(str.split(" ")));

        // StringTokenizer : String
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken() + "\t");
        }

        str = "this/is/a/test";
        st = new StringTokenizer(str, "/"); // 구분자
        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "\t");
        }
        System.out.println();

        // 3번째 인자 > returnDelims: true
        String expression = "x=100*(200+300)/2";
        st = new StringTokenizer(expression, "+-*/=()", true);
        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "\t");
        }
        System.out.println();

        String source = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";

        // st = new StringTokenizer(source, ",|", false);
        // while (st.hasMoreTokens()) {
        // System.out.print(st.nextToken() + "\n" + "----------\n");
        // }
        // System.out.println();

        st = new StringTokenizer(source, "|", false);
        while (st.hasMoreTokens()) {
            String token = st.nextToken(); //

            StringTokenizer st2 = new StringTokenizer(token, ",");
            while (st2.hasMoreTokens()) {
                System.out.println(st2.nextToken());
            }
            System.out.println("--------------------");
        }
        System.out.println();
    }
}