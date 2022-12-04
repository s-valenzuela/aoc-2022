package se.valenzuela.aoc.d05;

import se.valenzuela.aoc.FileUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class D05Util {

    public static List<Void> change() {
        try {
            List<Void> assignments = new ArrayList<>();
            File file = FileUtil.getFile("d05/test-input-1");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            for (String line; (line = reader.readLine()) != null; ) {
                //TBD
            }
            return assignments;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
