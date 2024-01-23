import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    // The regex string to split the Strings in the dataset.
    private static final String FIELD_DELIMITER = "\\|";

    private static final int NAME_FIELD = 0;
    private static final int HOUSE_FIELD = 1;
    private static final int AGE_FIELD = 2;

    private final Scanner keyboard = new Scanner(System.in);

    private List<String> names = new ArrayList<>();
    private List<String> houses = new ArrayList<>();
    private List<Integer> ages = new ArrayList<>();

    public static void main(String[] args) {

        App app = new App();
        app.loadData();
        app.run();
    }
    private void loadData() {

        String[] dataset = Dataset.load();

        // TODO: populate arrays

        // "Harry|Gryffindor|12"   =>  "Harry", "Gryffindor", "12"
        //
        //  names  houses    ages

        // for(int i = 0; ....) NO, index needed so for-each loop
        for(String entry : dataset){
            // "Harry|Gryffindor|12"
            //String entry = dataset[0];
            String[] entryData = entry.split(FIELD_DELIMITER);

            names.add(entryData[NAME_FIELD]);
            houses.add(entryData[HOUSE_FIELD]);
            ages.add(Integer.parseInt(entryData[AGE_FIELD]));
        }
        // Repeat for each string in the dataset
    }

    private void run() {

        while (true) {
            // Main menu loop
            printMainMenu();
            int mainMenuSelection = promptForMenuSelection("Please choose an option: ");
            if (mainMenuSelection == 1) {
                // Display data and subsets loop
                while (true) {
                    printDataAndSubsetsMenu();
                    int dataAndSubsetsMenuSelection = promptForMenuSelection("Please choose an option: ");
                    if (dataAndSubsetsMenuSelection == 1) {
                        displayDataset(Dataset.load());
                    } else if (dataAndSubsetsMenuSelection == 2) {
                        displayNamesList(names);
                    } else if (dataAndSubsetsMenuSelection == 3) {
                        displayHousesList(houses);
                    } else if (dataAndSubsetsMenuSelection == 4) {
                        displayAgesList(ages);
                    } else if (dataAndSubsetsMenuSelection == 0) {
                        break;
                    }
                }
            }
            else if (mainMenuSelection == 2) {
                while (true) {
                    printSearchWizardMenu();
                    int searchWizardMenuSelection = promptForMenuSelection("Please choose an option: ");
                    if (searchWizardMenuSelection == 1) {
                        // Search by title
                        String filterName = promptForString("Enter name: ");

                        // TODO: Apply Filter

                        displayWizards(new ArrayList<Integer>());

                    } else if (searchWizardMenuSelection == 2) {
                        // Search by houses
                        String filterHouses = promptForString("Enter houses: ");

                        // TODO: Apply Filter
                        List<Integer> filteredWizardHousesIndexes = filterByHouse(filterHouses);

                        displayWizards(filteredWizardHousesIndexes);

                    } else if (searchWizardMenuSelection == 4) {
                        // Search by published year range
                        int filterAge = promptForAge("Enter age: ");

                        // TODO: Apply Filter

                        displayWizards(new ArrayList<Integer>());

                    } else if (searchWizardMenuSelection == 0) {
                        break;
                    }
                }
            } else if (mainMenuSelection == 0) {
                break;
            }
        }
    }

    /*
     * Display wizards
     */
    private void displayWizards(List<Integer> wizardIndexes){
        // So we have indexes 3, 4, 5 in a list called WizardIndexes

        // 1. Go through each of the indexes in the list
        for(Integer eachIndex : wizardIndexes) {

            // 2. Get the wizard info from the index
            String name = names.get(eachIndex);
            String house = houses.get(eachIndex);
            int age = ages.get(eachIndex);

            // 3. Print all the wizard info
            System.out.println("wizard: " + name + " in house: " + house + " who is " + age + " years old");
        }
    }

    /*
     * TODO: Filter!
     */
    private List<Integer> filterByName(String filterName) {
        return null;
    }

    private List<Integer> filterByHouse(String filterHouse) {
        List<Integer> indexesIntoHousesListThatMatchedUserInput = new ArrayList<>();
        System.out.println(filterHouse);

        // houses List<>
        // 0 "Gryffindor"
        // 1 "Gryffindor"
        // 2 "Gryffindor"
        // 3 "HufflePuff"
        // 4 "HufflePuff"
        // 5 "HufflePuff"
        // 6 "Ravenclaw"
        // 7 "Ravenclaw"
        // 8 "Ravenclaw"

        // 1, How to check each one of the houses????
        // Use fori looop b/c index is needed!!!!
        // for(int i = ...)
        for(int i = 0; i < houses.size(); i++){
            String eachHouse = houses.get(i);

            // 2. Check if the house matches the user input?!
            if(eachHouse.equalsIgnoreCase(filterHouse)){
                // 3. There's a match!....
                indexesIntoHousesListThatMatchedUserInput.add(i);
            }
        }

        // List should contain integers 3, 4, 5
        return indexesIntoHousesListThatMatchedUserInput;
    }

    private List<Integer> filterByAge(int filterAge) {
        return null;
    }

    // UI methods

    private void printMainMenu() {
        System.out.println("1: Display data and subsets");
        System.out.println("2: Search wizards");
        System.out.println("0: Exit");
        System.out.println();
    }

    private void printDataAndSubsetsMenu() {
        System.out.println("1: Display dataset");
        System.out.println("2: Display names");
        System.out.println("3: Display houses");
        System.out.println("4: Display ages");
        System.out.println("0: Return to main menu");
        System.out.println();
    }

    private void printSearchWizardMenu() {
        System.out.println("1: Search by name");
        System.out.println("2: Search by house");
        System.out.println("3: Search by age");
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

    private void displayNamesList(List<String> names) {
        System.out.println("Names");
        System.out.println("-------");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + ": " + names.get(i));
        }
        System.out.println();
        promptForReturn();
    }

    private void displayHousesList(List<String> houses) {
        System.out.println("Houses");
        System.out.println("-------");
        for (int i = 0; i < houses.size(); i++) {
            System.out.println(i + ": " + houses.get(i));
        }
        System.out.println();
        promptForReturn();
    }

    private void displayAgesList(List<Integer> ages) {
        System.out.println("Ages");
        System.out.println("---------------");
        for (int i = 0; i < ages.size(); i++) {
            System.out.println(i + ": " + ages.get(i));
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

    private int promptForAge(String prompt) {
        int year;
        while (true) {
            System.out.println(prompt);
            try {
                year = Integer.parseInt(keyboard.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("The age provided is not well-formed.");
            }
        }
        return year;
    }

    private void promptForReturn() {
        System.out.println("Press RETURN to continue.");
        keyboard.nextLine();
    }
}
