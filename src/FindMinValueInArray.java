import java.util.Scanner;

public class FindMinValueInArray {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int size;
            do {
                System.out.println("Nhập vào kích thước của mảng:");
                size = scanner.nextInt();
                if (size > 20) {
                    System.out.println("Kích thước tối đa của mảng là 20");
                }
            } while (size > 20);
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.println("Nhập vào số thứ " + (i + 1));
                array[i] = scanner.nextInt();
            }
            System.out.println("Danh sách vừa nhập:");
            for (int i = 0; i < array.length; i++) {
                System.out.printf(array[i] + "\t");
            }
            int min = array[0];
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                if (min >= array[i]) {
                    min = array[i];
                    index = i + 1;
                }
            }

            System.out.println("\nGiá trị nhỏ nhất trong mảng là: " + min + " và đứng ở vị trí thứ: " + index);
    }
}
