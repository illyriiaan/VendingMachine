//VendingMachine.
// Känns väldigt groggigt i huvudet just nu.
// OOP var lite komplicerat men det börjar falla på plats,
// behöver göra en rejäl genomgång av alla tidigare lectures på teams.

package VendingMachine;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int balance;

    void deposition() {
        int[] denominations = {1,2,5,10,20,50,100,200,500,1000};


        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!"
                + "\nPlease deposit funds " + Arrays.toString(denominations));
        int deposit = scanner.nextInt();
        switch (deposit) {
            case 1:
            case 2:
            case 5:
            case 10:
            case 20:
            case 50:
            case 100:
            case 200:
            case 500:
            case 1000:
                addCurrency(deposit);
                System.out.println("Deposited");
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid denomination \nAccepted denominations: " + Arrays.toString(denominations));
                deposition();
        }

    }

    void addCurrency (int amount){
        balance+=amount;

    }

    public static void main(String[] args) {

    Main main = new Main();
    main.deposition();
    }
}
