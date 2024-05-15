package abstractFactory;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to LNMIIT Gate Prep App!");
        System.out.println("Choose the difficulty level:");
        System.out.println("1. Easy");
        System.out.println("2. Hard");
        System.out.print("Enter your choice: ");
        
        int choice = in.nextInt();

        PaperFactory factory;
        if (choice == 1) {
            factory = new EasyPaperFactory();
        } else if (choice == 2) {
            factory = new HardPaperFactory();
        } else {
            System.out.println("Invalid choice. Exiting...");
            in.close();
            return;
        }
        System.out.println("Preparing Paper:");
        preparePaper(factory);
        in.close();

    }

    public static void preparePaper(PaperFactory factory) {
        ComputerNetworksSection computerNetworksSection = factory.createComputerNetworksSection();
        BlockchainSection blockchainSection = factory.createBlockchainSection();
        MathsSection mathsSection = factory.createMathsSection();

        // Display sections
        computerNetworksSection.display();
        System.out.println();
        blockchainSection.display();
        System.out.println();
        mathsSection.display();
    }
}

