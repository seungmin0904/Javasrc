package condition;

public class ifTest1 {
    public static void main(String[] args) {
        // 특정 조건을 만족하면 문장을 실행
        // if (조건문){}

        // 특정 조건 만족 시 구문 1 만족 못할때는 구문 2 실행 (결과값 true 만 실행)
        // if(조건문){구문1}else{구문2} 

        int x = 0;
        if (x==0) {
            System.out.println("x==0");
        }
        if (x!= 0 ){
            System.out.println("x!=0");
        }
        if (!(x==0)){
            System.out.println("!(x==0)");
        }
        if (!(x!=0)){
            System.out.println("!(x!=0)");
        }
    


    }
    
}
