import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**

public class MainPage {
    private final SelenideElement startButton = $x("//a[@class='btn btn-yellow big']");
    private final SelenideElement textWordInput = $x("//input[@name='check']");
    private final SelenideElement checkButton = $x("//input[@value='Проверить']");
    private final SelenideElement checkLetterButton = $x("//button[@class='btn btn-yellow big close-popup']");
    private final SelenideElement resumeButton = $x("//button[@class='btn btn-yellow big close-popup']");
    private final SelenideElement textLetterInput = $x("//input[@maxlength='1']");
    private final SelenideElement stopButton = $x("//a[@class='btn btn-yellow']");
    private final SelenideElement checkResult = $x("//div[@class='popup-text']");
    private final SelenideElement checkStop = $x("//a[@class='btn btn-yellow']");
    private final SelenideElement Button = $x("//a[@class='btn btn-yellow open-hide big2']");


    public MainPage (String url){
        Selenide.open(url);
    }

    public void clickStart(){
        startButton.click();
    }

    public void clickButton(){
        Button.click();
    } //

    public void clickCheck(){
        checkButton.click();
    }

    public void clickResume(){
        resumeButton.click();
    }

    public void clickStop(){
        stopButton.click();
    }

    public void checkLetter(){
        checkLetterButton.click();
    }

    public void inputWord(String inputText){
        textWordInput.setValue(inputText);
    }

    public void inputLetter(String inputText){
        textLetterInput.setValue(inputText);
    }
 */