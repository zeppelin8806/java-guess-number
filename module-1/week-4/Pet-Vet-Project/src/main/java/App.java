import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class App {

    private static final String FIELD_DELIMITER = "\\|";
    private static final int SPECIES_FIELD = 0;
    private static final int OWNER_FIELD = 1;
    private static final int PET_NAME_FIELD = 2;
    private static final int WEIGHT_FIELD = 3;
    private final Scanner keyboard = new Scanner(System.in);
    private List<String> species = new ArrayList<>();
    private List<String> owner = new ArrayList<>();
    private List<Integer> age = new ArrayList<>();
    private List<Double> weight = new ArrayList<>();

    public static void main(String[] args){

        App app = new App();
        app.loadData();
        app.run();
    }

    private void loadData() {

        String[] dataset = Dataset.load();
        for (int i = 0; i < dataset.length; i++) {
            String[] tempset = dataset[i].split(FIELD_DELIMITER);
            species.add(tempset[SPECIES_FIELD]);
            owner.add(tempset[OWNER_FIELD]);
            age.add(Integer.parseInt(tempset[PET_NAME_FIELD]));
            weight.add(Double.parseDouble(tempset[WEIGHT_FIELD]));
        }
    }

    private void run(){

        while (true){
            printMainMenu();
            int mainMenuSelection = promptForMenuSelection("Please choose and option: ");
            if (mainMenuSelection == 1){
                while (true){
                    printDataAndSubsetsMenu();
                    int dataAndSubsetsMenuSelection = promptForMenuSelection("Please choose an option: ");
                    if(dataAndSubsetsMenuSelection ==1){
                        displayDataset(Dataset.load());
                    } else if( dataAndSubsetsMenuSelection == 2){
                        displaySpeciesList(species);
                    } else if (dataAndSubsetsMenuSelection ==3) {
                        displayOwnerList(owner);
                    } else if (dataAndSubsetsMenuSelection == 4) {
                        displayAgeList(age);
                    } else if (dataAndSubsetsMenuSelection == 5) {
                        displayWeightList(weight);
                    } else if (dataAndSubsetsMenuSelection == 0) {
                        break;
                    }
                }
            } else if (mainMenuSelection ==2) {
                while (true){
                    printPetDetailsMenu();
                    int petDetailMenuSelection = promptForMenuSelection("Please choose an option: ");
                    if (petDetailMenuSelection ==1){
                        String filterSpecies = promptForString("Enter Species of Pet: ");



                        displaySpeciesList(species);
                    } else if (petDetailMenuSelection == 2) {
                        String filterOwner = promptForString("Enter name of Owner: ");



                        displayOwnerList(owner);
                    } else if (petDetailMenuSelection == 3) {
                        int filterEarlyAge = promptForPublishedYear("Enter \"from\" age (in full years): ");
                        int filterLaterAge = promptForPublishedYear("Enter \"to\" age (in full years): ");



                        displayAgeList(age);
                    } else if (petDetailMenuSelection == 4) {
                        int filterEarlyAge = promptForPublishedYear("Enter \"from\" age (in full years): ");
                        int filterLaterAge = promptForMenuSelection("Enter \"to\" age (in full years): ");



                        displayAgeList(age);
                    }

                }
            }
        }

    }

    private void printMainMenu() {
        System.out.println("1: Display data and subsets");
        System.out.println("2: Search Details of Pet");
        System.out.println("0: Exit");
        System.out.println();
    }
    private void printDataAndSubsetsMenu() {
        System.out.println("1: Display dataset");
        System.out.println("2: Display Species of Pet");
        System.out.println("3: Display Owner");
        System.out.println("4: Display Age of Pet");
        System.out.println("5: Display weight");
        System.out.println("0: Return to main menu");
        System.out.println();
    }
    private void printPetDetailsMenu() {
        System.out.println("1: Search by Species of Pet");
        System.out.println("2: Search by Owner");
        System.out.println("3: Search by Age of Pet");
        System.out.println("4: Search by Range of Age");
        System.out.println("5: Find youngest PEt");
        System.out.println("6: Find oldest Pet");
        System.out.println("7: Search by weight range");
        System.out.println("0: Return to main menu");
        System.out.println();
    }

    private void displayDataset(String[] dataset) {
        System.out.println("Dataset");
        System.out.println("-------");
        for (String data : dataset) {
            System.out.println(data);
        }
        System.out.println();
        promptForReturn();
    }

    private void displaySpeciesList(List<String> species) {
        System.out.println("Species");
        System.out.println("-------");
        for (int i = 0; i < species.size(); i++) {
            System.out.println(i + ": " + species.get(i));
        }
        System.out.println();
        promptForReturn();
    }

    private void displayOwnerList(List<String> owner) {
        System.out.println("Owners");
        System.out.println("-------");
        for (int i = 0; i < owner.size(); i++) {
            System.out.println(i + ": " + owner.get(i));
        }
        System.out.println();
        promptForReturn();
    }

    private void displayAgeList(List<Integer> age) {
        System.out.println("Age");
        System.out.println("---------------");
        for (int i = 0; i < age.size(); i++) {
            System.out.println(i + ": " + age.get(i));
        }
        System.out.println();
        promptForReturn();
    }

    private void displayWeightList(List<Double> weight) {
        System.out.println("Weight");
        System.out.println("------");
        for (int i = 0; i < weight.size(); i++) {
            System.out.println(i + ": " + weight.get(i));
        }
        System.out.println();
        promptForReturn();
    }

    private int promptForMenuSelection(String prompt) {
        System.out.print(prompt);
        int menuSelection;
        try {
            menuSelection = Integer.parseInt(keyboard.nextLine());
        } catch (NumberFormatException e) {
            menuSelection = -1;
        }
        return menuSelection;
    }

    private String promptForString(String prompt) {
        System.out.print(prompt);
        return keyboard.nextLine();
    }

    private int promptForPublishedYear(String prompt) {
        int year;
        while (true) {
            System.out.println(prompt);
            try {
                year = Integer.parseInt(keyboard.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("The year provided is not well-formed. It must be YYYY.");
            }
        }
        return year;
    }

    private double promptForPrice(String prompt) {
        double price;
        while (true) {
            System.out.println(prompt);
            try {
                price = Double.parseDouble(keyboard.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("The price provided is not a valid monetary value.");
            }
        }
        return price;
    }

    private void promptForReturn() {
        System.out.println("Press RETURN to continue.");
        keyboard.nextLine();
    }

}
