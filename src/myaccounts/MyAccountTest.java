package myaccounts;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class MyAccountTest extends Utility {
    String baseUrl = "http://tutorialsninja.com/demo/index.php?";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    public void selectMyAccountOptions(String menu){
        String exp = String.format("//a[text()='%s']", menu) ;
        driver.findElement(By.xpath(exp)).click();
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){

        //Click on My Account Link
        clickOnElement(By.xpath("//span[text()='My Account']"));

        //Call the method “selectMyAccountOptions”
        selectMyAccountOptions("Register");

        //Verify the text “Register Account”
        verifyText(By.xpath("//h1[text()='Register Account']"), "Register Account");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){

        //Click on My Account Link
        clickOnElement(By.xpath("//span[text()='My Account']"));

        //Call the method “selectMyAccountOptions”
        selectMyAccountOptions("Login");

        //Verify the text “Register Account”
        verifyText(By.xpath("//h2[text()='Returning Customer']"), "Returning Customer");
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully(){

        //Click on My Account Link
        clickOnElement(By.xpath("//span[text()='My Account']"));

        //Call the method “selectMyAccountOptions”
        selectMyAccountOptions("Register");

        //Enter First Name
        sendTextToElement(By.id("input-firstname"), "john");
        sendTextToElement(By.id("input-lastname"),"til");
        sendTextToElement(By.id("input-email"),"john11@gmail.com");
        sendTextToElement(By.id("input-telephone"), "9876543213");
        sendTextToElement(By.id("input-password"), "test123");
        sendTextToElement(By.id("input-confirm"), "test123");
        clickOnElement(By.name("newsletter"));
        clickOnElement(By.name("agree"));
        clickOnElement(By.xpath("//input[@type='submit']"));
        verifyText(By.xpath("//h1[text()='Your Account Has Been Created!']"), "Your Account Has Been Created!");
        clickOnElement(By.xpath("//div[@class='pull-right']/a[text()='Continue']"));
        //Click on My Account Link
        clickOnElement(By.xpath("//span[text()='My Account']"));
        selectMyAccountOptions("Logout");
        //Verify the text “Register Account”
        verifyText(By.xpath("//h1[text()='Account Logout']"), "Account Logout");
        clickOnElement(By.xpath("//div[@class='pull-right']/a[text()='Continue']"));

    }
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
        //4.1 Clickr on My Account Link.
        clickOnElement(By.xpath("//span[text()='My Account']"));

        //4.2 Call the method “selectMyAccountOptions” method and pass the parameter Login”
        selectMyAccountOptions("Login");

        //4.3 Enter Email address
        sendTextToElement(By.id("input-email"),"john11@gmail.com");

        //4.4 Enter Last Name
        //sendTextToElement(By.id("input-lastname"),"Jhones");

        //4.5 Enter Password
        sendTextToElement(By.id("input-password"),"test123");

        //4.6 Click on Login button
        clickOnElement(By.xpath("//input[@class='btn btn-primary']"));

        //4.7 Verify text “My Account”
       // verifyText(By.xpath(""),"");

        //4.8 Clickr on My Account Link.
        //clickOnElement(By.xpath(""));

        //4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”


        //4.10 Verify the text “Account Logout”
        //verifyText(By.xpath(""),"");

        //4.11 Click on Continue button
       // clickOnElement(By.xpath(""));


    }


}
