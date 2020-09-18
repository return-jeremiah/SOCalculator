package org.horizoncolumbus.hs;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    //double number1 = 19.99d;
    //double number2 = 19.99d;
    //-----------------ENTERING NUMBER------------------------------
    Scanner input = new Scanner(System.in);
    System.out.print("ENTER FIRST NUMBER: ");
    int number1 = input.nextInt();
    System.out.print("ENTER SECOND NUMBER: ");
    int number2 = input.nextInt();
    //-----------------OPERATION SELECTOR------------------------------
    String line1 = "WHICH OPERATION WOULD YOU LIKE TO PERFORM?";
    String line2 = "/M      --->         MULTIPLICATION";
    String line3 = "/A      --->         ADDITION";
    String line4 = "/D      --->         DIVISION";
    String line5 = "/S      --->         SUBTRACTION";
    String line6 = "/XD      --->        XD";
    System.out.println(line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5 + "\n" + line6);

    System.out.print("---> ".toUpperCase());
    String operation = input.next();
    //-----------------Cool Stuff-----------------------------
    String line7 =   "\\‾‾‾\\    /‾‾‾/ |‾‾‾‾‾‾‾‾‾‾\\";
    String line9 =   " \\  \\  /  /  |        \\";
    String line10 =  "  \\  \\/  /   |        |";
    String line11 =  "  /  /\\  \\   |        |";
    String line12=   " /  /  \\  \\  |        /";
    String line13=   "/__/    \\__\\ |_______/";
    //String line14=   "__";

    //-----------------SELECTING OPERATION-----------------------------
    switch (operation.toUpperCase()) {
        case "M" -> System.out.println(number1 * number2);
        case "A" -> System.out.println(number1 + number2);
        case "D" -> System.out.println(number1 / number2);
        case "S" -> System.out.println(number1 - number2);
        case "XD" -> System.out.println(line7 + "\n" + line9 + "\n" + line10 + "\n" + line11 + "\n" + line12+ "\n" + line13+ "\n");// + line14);
        default -> System.out.println("ERROR 404");
    }
}
}

