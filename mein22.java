import java.util.Scanner;

public class mein22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введіть число c: ");
        int c = scan.nextInt();
        System.out.println("введіть число а: ");
        int a = scan.nextInt();
        System.out.println("введіть число b: ");
        int b = scan.nextInt();

        int y = 0;

        if (c > 0) {
            if (a < 0 || b < 0) {
                System.out.println("a та b не можуть бути від'ємними ");
            } else if (a > b) {
                System.out.println("a не може бути більше b ");
            } else {
                y = (int) (Math.sqrt(b - a) + 2 * Math.sqrt(c));
                System.out.println("c більше нуля тому рахуємо за формулою - √(b-a) + 2√c ");
                System.out.println("y = " + y);
            }
        }

        if (c == 0) {
            if (a <= 0 || b <= 0) {
                System.out.println("a та b  не можуть дорівнювати 0");
            }
            else{
            y = b / (c - 6 * a);
            System.out.println("y = " + y);
            System.out.println("c дорівнює нулю тому рахуємо за формулою - b / (c - 6 * a) ");}
        }



        if(c < 0){
            y = b + 12 * (c * c * c);
            System.out.println("c меньше нуля тому рахуємо за формулою - b + 12 * (c)^3 ");
            System.out.println("y = " + y);

        };




    }
}
