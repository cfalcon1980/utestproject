package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.By;
import userinterface.UTestPage;

public class Record implements Task {

    private String strFname;
    private String strLname;
    private String strEmailAdd;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strCity;
    private String strZipCode;
    private String strCountry;
    private String strYourComputer;
    private String strVersion;
    private String strLanguage;
    private String strYourMobilDevice;
    private String strModel;
    private String strOperatingSystem;
    private String strPassword;
    private String strConfirmPassword;
    private String strCheckCode1;
    private String strCheckCode2;

    public Record(String strFname, String strLname, String strEmailAdd,String strMonth,String strDay,String strYear,String strCity,
                  String strZipCode,String strCountry,String strYourComputer,String strVersion,String strLanguage,
                  String strYourMobilDevice,String strModel,String strOperatingSystem,String strPassword,
                  String strConfirmPassword, String strCheckCode1, String strCheckCode2) {
        this.strFname = strFname;
        this.strLname = strLname;
        this.strEmailAdd = strEmailAdd;
        this.strMonth = strMonth;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strCity = strCity;
        this.strZipCode = strZipCode;
        this.strCountry = strCountry;
        this.strYourComputer = strYourComputer;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strYourMobilDevice = strYourMobilDevice;
        this.strModel = strModel;
        this.strOperatingSystem = strOperatingSystem;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;

    }


   public static Record onThePage(String strFname, String strLname, String strEmailAdd, String strMonth, String strDay, String strYear, String strCity,
                                  String strZipCode, String strCountry, String strYourComputer, String strVersion, String strLanguage,
                                  String strYourMobilDevice, String strModel, String strOperatingSystem, String strPassword,
                                  String strConfirmPassword, String strCheckCode1, String strCheckCode2) {
       return Tasks.instrumented(Record.class,strFname,strLname,strEmailAdd,strMonth,strDay,strYear,strCity,strZipCode,
               strCountry,strYourComputer,strVersion,strLanguage,strYourMobilDevice,
               strModel, strOperatingSystem,strPassword,strConfirmPassword,strCheckCode1,strCheckCode2);
   }

   @Override
   public <T extends Actor> void performAs(T actor){
       actor.attemptsTo(Click.on(UTestPage.JOIN_BUTTON),
               Enter.theValue((strFname)).into(UTestPage.INPUT_FIRST_NAME),
               Enter.theValue((strLname)).into(UTestPage.INPUT_LAST_NAME),
               Enter.theValue((strEmailAdd)).into(UTestPage.INPUT_EMAIL),
               Scroll.to(By.id((strMonth))).andAlignToBottom(UTestPage.INPUT_MONTH),
               Scroll.to(By.id((strDay))).andAlignToBottom(UTestPage.INPUT_DAY),
               Scroll.to(By.id((strYear))).andAlignToBottom(UTestPage.INPUT_YEAR),
               Click.on(UTestPage.NL_BUTTON),
               Enter.theValue((strCity)).into(UTestPage.INPUT_CITY),
               Enter.theValue((strZipCode)).into(UTestPage.INPUT_ZIP_CODE),
               Scroll.to(By.id((strCountry))).andAlignToBottom(UTestPage.INPUT_COUNTRY),
               Click.on(UTestPage.ND_BUTTON),
               Scroll.to(By.id((strYourComputer))).andAlignToBottom(UTestPage.INPUT_COMPUTER),
               Scroll.to(By.id((strVersion))).andAlignToBottom(UTestPage.INPUT_VERSION),
               Scroll.to(By.id((strLanguage))).andAlignToBottom(UTestPage.INPUT_LANGUAGE),
               Scroll.to(By.id((strYourMobilDevice))).andAlignToBottom(UTestPage.INPUT_MOBIL_DEVICE),
               Scroll.to(By.id((strModel))).andAlignToBottom(UTestPage.INPUT_MODEL),
               Scroll.to(By.id((strOperatingSystem))).andAlignToBottom(UTestPage.INPUT_SYSTEM),
               Click.on(UTestPage.NLS_BUTTON),
               Enter.theValue((strPassword)).into(UTestPage.INPUT_PASSWORD),
               Enter.theValue((strConfirmPassword)).into(UTestPage.INPUT_CONFIRM_PASSWORD),
               Click.on(UTestPage.CHECK_CODE_1),
               Click.on(UTestPage.CHECK_CODE_2),
               Click.on(UTestPage.COMPLETE_BUTTON)
       );


   }


   }
