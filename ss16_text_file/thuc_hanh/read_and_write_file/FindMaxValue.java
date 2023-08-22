package ss16_text_file.thuc_hanh.read_and_write_file;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if(max<numbers.get(i)){
                max=numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("C:\\Users\\admin\\IdeaProjects\\module2\\src\\ss16_text_file\\thuc_hanh\\read_and_write_file\\numbers.text");
        int maxValue = findMax(numbers);
        readAndWriteFile.readFile("C:\\Users\\admin\\IdeaProjects\\module2\\src\\ss16_text_file\\thuc_hanh\\read_and_write_file\\file.text");
    }
}
