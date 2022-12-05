package se.valenzuela.aoc.d05;

import se.valenzuela.aoc.FileUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D05Util {

    static Pattern pattern = Pattern.compile("^move (\\d*) from (\\d) to (\\d)$");

    public static List<Movement> movements() {
        try {
            List<Movement> movements = new ArrayList<>();
            File file = FileUtil.getFile("d05/input-1");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            for (String line; (line = reader.readLine()) != null; ) {
                if (line.startsWith("move")) {
                    Matcher matcher = pattern.matcher(line);
                    matcher.matches();
                    int quantity = Integer.parseInt(matcher.group(1));
                    int from = Integer.parseInt(matcher.group(2));
                    int to = Integer.parseInt(matcher.group(3));
                    movements.add(new Movement(quantity, from, to));
                }
            }
            return movements;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
