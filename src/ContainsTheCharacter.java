import java.util.Scanner;

public class ContainsTheCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numWords = scanner.nextInt();
        String[] words = new String[numWords];
        for(int i = 0; i < numWords;i++){
            words[i] = scanner.next();
        }
        char targetChar = scanner.next().charAt(0);
        for(int i = 0; i < numWords; i++){
            if(words[i].indexOf(targetChar) != -1){
                System.out.println(words[i]);
            }
        }
    }
}
