package hospital;
import java.util.Scanner;
import java.io.*;

public class Patient {
    public String pid, pname, disease, sex, admit_status;
    public int age;

    public void new_patient() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("id:-");
            pid = input.nextLine();
            System.out.print("name:-");
            pname = input.nextLine();
            System.out.print("disease:-");
            disease = input.nextLine();
            System.out.print("sex:-");
            sex = input.nextLine();
            System.out.print("admit_status:-");
            admit_status = input.nextLine();
            System.out.print("age:-");
            age = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid age as a number.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            input.close(); // Close the scanner to prevent resource leak
        }
    }

    public void patient_info() {
        System.out.println(pid + "\t" + pname + " \t" + disease + "     \t" + sex + "      \t" + admit_status + "\t" + age);
    }
}