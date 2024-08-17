package commonMethods;

import org.openqa.selenium.WebElement;

public class WrapClass {
	
	public static void click(WebElement webElement) {
		webElement.click();
	}
	
	public static void sendKeys(WebElement webElement, String textToSend) {
		webElement.sendKeys(textToSend);
	}
	
	public static boolean verifyElementDisplayed(WebElement webElement) {
		return webElement.isDisplayed();
	}

}
