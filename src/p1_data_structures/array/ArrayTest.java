package p1_data_structures.array;

public class ArrayTest {
public static void main(String[] args) {
        // Khởi tạo một DynamicArray với kiểu Integer
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();

        // Thêm phần tử vào danh sách
        System.out.println("Thêm các phần tử vào DynamicArray: 1, 2, 3, 4");
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        System.out.println("Danh sách hiện tại: " + dynamicArray);

        // Kiểm tra phương thức size và isEmpty
        System.out.println("\nKích thước của danh sách: " + dynamicArray.size());
        System.out.println("Danh sách có rỗng không? " + dynamicArray.isEmpty());

        // Kiểm tra phương thức get và set
        System.out.println("\nPhần tử tại chỉ số 2: " + dynamicArray.get(2));
        dynamicArray.set(2, 5);
        System.out.println("Danh sách sau khi thay đổi phần tử tại chỉ số 2 thành 5: " + dynamicArray);

        // Kiểm tra phương thức indexOf và contains
        System.out.println("\nChỉ số của phần tử 3 trong danh sách: " + dynamicArray.indexOf(3));
        System.out.println("Danh sách có chứa phần tử 5 không? " + dynamicArray.contains(5));

        // Xóa phần tử tại chỉ số 1
        System.out.println("\nXóa phần tử tại chỉ số 1");
        dynamicArray.removeAt(1);
        System.out.println("Danh sách sau khi xóa phần tử tại chỉ số 1: " + dynamicArray);

        // Xóa phần tử theo giá trị
        System.out.println("\nXóa phần tử có giá trị 3");
        dynamicArray.remove(Integer.valueOf(3));
        System.out.println("Danh sách sau khi xóa phần tử 3: " + dynamicArray);

        // Duyệt qua danh sách với Iterator
        System.out.println("\nDuyệt qua danh sách với Iterator:");
        for (Integer value : dynamicArray) {
            System.out.println(value);
        }

        // Thêm thêm phần tử để kiểm tra khả năng mở rộng của mảng
        System.out.println("\nThêm các phần tử 6, 7, 8 vào DynamicArray.");
        dynamicArray.add(6);
        dynamicArray.add(7);
        dynamicArray.add(8);
        System.out.println("Danh sách hiện tại: " + dynamicArray);

        // Kiểm tra lại kích thước và phần tử
        System.out.println("\nKích thước của danh sách sau khi thêm: " + dynamicArray.size());
        System.out.println("Danh sách sau khi thêm: " + dynamicArray);
    }
}
