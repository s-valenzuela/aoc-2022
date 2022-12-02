package se.valenzuela.aoc.d02;

import se.valenzuela.aoc.FileUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class D02Util {

    public static List<EncryptedStrategy> scores() {
        try {
            List<EncryptedStrategy> scores = new ArrayList<>();
            File file = FileUtil.getFile("d02/input-1");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            for (String line; (line = reader.readLine()) != null; ) {
                String[] splitLine = line.split(" ");
                scores.add(new EncryptedStrategy(splitLine[0], splitLine[1]));
            }
            return scores;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
