public class Cleaner implements IPayment{
    public String name;
    public int DayOfWork;
    public int rate;

    public Cleaner(String name, int dayOfWork, int rate) {
        this.name = name;
        DayOfWork = dayOfWork;
        this.rate = rate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDayOfWork() {
        return DayOfWork;
    }

    public void setDayOfWork(int dayOfWork) {
        DayOfWork = dayOfWork;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public int getPayment() {
        return this.DayOfWork*this.rate;
    }

    @Override
    public String getName() {
        return name;
    }
}
