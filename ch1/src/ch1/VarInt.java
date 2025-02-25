package ch1;


public class VarInt {
    public static void main(String[] args) {
        //변수
        
        //정수 : byte(1), short(2), int(4) , long(8)
        //문자 : char(2)
        //실수 : float(4), double(8)
        //불린 : boolean(1)
        //변수명 : 단어 2개 조합인 경우 뒷단어는 대문자로 시작
        //max-speed: 데이터 베이스 필드명

         int a =10, maxSpeed = 100;
         int m =256;

        // 변수값 변경 
        a =30;
        
        // System.out.println(a);
        // System.out.println(maxSpeed);

        //+ : 산술 연산 
        //+ : 연결 (변수 + "문자열" + 변수)
        System.out.println( "나이:" + a + ", 최고속도:" + maxSpeed + ", max:"+m); // 연결
        System.out.println(a + maxSpeed + m); // 연산

        // 형식화 된 출력
        // %b :boolean , %d :정수 , %f :실수 , %s :문자열 , %c :문자
        System.out.printf( "나이: %d , 최고속도: %d, max: %d \n " , a,maxSpeed,m);
        // 숫자로 줄 맞춤
        System.out.printf( "나이: %10d , 최고속도: %d, max: %d \n " , a,maxSpeed,m); 

        



        
    
    




    
}

}
