public abstract class Staff implements IPayment,Tax
{
    protected int salary;
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Staff(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public abstract int getPayment();

}
