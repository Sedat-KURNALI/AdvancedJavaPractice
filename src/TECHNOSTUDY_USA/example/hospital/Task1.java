package TECHNOSTUDY_USA.example.hospital;

public class Task1 {

    public static void main(String[] args) {
/*
Profile {
    String Adress;
    String email;
    String Phone;
public class Diagnosis {
    Boolean fever;
    Boolean cough;
    Boolean sneezing;
    Boolean sourthroat;
 */
Profile user1profile = new Profile();
user1profile.Adress = "700 Main Str.";
user1profile.email = "at@gmail.com";
user1profile.Phone = "+1234123";

Diagnosis user1diagnosis = new Diagnosis();
user1diagnosis.cough = true;
user1diagnosis.fever = false;
user1diagnosis.sneezing = false;
user1diagnosis.sourthroat = true;

Patient patient1 = generatePatient(12345, "John", user1profile, user1diagnosis );
printAttributes(patient1);

    }

    public static Patient generatePatient(int iD, String name, Profile patientInfo, Diagnosis patientStory ) {
        Patient patient = new Patient();
        patient.iD = iD;
        patient.name = name;

        patient.patientinfo = new Profile();
        patient.patientinfo.Adress = patientInfo.Adress;
        patient.patientinfo.email = patientInfo.email;
        patient.patientinfo.Phone = patientInfo.Phone;

        patient.patientstory = new Diagnosis();
        patient.patientstory.cough = patientStory.cough;
        patient.patientstory.fever = patientStory.fever;
        patient.patientstory.sneezing = patientStory.sneezing;
        patient.patientstory.sourthroat = patientStory.sourthroat;

        return patient;
    }

    public static void printAttributes(Patient patient) {
        System.out.println("\nPatientiD : " + patient.iD);
        System.out.println("PatientName : " + patient.name);
        System.out.println("PatientName : " + patient.patientinfo.Adress);
        System.out.println("Patient e-mail : " + patient.patientinfo.email);
        System.out.println("Patient phone : " + patient.patientinfo.Phone);
        System.out.println("is Patient coughing : " + patient.patientstory.cough);
        System.out.println("Patient has a fever : " + patient.patientstory.fever);
        System.out.println("is Patient sneezing : " + patient.patientstory.sneezing);
        System.out.println("Patient has a sourthroat : " + patient.patientstory.sourthroat);


    }
}
