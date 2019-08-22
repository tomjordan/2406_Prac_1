package Week4;

public class Lease {
    private String name;
    private int appNum;
    private int rent;
    private int lease;

   public Lease(){
       this.name = "Bob";
       this.appNum = 15;
       this.rent = 400;
       this.lease = 12;
    }

    public void setAppNum(int appNum) {
        this.appNum = appNum;
    }

    public void setLease(int lease) {
        this.lease = lease;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getAppNum() {
        return appNum;
    }

    public int getLease() {
        return lease;
    }

    public int getRent() {
        return rent;
    }

    public String getName() {
        return name;
    }

    public void petFee(){
       this.rent = this.rent+10;
    }

    public void explainPetPolicy(){
        System.out.println("The additional pet fee is due to increased " +
                "risk of damage to the property caused by your pet");
    }
}
