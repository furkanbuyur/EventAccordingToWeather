import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner inp = new Scanner(System.in);
        System.out.print("What is the temperature ? : ");
        heat = inp.nextInt();

        System.out.println("\nRecommended Activities : ");

        if (heat < 5) {
            System.out.println("* Ski");
        } else if (heat <= 25) {
               if (heat <= 15) {
                   System.out.println("* Cinema");
               }
               if (heat >= 10) {
                   System.out.println("* Picnic");
               }
        } else {
            System.out.println("* Swim");
        }
    }
}
