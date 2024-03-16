package hospital;
import java.io.*;
import java.util.*;
import java.util.Calendar;
import java.sql.*;

class Fecility {
    public String fec_name;
    boolean isBooked = false;

    public void add_feci() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Facility Name: ");
            fec_name = input.nextLine();
        } finally {
            input.close(); // Close the Scanner to avoid resource leak
        }
    }

    public void show_feci() {
        System.out.println(fec_name);
    }

    public void bookFacility() {
        if (!isBooked) {
            System.out.println("Facility booked successfully!");
            isBooked = true;
        } else {
            System.out.println("Facility is already booked.");
        }
    }

    public void showBookingStatus() {
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
    }

    public static void saveEmergencyInfo(String name, int age, String location, String contactNumber) {
        try {
            FileWriter writer = new FileWriter("emergency.txt", true);
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Location to Reach: " + location + "\n");
            writer.write("Contact Number: " + contactNumber + "\n");
            writer.write("----------------------------------\n");
            writer.close();
            System.out.println("Emergency information saved to 'emergency.txt'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
