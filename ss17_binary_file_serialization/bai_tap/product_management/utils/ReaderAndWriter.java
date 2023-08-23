package ss16_binary_file_serialization.bai_tap.product_management.utils;

import ss16_binary_file_serialization.bai_tap.product_management.model.entity.ProductManagement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriter {
    public static List<String> reader(String filePath){
        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String> productList = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine())!=null){
                productList.add(line);
            }

        } catch (FileNotFoundException  e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return productList;
    }

    public static void writer(String filePath, List<String> listString){
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String p : listString){
                bufferedWriter.write(p);
                bufferedWriter.newLine();
            }

    } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
