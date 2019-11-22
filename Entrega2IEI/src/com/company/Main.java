package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Main {

    private static WebDriver driver = null;
    private static final String execPath = "";

    public static void main(String[] args) {
        System.out.println("Hola mamá");
        firefox("adfasdf");
	// write your code here
    }

    private static void firefox(String webPage){
        System.setProperty("webdriver.gecko.driver", execPath);
        driver = new FirefoxDriver();
        driver.get(webPage);
    }


    private static void getFromFNAC(){
        WebElement elementoActual, navegacion;
        List<WebElement> listaElementos =
                driver.findElements(By.xpath("//*[contains(@class, 'Article-itemGroup')]")); System.out.println("Número de elementos de la lista: " + listaElementos.size() );
        int j=1;
        for (int i=0; i<listaElementos.size(); i++)
        {
            elementoActual = listaElementos.get(i);
            navegacion = elementoActual.findElement(By.xpath("/html/body/div[3]/div/div[7]/div/div["+j+"]/article/div[2]/div/p[1]"));
            System.out.println(j + " " + navegacion.getText());
            WebDriverWait waiting = new WebDriverWait(driver, 30); //TODO ?
            j++;
        }
    }
}

