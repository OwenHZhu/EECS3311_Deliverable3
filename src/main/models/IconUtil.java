package main.models;

import javax.swing.ImageIcon;
import java.net.URL;

public final class IconUtil {
    private IconUtil() {}

    public static ImageIcon loadIcon(String resourcePath) {
        URL url = IconUtil.class.getResource(resourcePath);
        if (url == null) {
            return null;
        }
        return new ImageIcon(url);
    }
}

