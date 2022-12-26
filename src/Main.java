import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r, 𝛼;
        double pi=3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        r = inp.nextInt();

        System.out.print("Daire diliminin merkezi açısını giriniz : ");
        𝛼 = inp.nextInt();

        double daireDilimAlan = (pi*r*r*𝛼)/360 ;
        System.out.println("Daire dilimi alanı : " + daireDilimAlan);

    }
}