package Week7.Task1;

public class DemoHorses {
    public static void main(String args[])
    {
        Horse horse1 = new Horse();
        RaceHorse horse2 = new RaceHorse();
        horse1.setName("Charlie the Horse");
        horse1.setColor("black");
        horse1.setBirthYear(2013);
        horse2.setName("Mark the Horse");
        horse2.setColor("brown");
        horse2.setBirthYear(2016);
        horse2.setRaces(5);
        System.out.println(horse1.getName() + " is " +
                horse1.getColor() + " and was born in " + horse1.getBirthYear() + ".");
        System.out.println(horse2.getName() + " is " +
                horse2.getColor() + " and was born in " + horse2.getBirthYear() + ".");
        System.out.println(horse2.getName() + " has been in " + horse2.getRaces() + " races.");
    }

}
