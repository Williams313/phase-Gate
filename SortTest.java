import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class SwapTest {



	@Test

    public void swapSort() {
        int[] input = {1, 2, 3, 4, 6, 5};

		
	int[] array = Swap.sortArray(input);
			
        int[] expected ={2, 1, 4, 3, 5, 6};
        int[] result = sortArray(input);
        assertArrayEquals(expected, result);

    }

  }  

