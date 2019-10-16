import java.util.Scanner; //Needed for Scanner
import java.lang.Math;
//Need for square root calculations Math.sqrt() and
// raising a number into a power pow(2, 4)

/**
 * This program evaluates following mathematical equation:
 * x = ((b+sq(b^2+4*a*c))/(2*a))-((a^3)*c)+(b^-2)
 *
 *
 */

class BasicsLinear2 {

    // Вычислить значение выражения по формуле (все переменные принимают действительные значения)
    // x = ((b+sq(b^2+4*a*c))/(2*a))-((a^3)*c)+(b^-2)
    // Выражение можно представить в виде 4 визуальных частей:
    // A / B - C + D
    // часть А - (b + sqrt(b^2 + 4 * a * c)
    // часть B - (2 * a)
    // часть C - (a^3) * c)
    // часть D - (b^-2)

    static void calculate() {

        double a = 0;
        double b = 0;
        double c = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println(
                "This program evaluates following mathematical equation:" + "\n\n" +
                        "x = ((b + sqrt(b^2 + 4 * a * c)) / (2 * a)) - ((a^3) * c) + (b^-2)" + "\n\n" +
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
        a = scan.nextDouble();
        System.out.println("Type an integer number [b]");
        System.out.print(">");
        b = scan.nextDouble();
        System.out.println("Type an integer number [c]");
        System.out.print(">");
        c = scan.nextDouble();

        double partA = b + Math.sqrt(Math.pow(b, 2) + 4 * a * c);
        System.out.println("\n" + "Part A = " + partA);

        double partB = 2 * a;
        System.out.println("\n" + "Part B = " + partB);

        double partC = Math.pow(a, 3) * c;
        System.out.println("\n" + "Part C = " + partC);

        double partD = Math.pow(b, -2);
        System.out.println("\n" + "Part D = " + partD);

        double endpointValue = partA / partB - partC + partD;

        System.out.println("\n" + "x = " + endpointValue);

    }
}
