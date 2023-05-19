package hu.unideb.inf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomePage {

    private static final String PAGE_URL = "https://automationexercise.com/";
    private final WebDriver webDriver;

    private static final Map<String, By> textFields = new HashMap<String, By>() {{
        put("Email Address", By.cssSelector("[data-qa=\"login-email\"]"));
        put("Password", By.cssSelector("[data-qa=\"login-password\"]"));
        put("Name", By.cssSelector("[data-qa=\"signup-name\"]"));
        put("Signup Email Address", By.cssSelector("[data-qa=\"signup-email\"]"));
        put("Signup Password", By.cssSelector("[data-qa=\"password\"]"));
        put("First name", By.cssSelector("[data-qa=\"first_name\"]"));
        put("Last name", By.cssSelector("[data-qa=\"last_name\"]"));
        put("Address", By.cssSelector("[data-qa=\"address\"]"));
        put("State", By.cssSelector("[data-qa=\"state\"]"));
        put("City", By.cssSelector("[data-qa=\"city\"]"));
        put("Zipcode", By.cssSelector("[data-qa=\"zipcode\"]"));
        put("Mobile Number", By.cssSelector("[data-qa=\"mobile_number\"]"));
        put("Product Quantity", By.cssSelector("#quantity"));
        put("Name on Card", By.cssSelector("[data-qa=\"name-on-card\"]"));
        put("Card Number", By.cssSelector("[data-qa=\"card-number\"]"));
        put("CVC", By.cssSelector("[data-qa=\"cvc\"]"));
        put("Expiration Month", By.cssSelector("[data-qa=\"expiry-month\"]"));
        put("Expiration Year", By.cssSelector("[data-qa=\"expiry-year\"]"));
    }};

    private static final Map<String, By> buttons = new HashMap<String, By>() {{
        put("Home", By.cssSelector("a[href=\"/\"]"));
        put("Products", By.cssSelector("a[href=\"/products\"]"));
        put("Cart", By.cssSelector("a[href=\"/view_cart\"]"));
        put("Signup / Login", By.cssSelector("a[href=\"/login\"]"));
        put("Logout", By.cssSelector("a[href=\"/logout\"]"));
        put("Delete Account", By.cssSelector("a[href=\"/delete_account\"]"));
        put("Contact us", By.cssSelector("a[href=\"/contact_us\"]"));
        put("Login", By.cssSelector("[data-qa=\"login-button\"]"));
        put("Signup", By.cssSelector("[data-qa=\"signup-button\"]"));
        put("Create Account", By.cssSelector("[data-qa=\"create-account\"]"));
        put("Continue Shopping", By.cssSelector("[data-dismiss=\"modal\"]"));
        put("View Cart", By.cssSelector("a[href=\"/view_cart\"]"));
        put("Proceed To Checkout", By.cssSelector("a.btn.btn-default.check_out"));
        put("Place Order", By.cssSelector("a[href=\"/payment\"]"));
        put("Pay and Confirm Order", By.cssSelector("[data-qa=\"pay-button\"]"));
        put("Continue", By.cssSelector("[data-qa=\"continue-button\"]"));
        put("Cart Delete", By.cssSelector("a.cart_quantity_delete"));
        put("Add to cart", By.cssSelector("button.btn.btn-default.cart"));
        put("Blue Top Add to cart", By.cssSelector("[data-product-id=\"1\"]"));
        put("Men Tshirt Add to cart", By.cssSelector("[data-product-id=\"2\"]"));
        put("Sleeveless Dress Add to cart", By.cssSelector("[data-product-id=\"3\"]"));
        put("Stylish Dress Add to cart", By.cssSelector("[data-product-id=\"4\"]"));
        put("Winter Top Add to cart", By.cssSelector("[data-product-id=\"5\"]"));
        put("Summer White Top Add to cart", By.cssSelector("[data-product-id=\"6\"]"));
        put("Madame Top For Women View Product", By.cssSelector("a[href=\"/product_details/7\"]"));
        put("Fancy Green Top View Product", By.cssSelector("a[href=\"/product_details/8\"]"));
        put("Sleeves Printed Top - White View Product", By.cssSelector("a[href=\"/product_details/11\"]"));
        put("Half Sleeves Top Schiffli Detailing - Pink View Product", By.cssSelector("a[href=\"/product_details/12\"]"));
    }};

    private static final Map<String, By> messages = new HashMap<String, By>() {{
        put("ACCOUNT CREATED!", By.cssSelector("[data-qa=\"account-created\"] > b"));
        put("Logged in as", By.cssSelector("a:has(i.fa.fa-user)"));
        put("ACCOUNT DELETED!", By.cssSelector("[data-qa=\"account-deleted\"] > b"));
        put("Your email or password is incorrect!", By.cssSelector("[data-qa=\"login-password\"] + p"));
        put("ORDER PLACED!", By.cssSelector("[data-qa=\"order-placed\"]"));
    }};

    private static final Map<String, By> labels = new HashMap<String, By>() {{
        put("Total Amount", By.cssSelector("p.cart_total_price"));
    }};

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void openPage() {
        webDriver.get(PAGE_URL);
        PageFactory.initElements(webDriver, this);
    }

    public void fillOutField(String field, String text) {
        webDriver.findElement(textFields.get(field)).clear();
        webDriver.findElement(textFields.get(field)).sendKeys(text);
    }

    public void clickButton(String button) {
        webDriver.findElement(buttons.get(button)).click();
    }

    public void clickButtons(String button) {
        List<WebElement> webElements = webDriver.findElements(buttons.get(button));
        for(WebElement element : webElements) {
            element.click();
        }
    }

    public String getMessage(String message) {
        if(message.startsWith("Logged in as")) message = "Logged in as";
        return webDriver.findElement(messages.get(message)).getText();
    }

    public String getLabel(String label) {
        if(label.equals("Total Amount")) {
            List<WebElement> webElements = webDriver.findElements(labels.get(label));
            return webElements.get(webElements.size()-1).getText();
        } else {
            return webDriver.findElement(labels.get(label)).getText();
        }
    }
}
