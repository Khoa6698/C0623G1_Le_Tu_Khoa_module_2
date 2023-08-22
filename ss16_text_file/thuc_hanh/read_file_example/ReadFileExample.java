package ss16_text_file.thuc_hanh.read_file_example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    public void readFileExample(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = ",";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tong= " + sum);
        } catch (Exception e) {
            System.out.println("file khong ton tai");
        }
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\admin\\IdeaProjects\\module2\\src\\ss16_text_file\\thuc_hanh\\read_file_example\\file.csv";
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileExample(path);
    }

}
