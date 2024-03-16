package hospital;

import java.util.Scanner; // Add this import statement

public class Staff {
    public String sid, sname, desg, sex;
    public int salary;

    public void newStaff() {
        Scanner input = new Scanner(System.in);
        System.out.print("id: ");
        sid = input.nextLine();
        System.out.print("name: ");
        sname = input.nextLine();
        System.out.print("designation: ");
        desg = input.nextLine();
        System.out.print("sex: ");
        sex = input.nextLine();
        System.out.print("salary: ");
        salary = input.nextInt();
    }

    public void staffInfo() {
        System.out.println(sid + "\t" + sname + "\t" + sex + "\t" + salary);
    }
}
