package com.company.main;

import java.util.Locale;

public class Main<T> {
    public LinkedList<T> zipLists(LinkedList<T> l1 , LinkedList<T> l2){
        LinkedList<T> tempLinked = new LinkedList<>();
        Node<T> trav1 = l1.head;
        Node<T> trav2 = l2.head;
        int max = Math.max(l1.length, l2.length);
        while (max > 0 ) {
                if (trav1 != null){
                    tempLinked.append(trav1.data);
                    trav1 = trav1.next;
                }

                if (trav2 != null) {
                            tempLinked.append(trav2.data);
                    trav2 = trav2.next;
                }
            max--;
        }

        return tempLinked;
    }
    public static void main(String[] args) {
	    LinkedList<Integer> ll = new LinkedList<>();
        ll.append(1);
        ll.append(3);
        ll.append(3);
        ll.append(4);
        ll.append(5);
        ll.append(5);
        ll.append(6);
        System.out.println(ll);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.append(15);
        l2.append(15);
        l2.append(15);
        l2.append(15);
        l2.append(15);
        l2.append(15);
        ll = new Main().zipLists(ll , l2);
        System.out.println(ll);

        String x = "Pseudo Code :\n" +
                "    zipListsLinkedList<T> l1 , LinkedList<T> l2\n" +
                "        LinkedList<T> tempLinked -> new LinkedList<>\n" +
                "        Node<T> trav1 -> l1.head;\n" +
                "        Node<T> trav2 -> l2.head;\n" +
                "        int max -> Math.max(l1.length, l2.length)\n" +
                "        while  max > 0  \n" +
                "                if trav1 != null\n" +
                "                    tempLinked.append(trav1.data)\n" +
                "                    trav1 = trav1.next\n" +
                "                \n" +
                "\n" +
                "                if trav2 != null) \n" +
                "                                 tempLinked.append(trav2.data)\n" +
                "                    trav2 -> trav2.next\n" +
                "                \n" +
                "            max--\n" +
                "\n" +
                "        return tempLinked";
        System.out.println(x.toUpperCase());
    }
}
