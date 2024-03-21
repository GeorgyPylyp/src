import java.util.Scanner;

public class lab1z2 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введіть радіус круга: ");
        int r = scan.nextInt();
        System.out.println("введіть сторону квадрату: ");
        int s = scan.nextInt();
        int Sr= (int) (3.14*(r*r));
        int Ss = s*s;
        System.out.println("площа круга: " +Sr);
        System.out.println("площа квадрату: " + Ss);

        if (Ss > Sr){
            System.out.println(Ss+">"+Sr);
            System.out.println("круг поміститься в квадрат" ) ;}
            else if (Ss < Sr){
                System.out.println(Ss+"<"+Sr);
                System.out.println("круг не поміститься в квадрат" ) ;
            }
        }


    }


