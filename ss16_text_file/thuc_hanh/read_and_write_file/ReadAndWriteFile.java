package ss16_text_file.thuc_hanh.read_and_write_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> numBer = new ArrayList<>();
        try {
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = ",";
            while ((line = bufferedReader.readLine())!=null){
                numBer.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        }catch (Exception e){
            System.out.println("File khong ton tai");
        }
        return numBer;
    }

    public void writerFile(String filePath,int max){
        try {
            FileWriter fileWriter = new FileWriter(filePath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Gia tri lon nhat = "+max);
            bufferedWriter.close();
        }catch (IOException e){
            e.getStackTrace();
        }
    }
}
