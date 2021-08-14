import java.util.Scanner;

public class SortNumbers {
    // sort the given numbers from least to greatest
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner input = new Scanner(System.in);
        System.out.println("write the n1:");
        n1 = input.nextInt();
        System.out.println("Write the n2:");
        n2 = input.nextInt();
        System.out.println("Write the n3:");
        n3 = input.nextInt();
        if (n1 ==n2 && n2 ==n3){
            System.out.println("Numbers are equal.");
        }

        else if (n1 < n2 && n1<n3){
            if (n2<n3) {
                System.out.println("sorting is: 'n1 <n2 <n3'.");
            }
            else{
                System.out.println("Sorting is: 'n1 <n3 < n2'.");
            }
        }
        else if (n2 < n1 && n2<n3) {
            if(n1<n3){
                System.out.println("Sorting is: 'n2 < n1 <n3'.");
            }
            else {
                System.out.println("Sorting is:'n2 < n3 <n1'");
            }
        }
        else if (n3 < n1 && n3 <n2){
            if (n1 < n2){
                System.out.println("Sorting is: 'n3 <n1 < n2'");
            }
            else{
                System.out.println("Sorting is:'n3 <n2 <n1'.");
            }

        }
        else
            System.out.println("Please check the numbers..");

    }
}
