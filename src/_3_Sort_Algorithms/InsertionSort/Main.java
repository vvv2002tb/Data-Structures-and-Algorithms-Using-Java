package _3_Sort_Algorithms.InsertionSort;
// sắp xếp nổi bọt và sắp xếp chọn thì sẽ từ phải sang trái,
// còn thuật toán này sẽ phát triển các loại phân vùng từ trái sang phải.
// là thuật toán tại chỗ, ổn định
// Big O: O(n^2).

// Cách hoạt động:
// VD: int[] arrayInt = {20, 35, -15, 7, 55, 1, -22};
/*
* Bắt đầu bằng cách nói rằng, vị trí phần tử 0 nằm trong phân vùng được sắp xếp.
* Và bởi vì phân vùng được sắp xếp naỳ có độ dài bằng 1 nên theo mặc định phần tử được sx.
*
*/

public class Main {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        InsertionSort(intArray);
        printElementInArray(intArray);
    }

    private static void InsertionSort(int[] array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];

            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }

            array[i] = newElement;
        }

    }

    private static void printElementInArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
