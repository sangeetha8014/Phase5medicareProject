package LoginpageTsuites;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.AboutPage;
import pageObjects.BasePage;
import pageObjects.ContactPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ProductPage;
import pageObjects.SignupPage;




public class pageObjectTest extends BasePage {

	public WebDriver driver;


	@Test(priority = 0)
	public void validateHome_Pg() throws InterruptedException {
				
				HomePage HP = new HomePage();
				HP.isHomePage();
				Thread.sleep(3000);
			}
				
			@Test(priority = 1)
			public void validateContactPg() throws InterruptedException  {
				
				ContactPage CP = new ContactPage();
				CP.isContact_Page();
				Thread.sleep(1000);
			}


			@Test(priority = 2)
			public void validateAboutPg() throws InterruptedException  {
				
				AboutPage AP = new AboutPage();
				AP.isAbout_Page();
				Thread.sleep(3000);
			}

			@Test(priority = 3)
			public void validateLoginPg() throws InterruptedException  {
			
				LoginPage LP = new LoginPage();
				LP.isLogin_Page();
				Thread.sleep(3000);
			}

			@Test(priority = 4)
			public void validateSignupPg() throws InterruptedException  {
				
				SignupPage SP = new SignupPage();
				SP.isSignUp_Page();
				Thread.sleep(3000);
			}

			@Test(priority = 5)
			public void validateProductPg() throws InterruptedException  {
				
				ProductPage Anal = new ProductPage();
				Anal.isProduct_Pg();
				Thread.sleep(3000);
			}

}
