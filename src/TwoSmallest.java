import java.util.Scanner;
import java.util.Arrays;

public class TwoSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];

        for(int i = 0; i < num; i++){
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[0] + " " + array[1]);
    }
}
