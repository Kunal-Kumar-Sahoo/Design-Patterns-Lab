package OS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:\n1. Open-source\n2. Secured\n3. General");
        int choice; String choice_;
        switch(sc.nextInt()) {
            case 1 -> choice_ = "open";
            case 2 -> choice_ = "secured";
            default -> choice_ = "general";
        }
        OSBuilder builder = new OSBuilder();
        OS os = builder.build(choice_);
        os.spec();
        sc.close();
    }
}
