package tms;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleReader {

    Scanner scanner;

    public double inputValue() {
        scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public String inputText() {
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
