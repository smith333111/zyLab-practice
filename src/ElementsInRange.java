import java.util.Scanner;

public class ElementsInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt();
        int[] numbers = new int[numElements];

        for(int i = 0; i < numElements; i++){
            numbers[i] = scanner.nextInt();
        }
        int lower = scanner.nextInt();
        int upper = scanner.nextInt();
        for(int i = 0; i < numElements; i++){
            if(numbers[i] >= lower && numbers[i] <= upper){
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();

    }
}
