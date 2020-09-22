package _10_array_list.exercise._01_arraylist;

import com.sun.javaws.security.AppContextUtil;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;

public class MyList<E> {
   private int size = 0;
   public static final int  DEFAULT_CAPACITY = 10;
   Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        if(capacity >= 0){
            elements = new Object[capacity];
        }else {
            throw new IllegalArgumentException("capacity" + capacity);
        }
    }
    public int size(){
        return this.size;
    }
    public void clear(){
        size = 0;
        for (int i = 0 ;i <elements.length; i++){
            elements[i] = null;
        }
    }
    public boolean add(E e){
        this.ensureCapacity();
        elements[size] = e;
        size++;
        return true;
    }
    private void ensureCapacity(){
        if(size == elements.length){
            int newSize = elements.length;
            elements = Arrays.copyOf(elements,newSize);
        }
    }
    public void add(int index,E e){
        if(index > elements.length){
            System.out.println("Largest !");
        }
        ensureCapacity();

        if (elements[index] == null){
            elements[index] = e;
            size++;
        }else {
            for (int i = size-1 ;i >= index;i--){
                elements[i+1] = elements[i];
            }
            elements[index] = e;
            size++;
        }
    }
    public E get(int index){
        return (E) elements[index];
    }
    public int indexOf(E o){
        for (int i = 0;i< size();i++){
            if(o.equals(elements[i])){
                return i;
            }
        }
        return  -1;
    }
    public boolean contains(E e){
        return (this.indexOf(e) >= 0) ? true : false;
    }
    public MyList<E> clone(){
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(this.elements,this.size);
        v.size = this.size;
        return v;
     }
}
