package OS;

public class OSBuilder {
    public OS build(String choice) {
        OS os;
        switch (choice.toLowerCase()) {
            case "open" -> os = new Android();
            case "secured" -> os = new iOS();
            default -> os = new Windows();
        }

        return os;
    }


}
