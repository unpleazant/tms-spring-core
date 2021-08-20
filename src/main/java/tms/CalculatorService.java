package tms;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

    public double calc(double a, double b, String operation) {
        switch (operation) {
            case "sum": return a+b;
            case "sub": return a-b;
            case "mult": return a*b;
            case "div": return a/b;
            default: throw new IllegalArgumentException();
        }
    }

}