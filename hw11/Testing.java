import java.util.Random;
import java.util.*;
public class Testing{
int [] array;
array = new int[15];
Random rnd = new Random();
    for (int i = 14; i > 0; i--)
    {
      int index = rnd.nextInt(i + 1);
      // Simple swap
      int a = array[index];
      array[index] = array[i];
      array[i] = a;
    }
}