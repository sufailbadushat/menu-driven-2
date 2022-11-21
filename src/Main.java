import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true){
            System.out.println("\n-------------------Menu Options------------------------");
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

                case 6:
                    System.exit(0);
            }
        }

    }

//check largest of 3 numbers
    static void largest(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        double num1=scan.nextDouble();
        double num2=scan.nextDouble();
        double num3=scan.nextDouble();
        if(num1 > num2 && num1 > num3)
        {
            System.out.println("Largest number is:"+num1);
        }
        else if(num2 > num3)
        {
            System.out.println("Largest number is:"+num2);
        }
        else
        {
            System.out.println("Largest number is:"+num3);
        }
    }


//check smallest of 3 numbers
    static void smallest(){
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        double a=scan2.nextDouble();
        double b=scan2.nextDouble();
        double c=scan2.nextDouble();
        double temp=a<b?a:b;
//comparing the temp variable with c and storing the result in the variable names smallest
        double smallest=c<temp?c:temp;
//prints the smallest number
        System.out.println("The smallest number is: "+smallest);
    }


//check prime or not
        static void checkPrime(){

        Scanner scan3 = new Scanner(System.in);
            System.out.println("Enter a number: ");
        int num = scan3.nextInt();
            boolean flag = false;
            for (int i = 2; i <= num / 2; ++i) {
                // condition for nonPrime number
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }


//even or not
    static void checkEven(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("It is a even number");
        }
        else {
            System.out.println("It is a odd number");
        }
    }
}

