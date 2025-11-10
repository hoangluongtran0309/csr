package p1_data_structures.linkedlist;

public class LinkedListTest {
   public static void main(String[] args) {
        // Khởi tạo danh sách liên kết đôi
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        // Kiểm tra addLast và addFirst
        System.out.println("Thêm phần tử vào cuối: 1, 2, 3, 4");
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        System.out.println("Danh sách hiện tại: " + list);

        // Thêm phần tử vào đầu
        System.out.println("\nThêm phần tử vào đầu: 0");
        list.addFirst(0);
        System.out.println("Danh sách hiện tại: " + list);

        // Kiểm tra peekFirst và peekLast
        System.out.println("\nPhần tử đầu tiên: " + list.peekFirst());
        System.out.println("Phần tử cuối cùng: " + list.peekLast());

        // Kiểm tra removeFirst và removeLast
        System.out.println("\nXóa phần tử đầu tiên: " + list.removeFirst());
        System.out.println("Danh sách sau khi xóa đầu: " + list);

        System.out.println("\nXóa phần tử cuối cùng: " + list.removeLast());
        System.out.println("Danh sách sau khi xóa cuối: " + list);

        // Kiểm tra remove theo Object
        System.out.println("\nXóa phần tử có giá trị 2");
        list.remove(Integer.valueOf(2));
        System.out.println("Danh sách sau khi xóa phần tử 2: " + list);

        // Kiểm tra removeAt
        System.out.println("\nXóa phần tử tại chỉ số 1");
        list.removeAt(1);
        System.out.println("Danh sách sau khi xóa phần tử tại chỉ số 1: " + list);

        // Kiểm tra contains và indexOf
        System.out.println("\nDanh sách có chứa phần tử 3 không? " + list.contains(3));
        System.out.println("Chỉ số của phần tử 3 là: " + list.indexOf(3));

        // Duyệt qua danh sách với Iterator
        System.out.println("\nDuyệt qua danh sách với Iterator:");
        for (Integer i : list) {
            System.out.println(i);
        }

        // Kiểm tra phương thức isEmpty và size
        System.out.println("\nDanh sách có rỗng không? " + list.isEmpty());
        System.out.println("Kích thước của danh sách là: " + list.size());
        
        // Kiểm tra clear
        System.out.println("\nXóa tất cả các phần tử trong danh sách...");
        list.clear();
        System.out.println("Danh sách sau khi clear: " + list);
    }
}
