package Colors;

import java.util.*;

public class ColorStore {
    private static Map<String, Color> colorMap =
            new HashMap<String, Color>();
    static {
        colorMap.put("blue", new Blue());
        colorMap.put("black", new Black());
    }

    public static Color getColor(String colorName) throws CloneNotSupportedException {
        return (Color) colorMap.get(colorName).clone();
    }
}
