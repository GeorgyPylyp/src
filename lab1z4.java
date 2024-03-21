import java.util.Scanner;

public class lab1z4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введіть число a: ");
        int a = scan.nextInt();
        System.out.println("введіть число y: ");
        int y = scan.nextInt();
        System.out.println("введіть число z: ");
        int z = scan.nextInt();


        double x=0;
        if (y <= 0 || a <= 0 || z <= 0) {
            System.out.println("одне із чисел дорівнює або менше нуля введіть інше ");
        }
         else  {
            System.out.println("рахуємо за формулою - x = √(y^2 -2a) + cos^2(z) ");
            x = (double) (a * Math.sqrt((y * y) - 2 * a) + +Math.pow(Math.cos(z), 2));
            System.out.println("х дорівнює: "+x );
        }





    }
}
