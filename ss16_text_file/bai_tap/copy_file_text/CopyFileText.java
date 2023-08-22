package ss16_text_file.bai_tap.copy_file_text;

import java.io.*;

public class CopyFileText {
    public static int countCharacter(String fileName) throws IOException {
        BufferedReader bufferedReader = null;
        int count = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));
            int character;
            while ((character = bufferedReader.read()) != -1) {
                count++;
            }
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
        return count;
    }
}
