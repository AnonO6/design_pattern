package decorator;

import java.util.Scanner;

public class PUBGPlayerSkinDecoratorDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PlayerSkin playerSkin = new DefaultPlayerSkin();

        System.out.println("Welcome to PUBG Player Skin Decorator Demo");
        System.out.println("Choose skins to add:");

        boolean addMoreSkins = true;
        while (addMoreSkins) {
            System.out.println("1. Add Watch");
            System.out.println("2. Add Tattoo");
            System.out.println("3. Add Gun Skin");
            System.out.println("4. Done");

            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    playerSkin = new WatchDecorator(playerSkin);
                    System.out.println("Watch added!");
                    break;
                case 2:
                    playerSkin = new TattooDecorator(playerSkin);
                    System.out.println("Tattoo added!");
                    break;
                case 3:
                    playerSkin = new GunSkinDecorator(playerSkin);
                    System.out.println("Gun Skin added!");
                    break;
                case 4:
                    addMoreSkins = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please enter again.");
            }
        }

        System.out.println("\nFinal Player Skin:");
        playerSkin.showSkin();
        in.close();
    }
}
