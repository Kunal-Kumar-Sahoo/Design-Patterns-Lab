package MobileShop;

import java.util.ArrayList;

public class Shopkeeper {
    private MobileShop iphone, samsung, nokia;

    public Shopkeeper() {
        iphone = new IPhone();
        samsung = new Samsung();
        nokia = new Nokia();
    }

    String[] getDetails(PhoneType phoneType) {
        switch(phoneType) {
            case iPhone:
                return new String[] {iphone.getMobileModelNumber(), iphone.getMobilePrice()};
            case Samsung:
                return new String[] {samsung.getMobileModelNumber(), samsung.getMobilePrice()};
            case Nokia:
                return new String[] {nokia.getMobileModelNumber(), nokia.getMobilePrice()};
        } return null;
    }
}