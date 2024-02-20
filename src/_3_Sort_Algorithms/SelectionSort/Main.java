package _3_Sort_Algorithms.SelectionSort;

// Thuật toán sắp xếp lựa chọn
// Sắp xếp lựa chọn là một thuật toán tại chỗ
// VD: int[] arrayInt = {20, 35, -15, 7, 55, 1, -22};
// Big O: O(n^2). Tuy nhiên nó k yêu cầu hoán đổi nhiều như bubble sort. Chỉ hoán đổi 1 lần sau 1 lần duyệt.
// Là thuật toán không ổn định
/*
* Thuật toán chia thành các phân vùng được sắp xếp và chưa sắp xếp giống như bubble sort
* Việc làm là việc chúng tôi duyệt qua mảng và tìm kiếm phần tử lớn nhất trong vùng chưa được sắp xếp.
* Và khi tìm thâ pt lớn nhất thì swap phần từ cuối cùng trong phân vùng chưa đc sắp xếp.
* Khi bắt đầu chúng ta sẽ khơi tạo trường lớn nhất là index = 0 (arrayInt[0] = 20);
* So sánh với phân vùng chưa được sắp xếp chọn ra đc số 55 là lớn nhất, sau đó swap
* 55 với -22 (index 4 vs index 6 ) sau đó phân vùng còn 5. Đây là vòng lặp thứ 1.
*
*/


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        selectionSort(intArray);
        printElementInArray(intArray);
    }

    private static void selectionSort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largest] ) {
                    largest = i;
                }
            }
            swap(array, largest, lastUnsortedIndex);
        }
    }


    private static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printElementInArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
