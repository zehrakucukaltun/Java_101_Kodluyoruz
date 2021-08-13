import java.util.Scanner;

public class LoginProcess {
    public static void main(String[] args) {
        String username ="Zehra" , password ="Zehra1234", old_password ="Z123" ;

        Scanner input =new Scanner(System.in);
        System.out.println("Please enter the username:");
        String username1 =input.nextLine();
        System.out.println("Please enter the password:");
        String password1 = input.nextLine();
        if (username.equals(username1) && password.equals(password1)){
            System.out.println("Login is successfully completed");
        }
        else if (!(username.equals(username1))) {
            System.out.println("Username is incorrect, please try one more time!! ");
            String username2 = input.next();
            if (username2.equals(username)){
                System.out.println("Username is correct.");
            }
            else {
                System.out.println("Please try again..");
            }
        }
        else if (username.equals(username1) && !(password.equals(password1))){
            System.out.println("Do you want to reset the password?");
            System.out.println("1-Yes\n2-No:");
            int answer = input.nextInt();
            if(answer ==1){
                System.out.print(" Please determine new password. The new password must not be the same as the incorrectly entered or forgotten password.");
                String new_password = input.next();

                if (new_password.equals( old_password) || password.equals(new_password)){
                    System.out.println("Password couldnt be created. Please enter another password!");
                }
                else {
                    password = new_password ;
                    System.out.println("password created");
                    System.out.println("New password is :" + password);
                }
            }
            else if(answer ==2){
                System.out.println("Password not changed. You can change it anytime you want!");
            }
        }
        else {
            System.out.println("Invalid username and password!");
        }
    }
}
