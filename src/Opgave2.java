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

//Opgave 2.10

        System.out.println("");
        System.out.println("Opgave 2.10");
        System.out.println("Enter the amount of water in kilograms:");

        Scanner sc7 = new Scanner(System.in);
        double m = sc7.nextDouble();
        System.out.println("Enter the initial temperature:");
        double initialTemperature = sc7.nextDouble();
        System.out.println("Enter the final temperatue:");
        double finalTemperature = sc7.nextDouble();
        double Q = m * (finalTemperature - initialTemperature) * 4184;
        System.out.println("The energy needed is " + Q);

//Opgave 2.12

        System.out.println("");
        System.out.println("Opgave 2.12");
        System.out.println("Enter speed and acceleration");

        Scanner sc8 = new Scanner (System.in);
        double speed = sc8.nextDouble();
        double acceleration = sc8.nextDouble();
        double length = (speed * speed) / (2 * acceleration);
        System.out.println("The minimum runway length for this airplane is " + length);

//Opgave 2.13

        System.out.println("");
        System.out.println("Opgave 2.14");
        System.out.println("Enter the monthly saving amount and interet rate:");

        Scanner sc9 = new Scanner (System.in);
        double savingAmount = sc9.nextDouble();
        double interestRate = sc9.nextDouble();
        double monthlyInterest = (interestRate / 100) / 12;
        double currentAmount = 0;
        for (int i = 0; i < 6; i++){
            currentAmount = currentAmount + savingAmount;
            currentAmount = (currentAmount + monthlyInterest) + currentAmount;
            if (i <3 || i > 4){
                System.out.println("After " + (i + 1) + "months the account value is " + currentAmount);
            }
        }

//Opgave 2.14

        System.out.println("");
        System.out.println("Opgave 2.14");
        System.out.println("Enter weight in pounds");

        Scanner sc10 = new Scanner(System.in);
        double pounds1 = sc10.nextDouble();
        System.out.println("Enter height in inches:");
        double inches = sc10.nextDouble();
        double kilogramFromPounds = pounds1 * 0.453;
        double metersFromInch = inches * 0.025;
        double bmi = kilogramFromPounds / Math.sqrt(metersFromInch);
        System.out.println("BMI is " + bmi);

//Opgave 2.17

        System.out.println("");
        System.out.println("Opgave 2.17");
        System.out.println("Enter the temperature in Fahrenheit between -58F and 41F");

        Scanner sc11 = new Scanner(System.in);
        double temperature = sc11.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour:");
        double windSpeed = sc11.nextDouble();

        double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed,0.16) + 0.4275 * temperature * Math.pow(windSpeed,0.16);
        System.out.println("The wind chill index is " + windChill);

//Opgave 2.18

        System.out.println("");
        System.out.println("Opgave 2.18");

        System.out.println("a    b    pow(a, b");
        System.out.println("1    2     1");
        System.out.println("2    3     8");
        System.out.println("3    4     81");
        System.out.println("4    5     1024");
        System.out.println("5    6     15625");

//Opgave 2.19

        System.out.println("");
        System.out.println("Opgave 2.19");
        System.out.println("Enter three points for a triangle, remember there are 6 values:");
        Scanner sc12 = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc12.nextDouble();
        double x2 = sc12.nextDouble();
        double y2 = sc12.nextDouble();
        double x3 = sc12.nextDouble();
        double y3 = sc12.nextDouble();
        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2),0.5);
        double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2),0.5);
        double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2),0.5);
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        System.out.println("The area of the triangle is " + area);

//Opgave 2.20

        System.out.println("");
        System.out.println("Opgave 2.20");
        System.out.println("Enter balance and interest rate (e.g., 3 for 3%");

        Scanner sc13 = new Scanner(System.in);
        double balance = sc13.nextDouble();
        double interestRate1 = sc13.nextDouble();
        double interest = balance * (interestRate1 / 1200);
        System.out.println("The interest is " + interest);

//Opgave 2.21
        System.out.println("");
        System.out.println("Opgave 2.21");
        System.out.println("Enter investment amount:");

       double amount = sc.nextDouble();
       double mRate = sc.nextDouble()/1200;
       double nrYears = sc.nextDouble();
       double accumulated = amount * Math.pow((1+ mRate), nrYears*12);
        System.out.println("Accumulated value is " + accumulated);

//Opgave 2.23

        System.out.println("");
        System.out.println("Opgave 2.23");
        System.out.println("Enter the driving distance:");

        double dDistance = sc.nextDouble();
        System.out.println("Enter miles per gallon:");
        double mPG = sc.nextDouble();
        System.out.println("Enter price per gallon:");
        double pPG = sc.nextDouble();
        double cost = (dDistance/mPG) * pPG;
        System.out.println("The cost of driving is " + cost);





