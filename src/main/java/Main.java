import model.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        args = new String[3];
        args[0] = in.nextLine();
        args[1] = in.nextLine();
        args[2]= in.nextLine();

        String str = Calculator.execute(args);
        System.out.println(str);


    }

}
