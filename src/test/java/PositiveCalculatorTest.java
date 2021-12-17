import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveCalculatorTest {

    @DataProvider
    public Object[][] positiveData() {
        return new Object[][]{
                new String[]{"+", "2", "2", "4.0"},
                new String[]{"-", "8", "3", "5.0"},
                new String[]{"-", "-1", "100", "-101.0"},
                new String[]{"+", "-1", "1", "0.0"},
                new String[]{"*", "6", "4", "24.0"},
                new String[]{"*", "1", "0", "0.0"},
                new String[]{"/", "10", "2", "5.0"},

        };
    }

    @Test(dataProvider = "positiveData")
    public void positiveTest(String[] arr) {


        String actual = Calculator.execute(arr);
        Assert.assertEquals(actual, arr[3]);
    }
}
