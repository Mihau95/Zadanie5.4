import java.util.Locale;
import java.util.Scanner;

public class Wspolrzedne {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("X to: ");
        double x = scan.nextDouble();

        System.out.println("Y to: ");
        double y = scan.nextDouble();


        if (x==0 && y==0){
            System.out.printf("(%.1f;%.1f) jest w punkcie zerowym ukladu", x, y);
        }else if (x!=0 && y==0){
            System.out.printf("(%.1f;%.1f) jest na osi X", x,y);
        }else if (x==0 && y!=0){
            System.out.printf("(%.1f;%.1f) jest na osi Y", x,y);
        }else if (x>0 && y>0){
            System.out.printf("(%.1f;%.1f) jest na I cwierci ukladu", x, y);
        }else if (x<0 && y>0){
            System.out.printf("(%.1f;%.1f) jest na II cwierci ukladu", x, y);
        }else if (x<0 && y<0){
            System.out.printf("(%.1f;%.1f) jest na III cwierci ukladu", x, y);
        }else if (x>0 && y<0){
            System.out.printf("(%.1f;%.1f) jest na IV cwierci ukladu", x, y);
        }

    }
}
