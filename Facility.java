import java.util.Scanner;

class Facility 
{
    String fac_name;
    void newFacility()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("fecility (eg Canteen): ");
        fac_name = input.nextLine();
    }
    String showFacility()
    {
        return (fac_name);
    }
}