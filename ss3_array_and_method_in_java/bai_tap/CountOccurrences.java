package ss3_array_and_method_in_java.bai_tap;

public class CountOccurrences {
    public static void main(String[] args) {
        String sample = "aaabbbccc";
        char sample2 = 'a';
        int count = 0;
        for (int i = 0; i < sample.length(); i++) {
            if (sample.charAt(i) == sample2) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của kí tự " + sample2 + " là: " + count);
    }
}
