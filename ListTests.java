import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

class CheckString implements StringChecker{
    public boolean checkString(String s){
        if(s.contains("e")){
            return true; 
        }
        return false; 
    }
}

public class ListTests{
    
    @Test
    public void filter(){

        List<String> list1 = new ArrayList<>();
        list1.add("cover");
        list1.add("winter");
        list1.add("storm");
        
        StringChecker sc = new CheckString();
        List<String> result = new ArrayList<>();
        result.add("cover");
        result.add("winter");
        assertEquals(result,ListExamples.filter(list1, sc));
    }
}