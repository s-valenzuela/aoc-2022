package se.valenzuela.aoc;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

public class FileUtil {

    public static File getFile(String file) throws URISyntaxException {
        URL resource = FileUtil.class.getClassLoader().getResource(file);
        return new File(resource.toURI());
    }
}
