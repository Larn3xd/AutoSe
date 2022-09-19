import io.netty.handler.codec.spdy.DefaultSpdySettingsFrame;
import net.bytebuddy.matcher.ElementMatcher;
import org.apache.commons.exec.CommandLine;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test1;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import javax.xml.stream.events.EntityReference;
import javax.xml.xpath.XPath;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test {

    public static WebDriver driver;

    @BeforeClass
    public static void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/yandexdriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://test01/Admission.aspx");
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        auth();
    }

    public static void auth() throws InterruptedException {
        WebElement login = driver.findElement(By.xpath("//*[@id=\"loginName\"]"));
        login.click();
        login.sendKeys("adm2@mial.ru");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.click();
        password.sendKeys("123");
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]"));
        submit.click();
    }

    public void request() throws InterruptedException {
        WebElement requestButton = driver.findElement(By.xpath("//*[@id=\"ucPageHeader_liCreatePRSingleLink\"]/a"));
        requestButton.click();
    }

    //Заполнение заявки.
    @org.junit.Test
    public void test1() throws InterruptedException, AWTException, IOException {
        makeRequestnew();
    }

    public void makeRequestnew() throws InterruptedException, AWTException, IOException {

        WebElement typeofAccess = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_GluPassType_I\"]"));
        typeofAccess.click();
        typeofAccess.sendKeys("Пропуск физ.лица");

        WebElement secondName = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_TbxLastName_I\"]"));
        secondName.click();
        secondName.sendKeys("Тестовый6");

        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_TbxFirstName_I\"]"));
        firstName.click();
        firstName.sendKeys("Тест");

        WebElement middleName = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_TbxMiddleName_I\"]"));
        middleName.click();
        middleName.sendKeys("Проверка");

        WebElement typeofDocument = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbxIdentityCardType_I\"]"));
        typeofDocument.click();
        typeofDocument.sendKeys("Паспорт");

        WebElement seriesAndNumber = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_TbxIdentityCardNumber_I\"]"));
        seriesAndNumber.click();
        seriesAndNumber.sendKeys("8454 695854");

        WebElement countryPassport = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbxCountry_I\"]"));
        countryPassport.click();
        countryPassport.sendKeys("Россия");
        driver.findElement(By.xpath("//*[@id=\"panel-editors\"]/h3")).click();

        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_GluBuildingObject_B-1\"]")).click();
        Thread.sleep(1000);
        WebElement object = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_GluBuildingObject_DDD_gv_DXFREditorcol0_I\"]"));
        object.click();
        object.sendKeys("Больница Склифосовского (паталого-анатомическое отделение)");
        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_GluBuildingObject_DDD_gv_DXDataRow0\"]/td[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_GluBuildingObject_CapC\"]/label")).click();

        WebElement birthDate = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_DEBirthDay_I\"]"));
        birthDate.click();
        birthDate.sendKeys("04.06.1994");

        WebElement birthPlace = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_TbxBirthPlace_I\"]"));
        birthPlace.click();
        birthPlace.sendKeys("Россия, г. Москва, ул. Авимоторная, д. 7-32г");

        WebElement residence = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_TbxDomicile_I\"]"));
        residence.click();
        residence.sendKeys("Россия, г. Москва, ул. Авимоторная, д. 7-32г");

        WebElement workPlace = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_TbxWorkPlace_I\"]"));
        workPlace.click();
        workPlace.sendKeys("Лабы");

        WebElement post = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_TbxPost_I\"]"));
        post.click();
        post.sendKeys("Сист. администратор");

        WebElement accessTime = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_ChkIsDurable_S_D\"]"));
        accessTime.click();

        WebElement dateofEnter = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_DEStart_I\"]"));
        dateofEnter.click();
        dateofEnter.sendKeys("29.08.2022");

        WebElement dateofEnd = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_DEEnd_I\"]"));
        dateofEnd.click();
        dateofEnd.sendKeys("30.09.2022");

        WebElement objective = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_TbxObjective_I\"]"));
        objective.click();
        objective.sendKeys("Работа");

        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_PhotoUploader_UploadPhoto_CD\"]")).click();
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "111.jpg";
        StringSelection ss = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        Robot robot = new Robot();
        robot.delay(250);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(50);
        robot.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_PhotoUploader_popupcrop_btnSaveCroppedData_CD\"]")).click();

        WebElement create = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_BtnCreate\"]"));
        create.click();
        driver.findElement(By.xpath("//*[@id=\"form1\"]/div[10]/div/div/div/div[2]/div[2]/div/a")).click();

    }

    @org.junit.Test
    public void test2() throws InterruptedException, AWTException, IOException {
        makeRequestdouble();
    }

    public void makeRequestdouble() throws InterruptedException, AWTException, IOException {
        WebElement typeofAccess = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_GluPassType_I\"]"));
        typeofAccess.click();
        typeofAccess.sendKeys("Пропуск физ.лица");

        WebElement secondName = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_TbxLastName_I\"]"));
        secondName.click();
        secondName.sendKeys("Тестовый6");

        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_TbxFirstName_I\"]"));
        firstName.click();
        firstName.sendKeys("Тест");

        WebElement middleName = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_TbxMiddleName_I\"]"));
        middleName.click();
        middleName.sendKeys("Проверка");

        WebElement typeofDocument = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbxIdentityCardType_I\"]"));
        typeofDocument.click();
        typeofDocument.sendKeys("Паспорт");

        WebElement seriesAndNumber = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_TbxIdentityCardNumber_I\"]"));
        seriesAndNumber.click();
        seriesAndNumber.sendKeys("8454 695854");

        WebElement countryPassport = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbxCountry_I\"]"));
        countryPassport.click();
        countryPassport.sendKeys("Россия");
        driver.findElement(By.xpath("//*[@id=\"panel-editors\"]/h3")).click();

        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_GluBuildingObject_B-1\"]")).click();
        Thread.sleep(1000);
        WebElement object = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_GluBuildingObject_DDD_gv_DXFREditorcol0_I\"]"));
        object.click();
        object.sendKeys("Больница Склифосовского (паталого-анатомическое отделение)");
        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_GluBuildingObject_DDD_gv_DXDataRow0\"]/td[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_GluBuildingObject_CapC\"]/label")).click();

        WebElement birthDate = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_DEBirthDay_I\"]"));
        birthDate.click();
        birthDate.sendKeys("04.06.1994");

        WebElement birthPlace = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_TbxBirthPlace_I\"]"));
        birthPlace.click();
        birthPlace.sendKeys("Россия, г. Москва, ул. Авимоторная, д. 7-32г");

        WebElement residence = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_TbxDomicile_I\"]"));
        residence.click();
        residence.sendKeys("Россия, г. Москва, ул. Авимоторная, д. 7-32г");

        WebElement workPlace = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_TbxWorkPlace_I\"]"));
        workPlace.click();
        workPlace.sendKeys("Лабы");

        WebElement post = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_TbxPost_I\"]"));
        post.click();
        post.sendKeys("Сист. администратор");

        WebElement accessTime = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_ChkIsDurable_S_D\"]"));
        accessTime.click();

        WebElement dateofEnter = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_DEStart_I\"]"));
        dateofEnter.click();
        dateofEnter.sendKeys("29.08.2022");

        WebElement dateofEnd = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_CbBuildingObject_DEEnd_I\"]"));
        dateofEnd.click();
        dateofEnd.sendKeys("30.09.2022");

        WebElement objective = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_TbxObjective_I\"]"));
        objective.click();
        objective.sendKeys("Работа");

        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_PhotoUploader_UploadPhoto_CD\"]")).click();
        String filePath1 = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "111.jpg";
        StringSelection ss = new StringSelection(filePath1);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        Robot robot = new Robot();
        robot.delay(250);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(50);
        robot.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_PhotoUploader_popupcrop_btnSaveCroppedData_CD\"]")).click();

        By BUTTON = By.xpath("//div[@class='dxb'][@id='ContentPlaceHolder1_From_PopupCombainPassRequest_BtnCancelMergepopupCombainPassRequest_CD']");

        WebElement create = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_From_BtnCreate\"]"));
        create.click();


        // Условие: заявка новая ли или дубликат?

        try {
            if (driver.findElement(BUTTON).getText().contains("Отменить")) {
                driver.findElement(BUTTON).click();
                driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucPageHeader_liRegistryPR\"]/a")).click();
                WebElement name1 = driver.findElement(By.xpath("//*[@id=\"CbPanelGVPassRequest_gvPassRequests_DXFREditorcol4_I\"]"));
                name1.click();
                name1.sendKeys("Тестовый6 Тест Проверка");
                Robot robot2 = new Robot();
                robot2.delay(250);
                robot2.keyPress(KeyEvent.VK_ENTER);
                robot2.keyRelease(KeyEvent.VK_ENTER);
                Thread.sleep(10000);
                WebElement inputName = driver.findElement(By.xpath("//*[@id=\"CbPanelGVPassRequest_gvPassRequests_DXDataRow0\"]/td[7]"));
                if (inputName.getText().contains("Тестовый6 Тест Проверка")) {
                    System.out.println("Name has been found.");
                }
            }
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("Request has already been created.");
        }
    }

    @org.junit.Test
    public void test3() throws InterruptedException, AWTException {
        acceptDeclineReq();
    }

    public void acceptDeclineReq() throws InterruptedException {
        try {
            WebElement number2 = driver.findElement(By.xpath("//*[@id=\"CbPanelGVPassRequest_gvPassRequests_DXDataRow0\"]/td[7]"));
            if (number2.getText().contains("Тестовый6 Тест Проверка")) {
                WebElement endDate = driver.findElement(By.xpath("//*[@id=\"CbPanelGVPassRequest_gvPassRequests_DXDataRow0\"]/td[3]"));
                String endDate1 = String.valueOf(endDate.getText().contains("30.09.2022"));
                Date dateNow = new Date();
                SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");
                if (endDate1.equals(formatForDateNow(dateNow))) {
                    driver.findElement(By.xpath("//*[@id=\"CbPanelGVPassRequest_gvPassRequests_DXSelBtn0_D\"]")).click();
                    driver.findElement(By.xpath("//*[@id=\"btnaction\"]/button[2]")).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[@id=\"btnCancelSelected_CD\"]")).click();
                    Thread.sleep(9000);
                    Actions action = new Actions(driver);
                    action.moveToElement(driver.findElement(By.xpath("//*[@id=\"CbPanelGVPassRequest_gvPassRequests_DXDataRow0\"]/td[4]"))).doubleClick().perform();
                } else {
                    driver.findElement(By.xpath("//*[@id=\"CbPanelGVPassRequest_gvPassRequests_DXSelBtn0_D\"]")).click();
                    driver.findElement((By.xpath("//*[@id=\"btnaction\"]/button[2]"))).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[@id=\"btnAcceptSelected_CD\"]")).click();
                    Thread.sleep(9000);
                    Actions action2 = new Actions(driver);
                    action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"CbPanelGVPassRequest_gvPassRequests_DXDataRow0\"]/td[4]"))).doubleClick().perform();
                }
            }
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("Failed to found. This request is expired.");
        }
    }

    /*
                if (number2.getText().contains("Y7S202CMX8")) {
                WebElement endDate = driver.findElement(By.xpath("//*[@id=\"CbPanelGVPassRequest_gvPassRequests_DXDataRow0\"]/td[3]"));
                String endDate1 = String.valueOf(endDate.getText().contains("30.09.2022"));
                Date dateNow = new Date();
                SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");
                if (endDate1.equals(formatForDateNow(dateNow))) {
                    driver.findElement(By.xpath("//*[@id=\"CbPanelGVPassRequest_gvPassRequests_DXSelBtn0_D\"]")).click();
                    driver.findElement(By.xpath("//*[@id=\"btnaction\"]/button[2]")).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[@id=\"btnCancelSelected_CD\"]")).click();
                } else {
                    driver.findElement(By.xpath("//*[@id=\"CbPanelGVPassRequest_gvPassRequests_DXSelBtn0_D\"]")).click();
                    driver.findElement((By.xpath("//*[@id=\"btnaction\"]/button[2]"))).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[@id=\"btnAcceptSelected_CD\"]")).click();
                }
            }
     */
    private String formatForDateNow(Date dateNow) {
        return null;
    }
}
