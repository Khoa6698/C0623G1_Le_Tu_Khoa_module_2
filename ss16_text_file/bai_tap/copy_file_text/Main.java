package ss16_text_file.bai_tap.copy_file_text;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Nhap ten tep nguon:");
            String sourceFile = input.readLine();
            System.out.println("Nhap ten tep dich:");
            String targetFile = input.readLine();

            reader = new BufferedReader(new FileReader(sourceFile));
            writer = new BufferedWriter(new FileWriter(targetFile));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

            int count = CopyFileText.countCharacter(sourceFile);
            System.out.println("Ki tu trong tep nguon "+count);

        } catch (FileNotFoundException e) {
            System.out.println("Loi: Tep nguon khong ton tai");
        } catch (IOException e) {
            System.out.println("Loi: Khong the doc/ghi tep");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException ex) {
                System.out.println("Loi: Khong the dong tep");
            }
        }
    }
}
