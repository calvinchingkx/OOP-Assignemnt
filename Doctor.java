import java.util.Scanner;

class Doctor
{
    String doc_id, doc_name, specialist, workTime, qualification;
    int doc_room;
    
    void newDoctor()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id (eg 001): ");
        doc_id = input.nextLine();
        System.out.print("name (eg Alex): ");
        doc_name = input.nextLine();
        System.out.print("specilization (eg Surgeon): ");
        specialist = input.nextLine();
        System.out.print("work time (9-11 AM): ");
        workTime = input.nextLine();
        System.out.print("qualification (MBBS,MD): ");
        qualification = input.nextLine();
        System.out.print("room no. (eg 001): ");
        doc_room = input.nextInt();
    }
    
    String showDoctorInfo()
    {
        return (doc_id + "\t\t\t\t" + doc_name + "\t\t\t\t" + specialist + "\t\t\t\t" + workTime + "\t\t\t\t" + qualification + "\t\t\t\t" + doc_room);
    }
    
}