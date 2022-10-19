package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_WAIT_FOR_COOKIE = "//div[contains(@class, \"_9xo5\")]";
    public static final String XPATH_COOKIES_PERMISSION = "//div[contains(@class, \"_9xo5\")]/button[contains(@class, \"_9xo7\")]";
    public static final String XPATH_NEW_ACCOUNT = "//div[contains(@class, \"_6ltg\")]/a";
    public static final String XPATH_DAY_OF_BIRTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_MONTH_OF_BIRTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_YEAR_OF_BIRTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";



    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_COOKIE)).isDisplayed());

        WebElement cookiesPermission = driver.findElement(By.xpath(XPATH_COOKIES_PERMISSION));
        cookiesPermission.click();

        WebElement newAccountField = driver.findElement(By.xpath(XPATH_NEW_ACCOUNT));
        newAccountField.click();

        Thread.sleep(1000);

        WebElement dayOfBirthField = driver.findElement(By.xpath(XPATH_DAY_OF_BIRTH));
        Select selectDay = new Select(dayOfBirthField);
        selectDay.selectByValue("11");

        WebElement monthOfBirthField = driver.findElement(By.xpath(XPATH_MONTH_OF_BIRTH));
        Select selectMonth = new Select(monthOfBirthField);
        selectMonth.selectByValue("11");

        WebElement yearOfBirthField = driver.findElement(By.xpath(XPATH_YEAR_OF_BIRTH));
        Select selectYear = new Select(yearOfBirthField);
        selectYear.selectByValue("1987");
    }
}
