package loop;

public class whileEx2 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.print(i + "   ");

             i = 1;
            while ( i < 11){
                System.out.println(i + "  ");
                i++;
            }

        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + "   ");
            i = 1;
            while (i > 0){
                System.out.println(i + "  ");
                i--;
            }
        
            

        }
        // 짝수만 출력
        System.out.println();
        for (int i = 1; i < 11; i++) {
            // i가 짝수이면 출력
            
            if (i % 2 == 0)
                System.out.print(i + "   ");

        }
        System.out.println();

        for (int i = 2; i < 11; i+=2) { 
            System.out.print(i + "   ");

        }

    }

}
