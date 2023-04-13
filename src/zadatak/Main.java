package zadatak;

public class Main {

    public static void main(String[] args) {


        // 1.
        GenericList<Integer> intList = new GenericList<Integer>();
// 2.
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        intList.add(50);
// 3.
        System.out.println("Size of list: " + intList.size());
// 4.
        System.out.println("First element: " + intList.get(0));
        System.out.println("Last element: " + intList.get(intList.size() - 1));
// 5.
        intList.remove(3);
// 6.
        System.out.println("Size of list after removing: " + intList.size());
// 7.
        System.out.println("Content of the list: " + intList.toString());
// 8.
        GenericList<String> stringList = new GenericList<String>();

// 9.
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
// 10.
        System.out.println("Content of the string list: " + stringList.toString());
    }

}
