import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveCalculatorTest {

    @DataProvider
    public Object[][] positiveData() {
        return new Object[][]{
                {"+", "2", "2", "4.0"},
                {"-", "8", "3", "5.0"},
                {"-", "-1", "100", "-101.0"},
                {"+", "-1", "1", "0.0"},
                {"*", "6", "4", "24.0"},
                {"*", "1", "0", "0.0"},
                {"/", "10", "2", "5.0"},

        };
    }

    @Test(dataProvider = "positiveData")
    public void positiveTest(String param1, String param2, String param3, String param4) {
        String[] arr = new String[]{param1, param2, param3, param4};


        String actual = Calculator.execute(arr);
        Assert.assertEquals(actual, arr[3]);
    }
}
