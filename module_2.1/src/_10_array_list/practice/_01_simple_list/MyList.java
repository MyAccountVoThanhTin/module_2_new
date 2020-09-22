package _10_array_list.practice._01_simple_list;

import java.util.Arrays;

public class MyList<E> {
    public static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object[] element;
    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){
        int newSize = element.length*2;
        element = Arrays.copyOf(element,newSize);
    }
    /** add element in last list */
    public void add(E e){
        if(size == element.length){
            ensureCapa();
        }
        element[size++] = e;
    }
    /**setting method get() index */;
    public E get(int i){
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) element[i];
    }
    /** clear the list */
    public void clear(){
        element = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    /** Return true if this list contains the element */
    public boolean contains(E e){
        for (int i = 0; i< size ;i++){
            if(e.equals(element[i])){
                return true;
            }
        }
        return  false;
    }
    /** chech index in list(element*/
    public void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }
    /** check element have in list ?*/
    public int indexOf(E e){
        for (int i = 0 ;i < size ;i++){
            if(e.equals(element[i])){
                return i;
            }
        }
        return -1;
    }
    /** Return the index of the last matching element 75 * in this list. Return -1 if no match. */
    public int lastIndexOf(E e) {

        for (int i = size - 1; i >= 0; i--) if (e.equals(element[i])) return i;
        return -1;
    }
    /** Remove the element at the specified position 84 * in this list. Shift any subsequent elements to the left. 85 * Return the element that was removed from the list. */
    public E remove(int index) {
        checkIndex(index);

        E e = (E) element[index];

        // Shift data to the left
        for (int j = index; j < size - 1; j++)
            element[j] = element[j + 1];

        element[size - 1] = null; // This element is now null

        // Decrement size
        size--;
        return e;
    }
    /** Replace the element at the specified position
     *  in this list with the specified element. */
    public E set(int index, E e) {
        checkIndex(index);
        E old =(E) element[index];
        element[index] = e;
        return old;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(element[i]);
            if (i < size - 1) result.append(", ");
        }

        return result.toString() + "]";
    }

    /**
     * Trims the capacity to current size
     */
    public void trimToSize() {

        if (size != element.length) {
            E[] newData = (E[]) (new Object[size]);
            System.arraycopy(element, 0, newData, 0, size);
            element = newData;
        } // If size == capacity, no need to trim
    }
}
