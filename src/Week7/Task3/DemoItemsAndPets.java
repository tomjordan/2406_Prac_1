package Week7.Task3;

public class DemoItemsAndPets
{
    public static void main(String[] args)
    {
        ItemSold item1 = new ItemSold();
        ItemSold item2 = new ItemSold();
        PetSold pet1 = new PetSold();
        PetSold pet2 = new PetSold();
        item1.setInvoiceNumber(100);
        item1.setDescription("30 gallon aquariam");
        item1.setPrice(40.00);
        item2.setInvoiceNumber(1435);
        item2.setDescription("hamster wheel");
        item2.setPrice(15.99);
        pet1.setInvoiceNumber(92301);
        pet1.setDescription("Standard poodle");
        pet1.setPrice(350.00);
        pet1.setIsVaccinated(true);
        pet1.setIsNeutered(true);
        pet1.setIsHousebroken(false);
        pet2.setInvoiceNumber(1236);
        pet2.setDescription("Siamese cat");
        pet2.setPrice(950.50);
        pet2.setIsVaccinated(true);
        pet2.setIsNeutered(false);
        pet2.setIsHousebroken(true);
        display(item1);
        display(item2);
        display(pet1);
        displayPetData(pet1);
        display(pet2);
        displayPetData(pet2);
    }
    public static void display(ItemSold item)
    {
        System.out.println("Invoice #" + item.getInvoiceNumber());
        System.out.println("     Description: " + item.getDescription());
        System.out.println("     Price: $" + item.getPrice());
    }
    public static void displayPetData(PetSold item)
    {
        System.out.println("     Vaccinated is " + item.getIsVaccinated());
        System.out.println("     Neutered is " + item.getIsNeutered());
        System.out.println("     Housebroken is " + item.getIsHousebroken());
    }
}
