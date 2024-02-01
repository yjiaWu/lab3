import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  
  @Test 
  public void testReversedFailed1(){
    int[] input1 = {2,4,6};
    assertArrayEquals(new int[] {6,4,2}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedFailed2(){
    int[] input1 = {5,6,7,8,9,10};
    assertArrayEquals(new int[] {10,9,8,7,6,5}, ArrayExamples.reversed(input1));
  }
}

  
