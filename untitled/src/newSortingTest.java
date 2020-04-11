import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class newSortingTest {

   //Testing newSorting() general functionality
    @Test
    public void newSortingTest1(){
        newSorting sort = new newSorting();
        int[] array = {3, 4, 1, 5, 2};
        int[] expected = {1, 2, 3, 4, 5};
        sort.newSorting(array,3);
        assertArrayEquals(array, expected);
    }

    //Testing what could happen if the array is sorted reversely
    @Test
    public void newSortingTest2(){
        newSorting sort = new newSorting();
        int[] array = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        sort.newSorting(array,3);
        assertArrayEquals(array, expected);
    }

    //Testing if array had duplicates
    @Test
    public void newSortingTest3(){
        newSorting sort = new newSorting();
        int[] array = {6, 1, 6, 3, 5, 4, 2};
        int[] expected = {1, 2, 3, 4, 5, 6, 6};
        sort.newSorting(array,4);
        assertArrayEquals(array, expected);
    }

    //Testing to see what could happen if the numbers are not similar
    @Test
    public void newSortingTest4(){
        newSorting sort = new newSorting();
        int[] array = {6, 8, 9, 7, 10};
        int[] expected = {1, 2, 3, 4, 5};
        sort.newSorting(array,3);
        assertArrayEquals(array, expected);
    }

    //Testing to see what could happen if the half size is more than expected
    @Test
    public void newSortingTest5(){
        newSorting sort = new newSorting();
        int[] array = {7, 3, 4, 1, 6, 5, 2};
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        sort.newSorting(array,6);
        assertArrayEquals(array, expected);
    }
}