import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExcuseGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of excuses to generate: ");
        int numberOfExcuses = scanner.nextInt();
        System.out.println("Generating " + numberOfExcuses + " excuses: \n");
        Generator generator = new Generator(numberOfExcuses);
        ArrayList<String> excuses = generator.generateExcuse();
        for (String excuse : excuses) {
            System.out.println(excuse + "\n");
        }
    }
}
