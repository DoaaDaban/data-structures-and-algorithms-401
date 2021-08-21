package com.mohiesen;

public class Main {
    public String firstRepeatedWord(String sentence){
        HashTable<String , Integer> dictionary = new HashTable<>();
        sentence = sentence.toLowerCase();
        String[] words = sentence.split("[\\p{Punct}\\s]+");
        for (String word : words){
            if( dictionary.contains(word))
                return word;
            else
                dictionary.add(word,1);
        }
        return null;
    }
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
        String sen = "HELLO AFADG AFADG, SDFDAS HELLO";
        System.out.println(new Main().firstRepeatedWord(sen));
    }
}
