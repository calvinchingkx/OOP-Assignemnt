import java.util.Scanner;

class Staff
{
    String staff_id, staff_name, designation, sex;
    int salary;
    
    void newStaff()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id (eg 001): ");
        staff_id = input.nextLine();
        System.out.print("name (eg Alex): ");
        staff_name = input.nextLine();
        System.out.print("desigination (eg Teacher):");
        designation = input.nextLine();
        System.out.print("sex (eg Male): ");
        sex = input.nextLine();
        System.out.print("salary (eg 1200):");
        salary = input.nextInt();
    }
    String showStaffInfo()
    {
        return (staff_id + "\t\t\t" + staff_name + "\t\t\t\t" + designation + "\t\t\t\t" + sex + "\t\t\t\t" + salary);
    }
}