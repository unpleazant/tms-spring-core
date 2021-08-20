package tms;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter {

    public void print(String text) {
        System.out.println(text);
    }

}
