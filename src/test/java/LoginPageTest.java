
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.sample.TestBase.TestBase;
import com.sample.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginpage;

	@BeforeTest
	public void setup() {
		initialization();
		loginpage = new LoginPage();

	}

	@Test(priority = 1)
    public void navigateToLoginPage() {
		loginpage.verifyPageTitle();
		loginpage.enterusernameAndPassword();

	}
	
	
   @AfterTest
   public void tearsDown() {
	   driver.quit();
   }

}
