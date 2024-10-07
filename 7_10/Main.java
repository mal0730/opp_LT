import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal animal;
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose an animal: ");
        String a = sc.nextLine();

        switch (a) {
            case "Pig", "pig" -> {
                animal = new Pig();
                animal.ability();
            }
            case "Duck", "duck" -> {
                animal = new Duck();
                animal.ability();
            }
            case "Fish", "fish" -> {
                animal = new Fish();
                animal.ability();
            }
            case null, default -> {
                System.out.println("Can't find!");
                animal = new Animal();
                animal.ability();
            }
        }
    }
}
