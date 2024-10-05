package Assignment2;
/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description: Tests the Patient and Procedure classes, collecting input, displaying details, and giving total charges.
 * Due: 10/04/2024
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here:Paulo Navia
*/


import java.util.Scanner;

public class PatientDriverApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Program developed by Paulo Navia MC#21208859 Due Date: 10/04/2024\n");

       
        System.out.println("Enter patient's first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter patient's middle name:");
        String middleName = scanner.nextLine();
        System.out.println("Enter patient's last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter patient's street address:");
        String streetAddress = scanner.nextLine();
        System.out.println("Enter patient's city:");
        String city = scanner.nextLine();
        System.out.println("Enter patient's state:");
        String state = scanner.nextLine();
        System.out.println("Enter patient's ZIP code:");
        String zipCode = scanner.nextLine();
        System.out.println("Enter patient's phone number:");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter emergency contact name:");
        String emergencyName = scanner.nextLine();
        System.out.println("Enter emergency contact phone number:");
        String emergencyPhone = scanner.nextLine();

        
        Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode, phoneNumber, emergencyName, emergencyPhone);

        
        Procedure procedure1 = new Procedure("X-Ray", "06/12/2023");
        procedure1.setPractitionerName("Dr. Smith");
        procedure1.setProcedureCharge(200.0);

        Procedure procedure2 = new Procedure("MRI", "06/14/2023", "Dr. Allen", 500.0);

        Procedure procedure3 = new Procedure();
        procedure3.setProcedureName("Blood Test");
        procedure3.setProcedureDate("06/15/2023");
        procedure3.setPractitionerName("Nurse Kelly");
        procedure3.setProcedureCharge(150.0);

        displayPatient(patient);

        
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("Total Charges: $%,.2f%n", totalCharges);
    }

   
    public static void displayPatient(Patient patient) {
        System.out.println(patient.toString());
    }

    
    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure.toString());
    }

    
    public static double calculateTotalCharges(Procedure proc1, Procedure proc2, Procedure proc3) {
        return proc1.getProcedureCharge() + proc2.getProcedureCharge() + proc3.getProcedureCharge();
    }
}
