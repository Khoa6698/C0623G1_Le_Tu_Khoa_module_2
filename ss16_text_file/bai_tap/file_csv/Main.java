package ss16_text_file.bai_tap.file_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader("countries.csv"));
            while ((line = bufferedReader.readLine())!=null){
                printCountry(parseLine(line));
            }
        }catch (IOException e){
            e.getStackTrace();
        }finally {
            try {
                if (bufferedReader!=null){
                    bufferedReader.close();
                }
            }catch (IOException e){
                e.getStackTrace();
            }
        }
    }

    private static void printCountry(List<String> country){
        System.out.println("Country[" +
                "id=" + country.get(0) +
                ", code='" + country.get(1) +
                ", name='" + country.get(2) +
                "]");
    }

    public static List<String> parseLine(String csvLine){
        List<String> result = new ArrayList<>();
        if(csvLine!=null){
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }
}
