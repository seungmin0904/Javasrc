package op;

public class ArthmeticEx3 {
 public static void main(String[] args) {
    char c1 = 'a'; //97
    char c2 =  c1;
    char c3 = ' ';

    //byte,short,char 연산 수행 시 연산의 결과가 int 형으로 변경 됨

    //c3 = c1 + 1;

    int result = c1 +1; // 98 


    c3 = (char) (c1 + 1); //b

    c2++; //a(97)+1 = 98 >(char b)
    c2++; //b(98)+1 = 99 >(char c)
    System.out.println("c1 =" +c1);
    System.out.println("result=" +result);
    System.out.println("c3 =" +c3);
    System.out.println("c2=" + c2);
    



 }
    
}
