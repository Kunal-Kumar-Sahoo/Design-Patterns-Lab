package Startup;

public class StartupBuilder {
    public Startup setDomain(int domain) {
        switch (domain) {
            case 1 -> {
                return new EdTEch();
            }
            case 2 -> {
                return new FinTech();
            }
        }

        return null;
    }
}
