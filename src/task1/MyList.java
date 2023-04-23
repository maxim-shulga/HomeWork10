package task1;

public class MyList <T>{
    private int numberOfItems, capacity;
    T[] list;
    MyList (){
        capacity = 10;
        list = (T[])(new Object[capacity]);
        numberOfItems = 0;
    }

    public void add(T item){
        if (numberOfItems == capacity){
            capacity *= 2;
            T[] newList = (T[]) new Object[capacity];
            System.arraycopy(list, 0, newList, 0, numberOfItems);
            list = newList;
        }
        list[numberOfItems++] =  item;
    }
    public T get(int index){
        return list[index];
    }
    public int numberOfItems(){
        return numberOfItems;
    }
}
