import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;


public class ProjectLinkedListTest {


    @org.junit.jupiter.api.Test
    public void testNextWithNull() {
        ProjectLinkedList<Integer> Lst1 = new ProjectLinkedList<>(2);
        ProjectLinkedList<Integer> Lst2 = new ProjectLinkedList<>(null);
        ProjectLinkedList<Integer> expected = Lst2;
        Lst1.setNext(Lst2);
        assertEquals(expected, Lst1.next());


    }//end next null

    @org.junit.jupiter.api.Test
    public void testNextWithInteger() {
        ProjectLinkedList<Integer> lst1 = new ProjectLinkedList<>(2);
        ProjectLinkedList<Integer> lst2 = new ProjectLinkedList<>(3);
        ProjectLinkedList expected = lst2;
        lst1.setNext(lst2);
        assertEquals(expected, lst1.next());

    }//end text next with int

    @org.junit.jupiter.api.Test

    public void testLastWithNull() {
        ProjectLinkedList<Integer> Lst1 = new ProjectLinkedList<>(3);
        ProjectLinkedList<Integer> Lst2 = new ProjectLinkedList<>(6);
        ProjectLinkedList<Integer> Lst3 = new ProjectLinkedList<>(9);
        ProjectLinkedList<Integer> Lst4 = new ProjectLinkedList<>(5);
        ProjectLinkedList<Integer> Lst5 = new ProjectLinkedList<>(4);
        ProjectLinkedList<Integer> Lst6 = new ProjectLinkedList<>(2);
        ProjectLinkedList<Integer> Lst7 = new ProjectLinkedList<>(null);
        ProjectLinkedList<Integer> expected = Lst7;
        Lst1.setNext(Lst2);
        Lst2.setNext(Lst3);
        Lst3.setNext(Lst4);
        Lst4.setNext(Lst5);
        Lst5.setNext(Lst6);
        Lst6.setNext(Lst7);
        assertEquals(expected, Lst1.last());

    }

    @org.junit.jupiter.api.Test

    public void testLastWithInt() {
        ProjectLinkedList<Integer> lst1 = new ProjectLinkedList<>(1);
        ProjectLinkedList<Integer> lst2 = new ProjectLinkedList<>(2);
        ProjectLinkedList<Integer> lst3 = new ProjectLinkedList<>(3);
        ProjectLinkedList<Integer> expected = lst3;
        lst1.setNext(lst2);
        lst2.setNext(lst3);
        assertEquals(expected, lst1.last());


    }

    @org.junit.jupiter.api.Test

    public void testAfterWithNull() {
        ProjectLinkedList<Integer> lst1 = new ProjectLinkedList<>(3);
        ProjectLinkedList<Integer> lst2 = new ProjectLinkedList<>(4);
        ProjectLinkedList<Integer> lst3 = new ProjectLinkedList<>(null);
        ProjectLinkedList<Integer> expected = lst3;
        lst1.setNext(lst2);
        lst2.setNext(lst3);
        assertEquals(expected, lst1.after(2));


    }

    @org.junit.jupiter.api.Test

    public void testAfterWithInt() {
        ProjectLinkedList<Integer> lst1 = new ProjectLinkedList<>(3);
        ProjectLinkedList<Integer> lst2 = new ProjectLinkedList<>(4);
        ProjectLinkedList<Integer> lst3 = new ProjectLinkedList<>(5);
        ProjectLinkedList<Integer> expected = lst3;
        lst1.setNext(lst2);
        lst2.setNext(lst3);
        assertEquals(expected, lst1.after(2));


    }

    @org.junit.jupiter.api.Test

    public void testDetachFunctionAfterMidList() {
        ProjectLinkedList<Integer> lst1 = new ProjectLinkedList<>(3);
        ProjectLinkedList<Integer> lst2 = new ProjectLinkedList<>(3);
        ProjectLinkedList<Integer> lst3 = new ProjectLinkedList<>(3);
        ProjectLinkedList<Integer> expected = lst3;
        lst1.setNext(lst2);
        lst2.setNext(lst3);
        lst1.detach();
        assertEquals(expected, lst1.next());

    }

    @org.junit.jupiter.api.Test

    public void testDetachFunctionAfterLastList() {
        ProjectLinkedList<Integer> lst1 = new ProjectLinkedList<>(3);
        ProjectLinkedList<Integer> lst2 = new ProjectLinkedList<>(3);
        ProjectLinkedList<Integer> lst3 = new ProjectLinkedList<>(3);
        ProjectLinkedList<Integer> expected = null;
        lst1.setNext(lst2);
        lst2.setNext(lst3);
        lst2.detach();
        assertEquals(expected, lst2.next());

    }


    @org.junit.jupiter.api.Test

    public void testGet() {
        ProjectLinkedList<Integer> List = new ProjectLinkedList<>(10);
        int expected = 10;
        int actual = List.get();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test

    public void testSet() {
        ProjectLinkedList<Integer> List = new ProjectLinkedList<>(0);
        int number = 10;
        List.set(number);

    }

    @org.junit.jupiter.api.Test

    public void testSetNext() {
        ProjectLinkedList<Integer> Lst1 = new ProjectLinkedList<>(3);
        ProjectLinkedList<Integer> Lst2 = new ProjectLinkedList<>(2);
        ProjectLinkedList<Integer> Lst3 = new ProjectLinkedList<>(1);
        ProjectLinkedList<Integer> expected = Lst3;
        Lst1.setNext(Lst2);
        Lst2.setNext(Lst3);
        assertEquals(expected, Lst2.next());

    }

    @org.junit.jupiter.api.Test
    public void testAppend() {
        ProjectLinkedList<Integer> Lst1 = new ProjectLinkedList<>(1);
        ProjectLinkedList<Integer> Lst2 = new ProjectLinkedList<>(2);
        ProjectLinkedList<Integer> Lst3 = new ProjectLinkedList<>(3);
        Lst1.setNext(Lst2);
        Lst2.setNext(Lst3);
        ProjectLinkedList<Integer> Lst4 = new ProjectLinkedList<>(3);
        ProjectLinkedList expected = Lst4;
        Lst1.append(Lst4);
        assertEquals(expected, Lst1.last());


    }


    @org.junit.jupiter.api.Test

    public void testInsert() {

        ProjectLinkedList<Integer> Lst1 = new ProjectLinkedList<>(1);
        ProjectLinkedList<Integer> Lst2 = new ProjectLinkedList<>(2);
        ProjectLinkedList<Integer> Lst3 = new ProjectLinkedList<>(3);
        ProjectLinkedList<Integer> Lst4 = new ProjectLinkedList<>(4);

        ProjectLinkedList<Integer> newList = new ProjectLinkedList<>(5);
        ProjectLinkedList<Integer> expected = Lst1;
        Lst1.setNext(Lst2);
        Lst2.setNext(Lst3);
        Lst3.setNext(Lst4);


        Lst1.insert(newList);

        assertEquals(expected, newList.next());
    }


}

