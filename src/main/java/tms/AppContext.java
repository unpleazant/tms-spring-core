package tms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppContext {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RootConfiguration.class);
        ConsoleWriter writer = (ConsoleWriter) applicationContext.getBean("writer");
        ConsoleReader reader = (ConsoleReader) applicationContext.getBean("reader");
        CalculatorService cs = (CalculatorService) applicationContext.getBean("calculatorService");

        writer.print("Enter a value: ");
        double a = reader.inputValue();

        writer.print("Enter an operation name (sum/sub/mult/div): ");
        String operation = reader.inputText();

        writer.print("Enter a second value: ");
        double b = reader.inputValue();

        writer.print(String.format("Result is: %s", cs.calc(a, b, operation)));

    }

}