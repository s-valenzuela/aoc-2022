package se.valenzuela.aoc.d01;

import se.valenzuela.aoc.FileUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class D01Util {
    public static List<Integer> elves() {
        try {
            List<Integer> elves = new ArrayList<>();
            File file = FileUtil.getFile("d01/input-1");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            int currentLoad = 0;
            for (String line; (line = reader.readLine()) != null; ) {
                if (line.isEmpty()) {
                    elves.add(currentLoad);
                    currentLoad = 0;
                } else {
                    currentLoad += Integer.parseInt(line);
                }
            }
            return elves;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
