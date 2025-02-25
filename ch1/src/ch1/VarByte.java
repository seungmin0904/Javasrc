package ch1;


public class VarByte {
    public static void main(String[] args) {
        //변수

        //상수 : 고정값
        //타입 상수명 = 값; final in MAX_VALUE = 100;

        //정수 : byte(1), short(2), int(4) , long(8)
        //문자 : char(2)
        //실수 : float(4), double(8)
        //불린 : boolean(1)
        //변수명 : 단어 2개 조합인 경우 뒷단어는 대문자로 시작
        //max-speed: 데이터 베이스 필드명

         byte a =10, maxSpeed = 100;
         
        // System.out.println(a);
        // System.out.println(maxSpeed);

        //+ : 산술 연산 
        //+ : 연결 (변수 + "문자열" + 변수)
        System.out.println( "나이:" + a + "," +" 최고속도:" + maxSpeed); // 연결
        System.out.printf( "나이: %d , 최고속도: %d\n " +a,maxSpeed); // 연결
        System.out.println(a + maxSpeed); // 연산

        





        
    
    




    
}

}
