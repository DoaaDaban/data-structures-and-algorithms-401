package com.mohiesen;

public class Main {

    public static void main(String[] args) {
	    HashTable<String , Integer> myTable = new HashTable<>();
        myTable.add("Mohammed" , 31);
        myTable.add("Mohammed2" , 1);
        myTable.add("Mohammed22" , 1);
        myTable.add("Mohammed33" , 1);
        myTable.add("Mohammed13" , 1);
        myTable.add("Mohammed13da" , 1);
        myTable.add("Mohammed13dvv" , 1);
        myTable.add("Mohammed13czv" , 1);
        myTable.add("Mohammed13ad" , 1);
        myTable.add("Mohammed13e" , 1);
        System.out.println(myTable);
        System.out.println(myTable.contains("Mohammed13e"));
    }
}
