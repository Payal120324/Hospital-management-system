package hospital;
import java.util.Scanner; // Add this import statement
public class Lab
{
    public String fecility;
    public int lab_cost;
    public void new_feci()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("fecility:-");
        fecility = input.nextLine();
        System.out.print("cost:-");
        lab_cost = input.nextInt();
    }
    public void feci_list()
    {
        System.out.println(fecility + "\t\t" + lab_cost);
    }
}