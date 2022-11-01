import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<IPayment> staffs = new ArrayList<IPayment>();
        Developer dev1 = new Developer("John Doe",35000, 20, 500);
        staffs.add(dev1);
        Developer dev2 = new Developer("Marry Ann",35000, 10, 300);
        staffs.add(dev2);
        CEO ceo1 = new CEO("Elon Musk", 150000, 4, 20000);
        staffs.add(ceo1);
        Marketing marketing1 = new Marketing("Sara Wong",30000,2,500);
        staffs.add(marketing1);
        Driver driver1 = new Driver("Bill Sim",10,500);
        staffs.add(driver1);
        Cleaner cleaner1 = new Cleaner("Somsi Time",10,300);
        staffs.add(cleaner1);
        MonthlyPayment monthly = new MonthlyPayment(3000,30,1000,2500);
        staffs.add(monthly);


        int totalPayment = 0;
        for (IPayment staff : staffs) {
            System.out.println(staff.getName() + " = " + staff.getPayment());
            totalPayment += staff.getPayment();
        }
        System.out.println("Total Payment: " + totalPayment);

        int totalTax = dev1.getTax()+ceo1.getTax()+marketing1.getTax();
        System.out.println("Total Tax:"+totalTax);
    }
}