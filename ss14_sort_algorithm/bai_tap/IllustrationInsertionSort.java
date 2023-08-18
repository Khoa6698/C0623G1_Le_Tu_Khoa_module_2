package ss14_sort_algorithm.bai_tap;

public class IllustrationInsertionSort {

    // phương thức sắp xếp chèn.
    void sort(int[] array){
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && array[j]>key){
                array[j+1] = array[j];
                j = j -1;
            }
            array[j+1]=key;
        }
    }
//   in các phần tử của mảng
    static  void printArray(int[] array){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {5,8,23,67,88,4,9};
        System.out.println("Mang ban dau la:");
        printArray(array);
        System.out.println();
        IllustrationInsertionSort illustrationInsertionSort = new IllustrationInsertionSort();
        illustrationInsertionSort.sort(array);
        System.out.println("Mang sau khi sap xep: ");
        printArray(array);
    }
}
