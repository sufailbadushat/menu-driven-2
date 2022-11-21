import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true){
            System.out.println("-------------------Menu Options------------------------");
            System.out.println("1.Largest of 3 numbers.");
            System.out.println("2.Smallest of 3 numbers.");
            System.out.println("3.Check prime of not.");
            System.out.println("4.Even or not.");
            System.out.println("5.Reverse of a number.");
            System.out.println("6.Exit.");
            System.out.println("-------------------------------------------------------------");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    largest();
                    break;
                case 2:
                    smallest();
                    break;
                case 3:
                    checkPrime();
                    break;
                case 4:
                    checkEven();
                    break;
                case 5:
                    reverse():
                    break;
                case 6:
                    System.exit(0);

            }
        }

    }


}

