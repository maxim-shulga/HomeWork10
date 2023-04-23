package task2;

public class MyDictionary <TKey,TValue>{
    private TKey[] keys;
    private TValue[] values;
    private int capacity, numberOfItems;
    MyDictionary (){
        capacity = 10;
        numberOfItems = 0;
        keys = (TKey[])(new Object[capacity]);
        values = (TValue[])(new Object[capacity]);
    }
    public void add(TKey key,TValue value){
        if (numberOfItems == capacity){
            capacity *= 2;
            TKey[] newKeys = (TKey[]) new Object[capacity];
            System.arraycopy(keys, 0, newKeys, 0, numberOfItems);
            keys = newKeys;
            TValue[] newValues = (TValue[]) new Object[capacity];
            System.arraycopy(values, 0, newValues, 0, numberOfItems);
            values = newValues;
        }
        keys[numberOfItems] =  key;
        values[numberOfItems] =  value;
        numberOfItems++;
    }
    public TKey getKey(int index){
        return keys[index];
    }
    public TValue getValue(int index){
        return values[index];
    }
    public int numberOfItems(){
        return numberOfItems;
    }
}
