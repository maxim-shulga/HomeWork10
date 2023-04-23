package task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> testList = new MyList<>();

        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            testList.add(random.nextInt(100));
        }
        System.out.println("Length is " + testList.numberOfItems());

        for (int i = 0; i < testList.numberOfItems(); i++) {
            System.out.printf(testList.get(i) + " ");
        }
    }
}
