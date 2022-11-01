public class MonthlyPayment implements IPayment{
     public int rental;
     public int unitOfUse;
     public int rate;
     public int internetRate;

    public MonthlyPayment(int rental, int unitOfUse, int rate, int internetRate) {
        this.rental = rental;
        this.unitOfUse = unitOfUse;
        this.rate = rate;
        this.internetRate = internetRate;
    }

    public int getInternetRate() {
        return internetRate;
    }

    public void setInternetRate(int internetRate) {
        this.internetRate = internetRate;
    }

    public int getRental() {
        return rental;
    }

    public void setRental(int rental) {
        this.rental = rental;
    }

    public int getUnitOfUse() {
        return unitOfUse;
    }

    public void setUnitOfUse(int unitOfUse) {
        this.unitOfUse = unitOfUse;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public int getPayment() {
        return internetRate+(unitOfUse*rate)+rental;
    }

    @Override
    public String getName() {
        return "MonthlyPayment";
    }
}
