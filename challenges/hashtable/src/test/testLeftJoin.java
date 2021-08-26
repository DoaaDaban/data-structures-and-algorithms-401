package test;

import com.mohiesen.HashTable;
import com.mohiesen.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testLeftJoin {
    Main main;
    HashTable<String , String> table1;
    HashTable<String , String> table2;

    @BeforeEach
    public void init(){
        main =  new Main();
        table1 = new HashTable<>();
        table2 = new HashTable<>();

        table1.add("first" , "first1");
        table1.add("second" , "second1");
        table1.add("third" , "third1");

        table2.add("first","first2");
        table2.add("second","second2");
        table2.add("third","third2");

    }


    @Test
    public void testExpected(){
        int lengthOfEach = main.leftJoin(table1 , table2).get(0).size();
        Assertions.assertEquals(3 , lengthOfEach);
    }

    @Test
    public void testNullValues(){
        table1.add("no" , "no");
        Assertions.assertNull(main.leftJoin(table1 , table2).get(1).get(2));
    }

    @Test
    public void testForEmpty(){
        HashTable<String , String> table3 = new HashTable<>();
        for (int i = 0; i < table1.getSize(); i++) {
            Assertions.assertNull(main.leftJoin(table1 , table3).get(i).get(2));
        }
    }
}
