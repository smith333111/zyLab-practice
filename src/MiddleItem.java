import java.util.Scanner;

public class MiddleItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userValues = new int[9];  // Set of data specified by the user

        int count = 0;
        while(true) {
            int val = scanner.nextInt();
            if(val < 0) {
                break;
            }
            if(count == 9){
                System.out.println("Too many inputs");
                return;

            }
            userValues[count] = val;
            count++;
        }
        if(count % 2 == 1){
            int middleIndex = count / 2;
            System.out.println(userValues[middleIndex]);
        }
    }
}
