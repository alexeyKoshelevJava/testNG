import model.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("For input string: введи оператор\n" +
                "введи первое число\n" +
                "введи второе число\n" +
                "5.0");
        String operator = in.nextLine();
        String first = in.nextLine();
        String two = in.nextLine();

        String str = Calculator.execute(new String[]{operator, first, two});
        System.out.println(str);


    }

}
