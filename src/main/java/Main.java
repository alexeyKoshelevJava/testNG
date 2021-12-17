import model.Calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] arr = line.split(" ");
        String str = Calculator.execute(arr);
        System.out.println(str);


    }

}
