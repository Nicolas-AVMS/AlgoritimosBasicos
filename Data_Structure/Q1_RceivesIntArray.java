package Data_Structure;
import java.util.Random;

public class RceivesIntArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i : array) {
            array[i]=random.nextInt(214748364);
            System.out.println("|"+array[i]+"|");
        }
    }
}