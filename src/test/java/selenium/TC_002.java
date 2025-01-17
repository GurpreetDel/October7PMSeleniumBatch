package selenium;

public class TC_002 extends BaseTest
{
	
	
	public static void main(String args[]) throws Exception
	{	
		init();
		launch("chromebrowser");
		navigateUrl("amazonurl");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		navigateUrl("bestbuyurl");
		Thread.sleep(1000);
		//driver.manage().deleteAllCookies();
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		driver.close();
		
		driver.quit();
	}
}
