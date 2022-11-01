public class Driver implements IPayment{
    public String name;
    public int NoOfTrip;
    public int rate;

    public Driver(String name, int noOfTrip, int rate) {
        this.name = name;
        NoOfTrip = noOfTrip;
        this.rate = rate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfTrip() {
        return NoOfTrip;
    }

    public void setNoOfTrip(int noOfTrip) {
        NoOfTrip = noOfTrip;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public int getPayment() {
        return this.NoOfTrip * this.rate;
    }

    @Override
    public String getName() {
        return name;
    }
}
