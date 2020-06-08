package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

/*
* Một số điểm cần lưu ý:
* - download chromedriver: https://sites.google.com/a/chromium.org/chromedriver/downloads
* (Quan trọng: Chọn chromedriver phù hợp phiên bản Chrome đang dùng)
* - download selenium client for java: https://selenium-release.storage.googleapis.com/3.141/selenium-java-3.141.59.zip
* - Sau khi download selenium client, giải nén.
* - Mở eclipse -> Tạo java project -> import toàn bộ *.jar của selenium client vừa giải nén.
* Hướng dẫn: Search google "eclipse import jar files" 
*/

public class Survey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
		// C:\SeleniumDrivers\chromedriver.exe là đường dẫn chứa chromedriver
		WebDriver driver = new ChromeDriver();
		// Đường link đến trang web đánh giá giảng viên đại học
		driver.get("https://teaching-quality-survey.tdtu.edu.vn/");
		driver.manage().window().maximize();
		//Nhập mssv vào MSSV
		driver.findElement(By.xpath("//*[@id=\"txtUser\"]")).sendKeys("MSSV");
		//Nhập mật khẩu vào Password
		driver.findElement(By.xpath("//*[@id=\"txtPass\"]")).sendKeys("Password");
		driver.findElement(By.xpath("//*[@id=\"txtPass\"]")).sendKeys(Keys.ENTER);
		// i < 15 với 15 là số lớn hơn hoặc bằng mục cần đánh giá
		for (int i = 1; i < 15; i++) {
			// xpath của đường link dẫn đến thông tin giáo viên cần đánh giá
			driver.findElement(By.xpath("//*[@id=\"gvMonHoc\"]/tbody/tr["+i+"]/td[8]/a")).click();
			// xpath của checkbox cần chọn
			driver.findElement(By.xpath("//*[@id=\"gv1_rd4_0\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"gv1_rd5_1\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"gv1_rd4_2\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"gv2_rd4_0\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"gv2_rd4_1\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"gv2_rd5_2\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"gv3_rd4_0\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"gv3_rd5_1\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"gv3_rd4_2\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"gv3_rd4_3\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"gv3_rd4_4\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"gv3_rd5_5\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"gv3_rd4_6\"]")).click();		
			driver.findElement(By.xpath("//*[@id=\"gv4_rd4_0\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"gv4_rd5_1\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"gv5_rd4_0\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"gv5_rd4_1\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"gv5_rd5_2\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"gv5_rd4_3\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"gv5_rd5_4\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"gv7_rd4_0\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnTiepTuc\"]")).click();
			// xpath của nút submit
			driver.findElement(By.xpath("//*[@id=\"btnTiepTucDanhGia\"]")).click();
		}	
		
	}
	
}
