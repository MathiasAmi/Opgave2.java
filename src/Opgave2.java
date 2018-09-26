import java.util.*;

public class Opgave2 {

    public static void main(String[] args) {


//Opgave 2.2

        System.out.println("");
        System.out.println("Opgave 2.2");
        System.out.println("Skriv radius");

        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double areal = radius * radius * Math.PI;
        System.out.println(areal);
        System.out.println("Skriv længde");
        double længde = sc.nextDouble();
        double volume = areal * længde;
        System.out.println(volume);

//Opgave 2.3

        System.out.println("");
        System.out.println("Opgave 2.3");
        System.out.println("Enter a value for feet:");

        Scanner sc1 = new Scanner(System.in);
        double feet = sc1.nextDouble();
        double meter = feet * 0.3;
        System.out.println(meter);

//Opgave 2.4

        System.out.println("");
        System.out.println("Opgave 2.4");
        System.out.println("Enter a number in pounds:");

        Scanner sc2 = new Scanner(System.in);
        double pounds = sc2.nextDouble();
        double kilogram = pounds * 0.454;
        System.out.println(kilogram);

//Opgave 2.5

        System.out.println("");
        System.out.println("Opgave 2.5");
        System.out.println("Enter the subtotal and a gratuity rate:");

        Scanner sc3 = new Scanner(System.in);
        double subtotal = sc3.nextDouble();
        double gratuity = sc3.nextDouble();
        double total = subtotal * (gratuity / 100 + 1);
        double gratuityRate = subtotal * (gratuity / 100 + 1) - subtotal;
        System.out.println(total);
        System.out.println(gratuityRate);

//Opgave 2.6

        System.out.println("");
        System.out.println("Opgave 2.6");
        System.out.println("Enter a number between 0 and 1000:");

        Scanner sc4 = new Scanner(System.in);
        int number = sc4.nextInt();
        int SumOfDigits = (number %10) + (number/10)%10 + (number / 100)%10;
        System.out.println("The sum of digits is " + SumOfDigits);

//Opgave 2.7

        System.out.println("");
        System.out.println("Opgave 2.7");
        System.out.println("Enter the number of minutes");

        Scanner sc5 = new Scanner(System.in);
        double numberminutes = sc5.nextDouble();
        double yearscounter = numberminutes /(60 * 24 * 365);
        double dayscounter = (numberminutes / (60 * 24)) %365;
        System.out.println(numberminutes + " minutes is approximately " + yearscounter + " years and " + dayscounter + " days");

//Opgave 2.9

        System.out.println("");
        System.out.println("Opgave 2.9");
        System.out.println("Enter v0, v1, and t:");

        Scanner sc6 = new Scanner(System.in);
        double velocity1 = sc6.nextDouble();
        double velocity2 = sc6.nextDouble();
        double time = sc6.nextDouble();
        double avarageAcceleration = (velocity1 - velocity2) / time;
        System.out.println(avarageAcceleration);



    }
}
