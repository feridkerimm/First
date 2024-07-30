package LeetCode;

import java.util.LinkedList;

public class ReverseLinked {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        LinkedList<Integer> reversedList = new LinkedList<>();
        int size = list.size() - 1;
        for (int i = 0; i <= size; i++) {
            reversedList.add(list.get(size - i));
        }
        System.out.println();
        System.out.println(reversedList);


    }
}
