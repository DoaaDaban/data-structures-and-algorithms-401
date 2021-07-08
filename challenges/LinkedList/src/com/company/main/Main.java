package com.company.main;
import java.io.InputStreamReader;
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

    public LinkedList<T> reverseList(LinkedList<T> ll) {
        LinkedList<T> reversed = new LinkedList<>();
        Node<T> trav = ll.head;
        while (trav != null) {
            reversed.insert(trav.data);
            trav = trav.next;
        }

        return reversed;
    }

    public boolean isPalindrome(LinkedList<T> ll) {
        LinkedList<T> reversed = new LinkedList<>();
        Node<T> trav = ll.head;
        while (trav != null) {
            reversed.insert(trav.data);
            trav = trav.next;
        }
        trav = ll.head;
        Node<T> trav2 = reversed.head;
        while (trav != null) {
            if (trav.data != trav2.data) {
                return false;
            }
            trav = trav.next;
            trav2 = trav2.next;
        }
        return true;
    }
    public static void main(String[] args) {
	    LinkedList<Integer> ll = new LinkedList<>();
        ll.append(1);
        ll.append(3);
        ll.append(4);
        ll.append(4);
        ll.append(3);
        ll.append(1);
        ll.append(6);
//        ll.append(5);
//        ll.append(5);
//        ll.append(6);
        System.out.println(ll);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.append(15);
        l2.append(15);
        l2.append(15);
        l2.append(15);
        l2.append(15);
        l2.append(15);
        System.out.println(ll);
        ll = new Main().reverseList(ll);
        System.out.println(ll);
        System.out.println(new Main().isPalindrome(ll));

    }

}
