package p1_data_structures.linkedlist;

public interface ILinkedList<T> extends Iterable<T>{
    int size();
    
    boolean isEmpty();
    
    void add(T element);
    void addFirst(T element);
    void addLast(T element);
    
    void clear();

    T peekFirst();
    T peekLast();

    T removeFirst();
    T removeLast();

    T remove(Node<T> node);
    boolean remove(Object object);
    T removeAt(int index);

    int indexOf(Object object);

    boolean contains(Object object);
}
