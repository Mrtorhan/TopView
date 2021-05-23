package com.topviewnyc.pages;

import com.topviewnyc.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id=\"navbarNavigation\"]/ul/li[7]")
    public WebElement searchButton;

    @FindBy(id = "desktop-site-search")
    public WebElement searchBox;

    @FindBy(xpath = "//div[4]/h5")
    public WebElement errorMessage;




}

