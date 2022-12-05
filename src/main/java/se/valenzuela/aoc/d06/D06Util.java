package se.valenzuela.aoc.d06;

import se.valenzuela.aoc.FileUtil;
import se.valenzuela.aoc.d05.Movement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D06Util {

    public static List<Movement> movements() {
        try {
            File file = FileUtil.getFile("d06/input-1");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            for (String line; (line = reader.readLine()) != null; ) {
                if (line.startsWith("move")) {
                    //TBD
                }
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
