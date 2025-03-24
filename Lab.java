import java.util.Scanner;

class Lab
{
    String lab_name;
    int lab_cost;
    void newLab()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("facility (eg X - ray): ");
        lab_name = input.nextLine();
        System.out.print("cost (eg 100): ");
        lab_cost = input.nextInt();
    }
    String labList()
    {
        return (lab_name + "\t\t\t\t\t" + lab_cost);
    }
}