package Streams.E_2023;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Streams.E_2023.Solution.removeEveryNth;
import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void testRemoveNth(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4 ,5));
        List<Integer> ans = new ArrayList<>(Arrays.asList(1, 2, 4 ,5));
        assertEquals(true, ans.equals(removeEveryNth(list.stream(), 3) ));
    }

    @Test
    public void testRemoveDublicates(){
    }
}
