package Week7.Task2;

public class DemoCandle {
    public static void main(String args[])
    {
        Candle aCandle = new Candle();
        ScentedCandle aScentedCandle = new ScentedCandle();
        aCandle.setColor("yellow");
        aCandle.setHeight(5);
        aScentedCandle.setColor("pink");
        aScentedCandle.setScent("caramel");
        aScentedCandle.setHeight(7);
        System.out.println("The " + aCandle.getHeight() + " inch " + aCandle.getColor() +
                " candle costs $" + aCandle.getPrice());
        System.out.println("The " + aScentedCandle.getHeight() + " inch " +
                aScentedCandle.getScent() +
                " " + aScentedCandle.getColor() +
                " candle costs $" + aScentedCandle.getPrice());
    }
}
