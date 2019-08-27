package Week4;

public class Sandwich {
    String mainingrediant;
    String breadtype;
    Double price;

    public String getMain() {
        return this.mainingrediant;
    }

    public String getBread() {
        return this.breadtype;

    }

    public double getPrice() {
        return this.price;

    }

    public void setMain(String maining) {
        this.mainingrediant = maining;

    }

    public void setBread(String bread) {
        this.breadtype = bread;
    }

    public void setPrice(double newprice) {
        this.price = newprice;
    }


}
