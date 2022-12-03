package se.valenzuela.aoc.d04;

import se.valenzuela.aoc.FileUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class D04Util {

    public static List<Void> change() {
        try {
            List<Void> rucksacks = new ArrayList<>();
            File file = FileUtil.getFile("d03/input-1");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            for (String line; (line = reader.readLine()) != null; ) {
                //TBD
            }
            return rucksacks;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
