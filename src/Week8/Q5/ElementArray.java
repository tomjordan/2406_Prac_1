package Week8.Q5;

public class ElementArray {
    public static void main(String[] args) {
        Element elements[] = new Element[5];
        int i;
        elements[0] = new MetalElement("Ag", 79, 196.97);
        elements[1] = new NonMetalElement("H", 1, 1);
        elements[2] = new MetalElement("Ag", 47, 107.9);
        elements[3] = new NonMetalElement("Ne", 1029, 20.18);
        elements[4] = new MetalElement("Cu", 29, 63.55);
        for (i = 0; i < elements.length; ++i)
            elements[i].describeElement();
    }
}