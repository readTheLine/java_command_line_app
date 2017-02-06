package runner;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by Don Robles on 2/2/2017 with IntelliJ IDEA.
 */
public class AddressBookRunner implements AddressInterface {

    private static Utils util = new Utils();

    public static void main(String[] args) {
        AddressBookRunner app = new AddressBookRunner();
        processInput(app, System.in, System.out);
    }

    private static void processInput(AddressBookRunner app, InputStream inputStream, PrintStream outputStream) {
        outputStream.print(app.createMenu());
        boolean appRunning = true;
        Scanner in = new Scanner(inputStream);
        while (appRunning) {
            String userInput = "";
            if (in.hasNext()) {
                userInput = in.nextLine().trim();
                System.out.println(userInput);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(userInput);

            //Quit out the application.
            if ("q".equals(userInput)) {
                appRunning = false;
            }
            outputStream.print(sb.toString());
        }
        in.close();
    }

    private String createMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("Test Message");
        return sb.toString();
    }
}
