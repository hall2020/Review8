package class19;

class Browser{
    void get(String url) {
        System.out.println("Loading... " + url+" in Browser");
    }
    void performTest() {
        System.out.println("Checking if website is working properly Browser");
    }
    void closeBrowser() {
        System.out.println("Closing the browser");
    }
}

public class Chrome extends Browser {

    void get(String url) {
        System.out.println("Loading... " + url);
    }

    void performTest() {
        System.out.println("Checking if website is working properly in chrome");
    }

    void closeBrowser() {
        System.out.println("Closing the google chrome browser");
    }
}

class FireFox extends Browser{
    void get(String url) {
        System.out.println("Loading... " + url+" in firefox");
    }

    void performTest() {
        System.out.println("Checking if website is working properly in firefox");
    }

    void closeBrowser() {
        System.out.println("Closing the google firefox browser");
    }
}
class Edge extends Browser{
    void get(String url) {
        System.out.println("Loading... " + url+" in Edge");
    }

    void performTest() {
        System.out.println("Checking if website is working properly in Edge");
    }

    void closeBrowser() {
        System.out.println("Closing the google Edge browser");
    }
}
class Safari extends Browser{
    void get(String url) {
        System.out.println("Loading... " + url+ " in Safari");
    }

    void performTest() {
        System.out.println("Checking if website is working properly in Safari");
    }

    void closeBrowser() {
        System.out.println("Closing the google safari browser");
    }
}
