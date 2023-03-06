package MobileShop;

public class IPhone implements MobileShop {
    @Override
    public String getMobileModelNumber() {
        return "iPhone 13";
    }

    @Override
    public String getMobilePrice() {
        return "75000";
    }
}
