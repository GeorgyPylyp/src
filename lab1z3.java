import java.util.Scanner;
public class lab1z3 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введіть поштовий індекс: ");
        int p = scan.nextInt();
        if (p != 59200 && p != 04070 && p != 61000 && p != 79007 && p != 69061 && p != 65037 && p != 76009 && p != 58012 && p != 14000 && p != 49000 && p != 73009){
            System.out.println("Невідомий поштовий індекс введіть інший");
        }
        else {

            switch (p) {
                case 59200:
                    System.out.println("Вижниця");
                    break;
                case 04070:
                    System.out.println("Київ");
                    break;
                case 61000:
                    System.out.println("Харків");
                    break;
                case 79007:
                    System.out.println("Львів");
                    break;
                case 69061:
                    System.out.println("Запоріжжя");
                    break;
                case 65037:
                    System.out.println("Одеса");
                    break;
                case 76009:
                    System.out.println("Івано-Франківськ");
                    break;
                case 58012:
                    System.out.println("Чернівці");
                    break;
                case 14000:
                    System.out.println("Чернігів");
                    break;
                case 49000:
                    System.out.println("Дніпро");
                    break;
                case 73009:
                    System.out.println("Херсон");
                    break;


            }
        }


    }
}
