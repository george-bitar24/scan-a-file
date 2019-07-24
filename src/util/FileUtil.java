package util;

import java.io.*;

//lines 20-22 in Main.java
public class FileUtil {

    public FileUtil() {
    }

    private static final String DATA_TEST_TXT = "data\\test.txt";

    private static final File file = new File(DATA_TEST_TXT);

    private FileReader getFileReader () throws FileNotFoundException {
        return new FileReader(file);
    }

    public BufferedReader getBufferedReader() throws FileNotFoundException {
        return new BufferedReader(getFileReader());
    }

    public void closeBufferedReader() throws IOException {
        getBufferedReader().close();
    }

}
