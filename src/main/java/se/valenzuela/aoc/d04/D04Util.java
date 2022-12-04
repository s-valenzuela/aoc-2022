package se.valenzuela.aoc.d04;

import se.valenzuela.aoc.FileUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class D04Util {

    public static List<Assignment> assignments() {
        try {
            List<Assignment> assignments = new ArrayList<>();
            File file = FileUtil.getFile("d04/input-1");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            for (String line; (line = reader.readLine()) != null; ) {
                assignments.add(new Assignment(line));
            }
            return assignments;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
