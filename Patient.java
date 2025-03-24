import java.util.Scanner;

class Patient
{
    String pat_id, pat_name, disease, sex, admitStatus;
    int age;
    
    void newPatient()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id (eg 001): ");
        pat_id = input.nextLine();
        System.out.print("name (eg Alex): ");
        pat_name = input.nextLine();
        System.out.print("disease (eg Covid): ");
        disease = input.nextLine();
        System.out.print("sex (eg Male): ");
        sex = input.nextLine();
        System.out.print("admit_status (eg y): ");
        admitStatus = input.nextLine();
        System.out.print("age (eg 18): ");
        age = input.nextInt();
    }
    String showPatientInfo()
    {
        return (pat_id + "\t\t\t\t" + pat_name + "\t\t\t\t" + disease + "\t\t\t\t" + sex + "\t\t\t\t\t" + admitStatus + "\t\t\t\t" + age);
    }
}