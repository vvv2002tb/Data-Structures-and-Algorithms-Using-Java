package _3_Sort_Algorithms.BubbleSort;

// Thuật toán sắp xếp nổi bọt
// Hiệu suất của thuật toán này sẽ giảm nhanh chóng khi số mục (n) cần sắp xêp tăng lên.
// Thuật toán na có độ phức tạp O(n^2). (2 vòng loop). Có nghĩa là mất 100 bước để sắp xếp 10 mục (Chậm)
// Thuật toán sắp xếp nổi bọt là loại sắp xếp ổn định
/*
    Cách hoạt động:
    -Cho 1 mảng: 20, 35, -15, 7, 55, 1, -22 (length = 7).
    -Khi thuật toán tiến triển nó sẽ phân chia mảng thành 1 phân vùng
    đã sắp xếp và 1 phân vùng chưa sắp xếp.
    -Khi chúng ta bắt đầu, chúng ta sẽ có một trường mà chúng ta sẽ gọi là
    chỉ mục phân vùng chưa được sắp xếp. Và khi bắt đầu giá trị này
    sẽ bằng 6 (length - 1).
    -So sanh phần tử 0 với index = 1. Nếu arr[0] > arr[1] -> swap.
    Ngược lại thì giữ nguyên.
    -Với lần loop đầu tiên thì số lớn nhất sẽ ở cuối cùng -> vị trí 6
    đã được săp xếp và phân vùng chưa đc sắp xếp là 5.
    -Khi nào phân vùng chưa được sắp xếp = 0 thì sắp xếp kết thúc.
    -Thuật toán này sẽ khiến các số to nhất nổi lên ở cuối mảng vì
    vậy thuật toán này có tên là sắp xếp nổi bọt. ( To nổi lên trên).
       --------------------------------------------------------

    -Thuật toán này là thuật toàn tại chỗ vì chúng ta không cần tạo 1
    mảng khác.


 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsorted = intArray.length - 1; lastUnsorted > 0; lastUnsorted--) {
            for (int i = 0; i < lastUnsorted; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        System.out.println(Arrays.toString(intArray));
    }

    private static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
