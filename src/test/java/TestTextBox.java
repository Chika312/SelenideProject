import entities.EntityManager;
import entities.User;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertTrue;

public class TestTextBox extends BaseTest {
    @Test
    public void testRegrestion() throws InterruptedException {
        open("https://demoqa.com/text-box");
        User user = EntityManager.generateUser();
        textBox.writeAll(user);
        assertTrue(textBox.name.getText().contains(user.username));
    }
}
