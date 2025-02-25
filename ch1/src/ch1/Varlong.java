package ch1;


public class Varlong {
    public static void main(String[] args) {
        //변수
        
        //정수 : byte(1), short(2), int(4) , long(8)
        //문자 : char(2)
        //실수 : float(4), double(8)
        //불린 : boolean(1)
        //변수명 : 단어 2개 조합인 경우 뒷단어는 대문자로 시작
        //max-speed: 데이터 베이스 필드명

         long a =10, maxSpeed = 100;
         long m =256; // 자동 형변환
         long mon = 10000000000000l; // int 초과하는 범위에는 l를 붙임

        // 변수값 변경 
        a =30;
        
        // System.out.println(a);
        // System.out.println(maxSpeed);

        //+ : 산술 연산 
        //+ : 연결 (변수 + "문자열" + 변수)
        System.out.println(mon);
        System.out.println( "나이:" + a + ", 최고속도:" + maxSpeed + ", max:"+m); // 연결
        System.out.println(a + maxSpeed + m); // 연산



        
    
    




    
}

}
