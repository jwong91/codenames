import java.util.*;
import java.io.*;

public class Util {
    public static final int WORD_COUNT = 25;

    public static String[] importWords(String filename) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream(fileName));
        String[] words = new String[WORD_COUNT];
        int i  = 0;

        while (in.hasNextLine()) {
            words[i] = in.nextLine();
            i++;
        }

        return words;
    }

}
