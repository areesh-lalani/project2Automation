package dev.marker.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateRoutinePage {

    private WebDriver driver;

    public CreateRoutinePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //temp ids --- NOT YET IMPL ---
    @FindBy(id = "navlogout")
    public WebElement logout;

    @FindBy(id = "routinename")
    public WebElement routineName;

    @FindBy(id = "inputexercise")
    public WebElement exercise;

    @FindBy(id = "addexercisebtn")
    public WebElement add;

    @FindBy(id = "create")
    public WebElement create;

    @FindBy(id = "navhome")
    public WebElement home;

    @FindBy(id = "filterdropdown")
    public WebElement typeFilter;

    @FindBy(id = "datescheduled")
    public WebElement date;
}
