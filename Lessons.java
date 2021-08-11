import java.util.Scanner;

public class Lessons {

    public static void main(String[] args) {

        int math, physics, turkish, history, chemistry, musics;

        Scanner input = new Scanner(System.in);
        //get inputs from user
        System.out.println("Write exam points");
        System.out.println("math:");
        math = input.nextInt();
        System.out.println("physics:");
        physics = input.nextInt();
        System.out.println("turkish:");
        turkish = input.nextInt();
        System.out.println("history:");
        history = input.nextInt();
        System.out.println("chemistry:");
        chemistry = input.nextInt();
        System.out.println("musics:");
        musics = input.nextInt();

        float average = (math + physics + turkish + history + chemistry + musics) / 6;
        System.out.println("Average is:" + average);
        boolean condition = average >=60;
        System.out.println("Result =" +(condition==true ? "passed":"failed"));

    }
}

