package Week4;

public class Billing {

    /*double price;
    int numberBooks;
    int coupon;
    double totalPrice;*/


    double computeBill(double price){
       /* this.price = price;
        this.totalPrice = price + price*.08;*/
        return price*1.08;
    }

    double computeBill(double price, int numBooks){
        return (price*numBooks)*1.08;
    }

    double computeBill(double price, int numBooks, int coupon){
        return (price*numBooks - coupon)*1.08;
    }



}
