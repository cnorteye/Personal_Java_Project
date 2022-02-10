import java.util.Scanner;

public class banking{
    public static void main(String[] args) {
        
       BankAccount obj1 = new BankAccount("Sam", "BA001");
       obj1.showMenu();
    }
}

class   BankAccount{
    double balance;
    double previousTransaction;
    String customerName;
    String customerId;

        //constructor
    BankAccount(String cname, String cid){
        customerName = cname;
        customerId = cid;
    }

    void deposit (Double amount){
        if (amount != 0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw (Double amount){
        if(amount !=0){
            balance = balance - amount;
            previousTransaction = - amount;
        }
    }


    void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposited: " + previousTransaction);
        
        }else if(previousTransaction < 0 ){
            System.out.println("withdraw: " + previousTransaction);
        }else{
            System.out.println("No transcation occurred");
        }
    }

    void showMenu(){

        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is " + customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Check your previous trasaction");
        System.out.println("E. Exist");
        
        do{
            System.out.println("===============================================================");
            System.out.println("Enter an option");
            System.out.println("===============================================================");
            option = scanner.next().charAt(0);
            System.out.println("\n");


            switch(option){
                case 'A':
                System.out.println("-------------------------------");
                System.out.println("Balance = " + balance);
                System.out.println("-------------------------------");
                System.out.println("\n");
                break;


                case 'B':
                System.out.println("-------------------------------");
                System.out.println("Enter an amount to deposit");
                System.out.println("-------------------------------");
                Double amount = scanner.nextDouble();
                deposit(amount);
                System.out.println("\n");
                break;



                case 'C':
                System.out.println("-------------------------------");
                System.out.println("Enter an amount to withdraw");
                System.out.println("-------------------------------");
                Double amount2 = scanner.nextDouble();
                withdraw(amount2);
                System.out.println("\n");
                break;


                case 'D':
                System.out.println("-------------------------------");
                System.out.println();
                System.out.println("-------------------------------");
                System.out.println("\n");
                break;

                case 'E':
                System.out.println("***********************************************");
                break;

                default:
                    System.out.println("Invalid Option!! Please enter again");
                    break;
            }

        }while(option != 'E');
                System.out.println("Thank you for using our services");
            


        scanner.close();
        




    }
}
