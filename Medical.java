import java.util.Scanner;

class Medical
{
    String med_name, manufacturer, expiryDate;
    int med_cost, count;
    
    void newMedical()
    {
        Scanner Input = new Scanner(System.in);
        System.out.print("name (eg Corex): ");
        med_name = Input.nextLine();
        System.out.print("comp (eg DDf pvt): ");
        manufacturer = Input.nextLine();
        System.out.print("exp_date (eg 1-1-2002): ");
        expiryDate = Input.nextLine();
        System.out.print("cost (eg 100): ");
        med_cost = Input.nextInt();
        System.out.print("no of unit (eg 100): ");
        count = Input.nextInt();
    }
    String findMedical()
    {
        return (med_name + "\t\t\t\t\t" + manufacturer + "\t\t\t\t\t" + expiryDate + "\t\t\t\t\t" + med_cost);
    }
}