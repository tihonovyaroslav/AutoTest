import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
import static com.codeborne.selenide.Selenide.*;


public class globalTest {

    private final static String GAME_URL = "http://puzzle.beeline.ru/game/bac?accessToken=J69VBwXn9tj3SLor03syav7qFP2gPejf9LKwwC8wpJxMo5YZH1yJQaYgFLhc";
    private final static String DECISION_URL = "https://slovesnov.users.sourceforge.net/?bullscows_play";

    private final SelenideElement optionCrushBullsCows = $x("//select[@id=\"selectAlgorithm\"] //option");
    private final SelenideElement optionRU = $x("//td[@align=\"right\"] //a");
    private final SelenideElement number_1 = $x("//table[@id=\"tbl\"]/tbody/tr[3]/td[2]");
    private final SelenideElement number_2 = $x("//table[@id=\"tbl\"]/tbody/tr[4]/td[2]");
    private final SelenideElement number_3 = $x("//table[@id=\"tbl\"]/tbody/tr[5]/td[2]");
    private final SelenideElement number_4 = $x("//table[@id=\"tbl\"]/tbody/tr[6]/td[2]");
    private final SelenideElement number_5 = $x("//table[@id=\"tbl\"]/tbody/tr[7]/td[2]");
    private final SelenideElement number_6 = $x("//table[@id=\"tbl\"]/tbody/tr[8]/td[2]");
    private final SelenideElement number_7 = $x("//table[@id=\"tbl\"]/tbody/tr[9]/td[2]");
    private final SelenideElement startGames = $x("//a[@class=\"btn btn-yellow big\"]");
    private final SelenideElement numberInput = $x("//input[@id=\"bac-answer\"]");
    private final SelenideElement checkButton = $x("//a[@class=\"btn btn-yellow bac-check loadable\"]");
    private final SelenideElement endGameButton = $x("//a[@class=\"btn btn-yellow\"]");
    private final SelenideElement greenNumber = $x("//div[@class=\"popup-text\"] //span[@class=\"green inline\"]");
    private final SelenideElement redNumber = $x("//div[@class=\"popup-text\"] //span[@class=\"red inline\"]");
    private final SelenideElement resumeButton = $x("//button[@class=\"btn btn-yellow big close-popup\"]");
    private final SelenideElement greenNumberInput_1 = $x("//input[@id=\"i20\"]");
    private final SelenideElement greenNumberInput_2 = $x("//input[@id=\"i30\"]");
    private final SelenideElement greenNumberInput_3 = $x("//input[@id=\"i40\"]");
    private final SelenideElement greenNumberInput_4 = $x("//input[@id=\"i50\"]");
    private final SelenideElement greenNumberInput_5 = $x("//input[@id=\"i60\"]");
    private final SelenideElement greenNumberInput_6 = $x("//input[@id=\"i70\"]");
    private final SelenideElement redNumberInput_1 = $x("//input[@id=\"i21\"]");
    private final SelenideElement redNumberInput_2 = $x("//input[@id=\"i31\"]");
    private final SelenideElement redNumberInput_3 = $x("//input[@id=\"i41\"]");
    private final SelenideElement redNumberInput_4 = $x("//input[@id=\"i51\"]");
    private final SelenideElement redNumberInput_5 = $x("//input[@id=\"i61\"]");
    private final SelenideElement redNumberInput_6 = $x("//input[@id=\"i71\"]");
    private final SelenideElement inputButton_1 = $x("//*[@id=\"tbl\"]/tbody/tr[3]/td[5]/input");
    private final SelenideElement inputButton_2 = $x("//*[@id=\"tbl\"]/tbody/tr[4]/td[5]/input");
    private final SelenideElement inputButton_3 = $x("//*[@id=\"tbl\"]/tbody/tr[5]/td[5]/input");
    private final SelenideElement inputButton_4 = $x("//*[@id=\"tbl\"]/tbody/tr[6]/td[5]/input");
    private final SelenideElement inputButton_5 = $x("//*[@id=\"tbl\"]/tbody/tr[7]/td[5]/input");
    private final SelenideElement inputButton_6 = $x("//*[@id=\"tbl\"]/tbody/tr[8]/td[5]/input");
    private final SelenideElement endGameNumber = $x("//td[@colspan=\"4\"]");
    private final SelenideElement newGame = $x("//input[@id=\"prestart\"]");


    public void clickOptionCrushBullsCows(){
        optionRU.click();
        optionCrushBullsCows.click();
    }
    String getTextNumber;
    String  getGreenNumber;
    String  getRedNumber;
    String  valueEndGameNumber;

    public void clickStartGames(){ startGames.click();}
    public void guessingStep(){
        numberInput.sendKeys(getTextNumber);
        checkButton.click();
        if (endGameButton.isDisplayed()) {
            endGameButton.click();
        }
        getGreenNumber = greenNumber.innerHtml();
        getRedNumber = redNumber.innerHtml();
        System.out.println(getGreenNumber +" "+getRedNumber);
        resumeButton.click();
        switchTo().window(1);
    }

   public void verificationStep(){
        if (endGameNumber.isDisplayed()) {
            valueEndGameNumber = endGameNumber.getText();
            valueEndGameNumber = valueEndGameNumber.replaceAll("\\D+","");
            newGame.click();
            switchTo().window(0);
            numberInput.sendKeys(valueEndGameNumber);
            checkButton.click();
            endGameButton.click();
        }
    }

    @Test
    public void checkHref(){
        open(GAME_URL);
        Robot r = null;
        try {
            r = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_T);
        switchTo().window(1);
        open(DECISION_URL);
        clickOptionCrushBullsCows();
        getTextNumber = number_1.innerHtml();
        switchTo().window(0);
        clickStartGames();
        guessingStep();
        greenNumberInput_1.sendKeys(getGreenNumber);
        redNumberInput_1.sendKeys(getRedNumber);
        inputButton_1.click();
        verificationStep();
        getTextNumber = number_2.innerHtml();
        switchTo().window(0);
        guessingStep();
        greenNumberInput_2.sendKeys(getGreenNumber);
        redNumberInput_2.sendKeys(getRedNumber);
        inputButton_2.click();
        verificationStep();
        getTextNumber = number_3.innerHtml();
        switchTo().window(0);
        guessingStep();
        greenNumberInput_3.sendKeys(getGreenNumber);
        redNumberInput_3.sendKeys(getRedNumber);
        inputButton_3.click();
        verificationStep();
        getTextNumber = number_4.innerHtml();
        switchTo().window(0);
        guessingStep();
        greenNumberInput_4.sendKeys(getGreenNumber);
        redNumberInput_4.sendKeys(getRedNumber);
        inputButton_4.click();
        verificationStep();
        getTextNumber = number_5.innerHtml();
        switchTo().window(0);
        guessingStep();
        greenNumberInput_5.sendKeys(getGreenNumber);
        redNumberInput_5.sendKeys(getRedNumber);
        inputButton_5.click();
        verificationStep();
        getTextNumber = number_6.innerHtml();
        switchTo().window(0);
        guessingStep();
        greenNumberInput_6.sendKeys(getGreenNumber);
        redNumberInput_6.sendKeys(getRedNumber);
        inputButton_6.click();
        verificationStep();
        getTextNumber = number_7.innerHtml();
        switchTo().window(0);
    }
}
