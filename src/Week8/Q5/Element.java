package Week8.Q5;

public abstract class Element
{
    String symbol;
    int atomicNumber;
    double atomicWeight;
   Element(String s, int an, double aw)
    {
        symbol = s;
        atomicNumber =an;
        atomicWeight = aw;
    }
    String getSymbol()
    {
        return symbol;
    }
    int getAtomicNumber()
    {
        return atomicNumber;
    }
    double getAtomicWeight()
    {
        return atomicWeight;
    }
    abstract void describeElement();
}