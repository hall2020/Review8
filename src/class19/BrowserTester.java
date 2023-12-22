package class19;

public class BrowserTester {
    public static void main(String[] args) {
        Chrome chrome=new Chrome();
        chrome.get("https://Amazon.com");
        chrome.performTest();
        chrome.closeBrowser();

        FireFox fireFox=new FireFox();
        fireFox.get("https://Amazon.com");
        fireFox.performTest();
        fireFox.closeBrowser();

        Safari safari=new Safari();
        safari.get("https://Amazon.com");
        safari.performTest();
        safari.closeBrowser();

        Edge edge=new Edge();
        edge.get("https://Amazon.com");
        edge.performTest();
        edge.closeBrowser();

        //we can do above long code very short using poly
        //just like below.!!

        System.out.println();
        System.out.println();

        //Array that holds the objects of all browsers.

        Browser[] bArr={chrome,fireFox,safari,edge};
        //A loop that picks all the objects one by one from array
        //places it inside b variable.

        for (int i = 0; i <bArr.length; i++) {
            Browser b=bArr[i];
            b.get("https://Amazon.com");
            b.performTest();
            b.closeBrowser();
        }
    }
}

