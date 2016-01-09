package ru.spb.herzen.ivt3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App
{
    public static void main( String[] args )
    {
        WebDriver driver = new HtmlUnitDriver();
        driver.get("http://www.ya.ru");

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.OFF);

        WebElement element;
        try {
            element = driver.findElement(By.className("layout__footer-logo"));

            System.out.println("Page title before click is: " + driver.getTitle() + ".");
            System.out.println("Page url before click is: " + driver.getCurrentUrl() + ".");

            element.click();
            System.out.println();

            System.out.println("Page title after click is: " + driver.getTitle() + ".");
            System.out.println("Page url after click is: " + driver.getCurrentUrl() + ".");
        } catch(Exception e){
            System.out.println("Элемент не найден");
        }

        driver.quit();
    }
}
