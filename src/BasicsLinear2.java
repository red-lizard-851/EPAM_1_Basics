import java.util.Scanner; //Needed for Scanner

/**
 * This program evaluates following mathematical equation:
 * x = ((b+sq(b^2+4*a*c))/(2*a))-((a^3)*c)+(b^-2)
 *
 *
 */

public class BasicsLinear2 {

    // Найдите значение функции: z = ( (a – 3 ) * b / 2) + c

    static void calculate() {

        int a = 0;
        int b = 0;
        int c = 0;
        //  lkk

        Scanner scan = new Scanner(System.in);

        System.out.println(
                "This program evaluates following mathematical equation:" + "\n\n" +
                        "z = ( (a – 3 ) * b / 2) + c" + "\n\n" +
                        "Default parameters are following:" + "\n" +
                        "a = " + a  + "\n" +
                        "b = " + b  + "\n" +
                        "c = " + c  + "\n"
        );

        System.out.println(
                "Please input 3 required parameters below" + "\n" +
                        "[Type a parameter and press ENTER when you're ready]"  + "\n"
        );

        System.out.println("Type an integer number [a]");
        System.out.print(">");
        a = scan.nextInt();
        System.out.println("Type an integer number [b]");
        System.out.print(">");
        b = scan.nextInt();
        System.out.println("Type an integer number [c]");
        System.out.print(">");
        c = scan.nextInt();

        int z = ((a - 3) * b / 2) + c;

        System.out.println("\n" + "z = " + z);

    }
}
