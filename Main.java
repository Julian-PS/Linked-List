/**
 * Main class to test the Linked List. All methods are contained and explained within the accompanying classes (Node and
 * MyLinkedList)
 */
public class Main {
    public static void main(String[] args) {

        // create lists to test methods
        MyLinkedList list = new MyLinkedList<String>();
        MyLinkedList list2 = new MyLinkedList<Integer>();
        MyLinkedList list3 = new MyLinkedList<String>();


        // Method calls to update and test the lists

        list.add("Hello");
        list.add("200");
        list.add("Julian");
        list.add("Coffee");

        list.remove("Hello");
        list.remove("Coffee");

        list2.addInOrder(45);
        list2.addInOrder(200);
        list2.addInOrder(970);
        list2.addInOrder(520);
        list2.addInOrder(200);
        list2.addInOrder(3);

        list3.add("Julian");
        list3.addAfter("200", "Julian");

        System.out.println(list.toString());
        System.out.println("Size of list is: " + list.size() + "\n");

        System.out.println(list2.toString());
        System.out.println("Size of list2 is: " + list2.size() + "\n");

        System.out.println(list3.toString());
        System.out.println("Size of list3 is: " + list3.size() + "\n");

        System.out.println("list contains \"Julian\": " + list.contains("Julian"));
        System.out.println("list contains \"Coffee\": " + list.contains("Coffee"));

        System.out.println("list and list2 contain the same values: " + list.compare(list2));
        System.out.println("list and list3 contain the same values: " + list.compare(list3));


    }
}
