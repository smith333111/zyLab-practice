import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userList = new int[20];   // List of numElement integers specified by the user
        int numElements;                // Number of integers in user's list
        // Add more variables as needed

        numElements = scanner.nextInt();   // Input begins with number of integers that follow

        for(int i = 0; i < numElements; i++){
            userList[i] = scanner.nextInt();
        }
        for(int i = numElements - 1; i >= 0; i--){
            System.out.print(userList[i] + " ");
        }
        System.out.println();
    }
}
