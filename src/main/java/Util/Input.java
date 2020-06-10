package Util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static double inputDouble() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

}
