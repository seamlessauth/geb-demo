import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

waiting {
    timeout = 20
}

environments {

    chrome { driver = { new ChromeDriver() }}

    firefox { driver = { new FirefoxDriver() }}
}