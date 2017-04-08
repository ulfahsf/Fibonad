
package fibonanchi;
import java.util.Scanner;

public class Fibonanchi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
//         deret(y);
        total(y);
    }
    
    private static int fibbonaci(int y){
        if(y>1){
            return fibbonaci(y-1)+fibbonaci(y-2);
        }
        return y;
    }
    
    private static void total(int y){
        int total = 0;
        for (int i = 1; i <= y; i++) {
            total+=fibbonaci(i);
        }
        System.out.println(total);
    }

    private static void deret(int y){
        for (int i = 1; i <= y; i++) {
            System.out.print(fibbonaci(i)+" ");
        }
    }
}
