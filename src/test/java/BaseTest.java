import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import helper.HelperMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;
import pages.TextBox;
public class BaseTest {
    TextBox textBox;
    HelperMethod helperMethod;

    @BeforeClass
    public void setUp() {
        textBox = new TextBox();
        helperMethod = new HelperMethod();
    }
}
