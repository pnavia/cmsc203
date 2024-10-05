package Assignment2;
/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description: Models a medical procedure with name, date, practitioner, and charges. 
 * Due: 10/04/2024
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here:Paulo Navia
*/

public class Procedure {

    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double procedureCharge;

  
    public Procedure() {
        this.procedureName = "";
        this.procedureDate = "";
        this.practitionerName = "";
        this.procedureCharge = 0.0;
    }

    
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

  
    public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCharge) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.procedureCharge = procedureCharge;
    }

   
    public String getProcedureName() { return procedureName; }
    public void setProcedureName(String procedureName) { this.procedureName = procedureName; }

    public String getProcedureDate() { return procedureDate; }
    public void setProcedureDate(String procedureDate) { this.procedureDate = procedureDate; }

    public String getPractitionerName() { return practitionerName; }
    public void setPractitionerName(String practitionerName) { this.practitionerName = practitionerName; }

    public double getProcedureCharge() { return procedureCharge; }
    public void setProcedureCharge(double procedureCharge) { this.procedureCharge = procedureCharge; }



    public String toString() {
        return "Procedure Name: " + procedureName + "\tDate: " + procedureDate + "\tPractitioner: " + practitionerName +
               "\tCharge: $" + String.format("%.2f", procedureCharge);
    }
}
