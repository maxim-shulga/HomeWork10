package task2;

public class Main {
    public static void main(String[] args) {
        MyDictionary<String, Integer> myDictonary = new MyDictionary<>();
        myDictonary.add("one", 10);
        myDictonary.add("two", 33);
        myDictonary.add("three", 42);

        System.out.println("Length is " + myDictonary.numberOfItems());

        for (int i = 0; i < myDictonary.numberOfItems(); i++) {
            System.out.println("Key " + myDictonary.getKey(i) + " = " + myDictonary.getValue(i));
        }
    }
}
