package com.vwfs.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"E:\\SELENIUM\\Selenium practice\\VolkswagenFinancialServices\\src\\main\\java\\com\\vwfs\\qa\\config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void initialization() {

		String browserName = prop.getProperty("browser");
		

		if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (browserName.equalsIgnoreCase("FF")) {
		
			System.setProperty("webdriver.gecko.driver", "E:\\SELENIUM\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

		if (browserName.equalsIgnoreCase("IE")) {
			
			System.setProperty("webdriver.ie.driver", "D:\\SELENIUM\\geckodriver-v0.19.1-win64\\internetexplorer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITLY_WAIT_TIME, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}

}
