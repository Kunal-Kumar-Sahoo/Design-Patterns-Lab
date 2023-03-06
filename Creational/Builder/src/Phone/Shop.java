package Phone;

public class Shop {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setOS("Android").setBattery(5000).setProcessor("snapdragon 8").
                setRAM(8).setScreensize(6.6f).getPhone();
        System.out.println(phone);
    }
}
