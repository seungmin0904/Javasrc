package loop;

public class whileEx2 {
    public static void main(String[] args) {

        int i = 1;
        while (i < 11) {
            System.out.print(i + "  ");
            i++;

        }
        System.out.println();
        i = 10;
        while (i > 0){
            System.out.print(i + "  ");
            i--;
        }
        System.out.println();
        
        
        i = 1;
        while (i < 11){
            if (i % 2 == 0)
            System.out.print(i + "   ");
            i++;
            
        }
        System.out.println();

        
        i = 2;
        while(i < 11){
            System.out.print(i + "  ");
            i+=2;
        }
        System.out.println();
        
    }

}
