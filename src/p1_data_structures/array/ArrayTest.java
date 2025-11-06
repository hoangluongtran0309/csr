package p1_data_structures.array;

public class ArrayTest {
  public static void main(String[] args) {
    DynamicArray<Integer> dArray = new DynamicArray<>();
    dArray.add(1);
    dArray.add(2);
    dArray.add(3);

    // dArray.remove(3);

    dArray.removeAt(0);
     dArray.set(0, 4);
    
    System.out.println(dArray.get(1));
    // System.out.println();
    // System.out.println(dArray.contains(3));
    // System.out.println(dArray.isEmpty());
    System.out.println(dArray.size());
    System.out.println(dArray.toString());

  }
}
