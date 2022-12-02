package se.valenzuela.aoc.d03;

import se.valenzuela.aoc.FileUtil;
import se.valenzuela.aoc.d02.EncryptedStrategy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class D03Util {

    public static List<Void> scores() {
        try {
            List<Void> scores = new ArrayList<>();
            File file = FileUtil.getFile("d03/input-1");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            for (String line; (line = reader.readLine()) != null; ) {

            }
            return scores;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
