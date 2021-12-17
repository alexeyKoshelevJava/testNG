import model.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введи оператор");
        String operator = in.nextLine();
        System.out.println("введи первое число");
        String first = in.nextLine();
        System.out.println("введи второе число");
        String two = in.nextLine();

        String str = Calculator.execute(new String[]{operator, first, two});
        System.out.println(str);


    }

}
