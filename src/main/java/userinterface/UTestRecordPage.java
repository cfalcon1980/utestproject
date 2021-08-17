package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestRecordPage {

    public static final Target JOIN_BUTTON = Target.the("button that shows us the form record")
            .located(By.xpath("//div[@class='unauthenticated-container']//strong[contains(text(),'JoinToday')]"));
    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.id("email"));
    public static final Target INPUT_MONTH = Target.the("where do we write the month")
            .located(By.id("birthMonth"));
    public static final Target INPUT_DAY = Target.the("where do we write the day")
            .located(By.id("birthDay"));
    public static final Target INPUT_YEAR = Target.the("where do we write the year")
            .located(By.id("birthMonth"));
    public static final Target NL_BUTTON = Target.the("button to confirm next location")
            .located(By.xpath("//button[contains(@class,'btn btn-blue')]"));
    public static final Target INPUT_CITY = Target.the("where do we write the city")
            .located(By.id("city"));
    public static final Target INPUT_ZIP_CODE = Target.the("where do we write the zip code")
            .located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the("where do we write the country")
            .located(By.id("countryId"));
    public static final Target ND_BUTTON = Target.the("button to confirm next devices")
            .located(By.xpath("//button[contains(@class,'btn btn-blue pull-right')]"));
    public static final Target INPUT_COMPUTER = Target.the("where do we select the computer")
            .located(By.id("city"));
    public static final Target INPUT_VERSION = Target.the("where do we select the zip version")
            .located(By.id("zip"));
    public static final Target INPUT_LANGUAGE = Target.the("where do we select the language")
            .located(By.id("countryId"));
    public static final Target INPUT_MOBIL_DEVICE = Target.the("where do we write the mobil device")
            .located(By.id("city"));
    public static final Target INPUT_MODEL = Target.the("where do we write the model")
            .located(By.id("zip"));
    public static final Target INPUT_SYSTEM = Target.the("where do we write the system")
            .located(By.id("countryId"));
    public static final Target NLS_BUTTON = Target.the("button to confirm next last step")
            .located(By.xpath("//button[contains(@class,'btn btn-blue pull-right')]"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where do confirm the password")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_CODE_1 = Target.the("button to confirm next last step")
            .located(By.xpath("//button[contains(@class,'checkmark signup-consent__checkbox signup-consent__checkbox--highlight')]"));
    public static final Target CHECK_CODE_2 = Target.the("button to confirm next last step")
            .located(By.xpath("//button[contains(@class,'checkmark signup-consent__checkbox error')]"));
    public static final Target COMPLETE_BUTTON = Target.the("button to confirm next last step")
            .located(By.xpath("//button[contains(@class,'btn btn-blue')]"));

}
