import model.Calculator;
import model.CalculatorException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeCalculatorTest {

    @DataProvider
    public Object[][] negativeData() {
        return new Object[][]{
                {"+", "f", "2"},
                {"-", "8", "!"},
                {"1", "8", "5"},
                {"*", "-", "4"},
                {"/", "8", "0"},
                {"", "8", "5"},
                {"-", "-2147483648", "1"},
                {"+", "2147483647", "1"}

        };
    }


    @Test(dataProvider = "negativeData", expectedExceptions = CalculatorException.class)
    public void negativeTest(String param1, String param2, String param3) {
        String[] arr = new String[]{param1, param2, param3};
        try {
            Calculator.execute(arr);
        } catch (CalculatorException e) {
            throw new CalculatorException();
        }

    }


}
