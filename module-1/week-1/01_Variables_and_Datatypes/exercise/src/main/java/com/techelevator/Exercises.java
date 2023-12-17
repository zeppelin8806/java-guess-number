package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int racoonsInWoods = 3;
		int racoonsGoHome = 2;
		int racconsLeftInWoods = racoonsInWoods - racoonsGoHome;

        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int bees = 3;
		int flowers = 5;
		int lessBees = flowers % bees;

        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int pigeon = 1;
		int anotherPigeon = 1;
		int totalPigeon = pigeon + anotherPigeon;

        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlsOnFence = 3;
		int owlsJoined = 2;
		int totalOwls = owlsJoined + owlsOnFence;

        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWorking = 2;
		int beaversSwimming = 1;
		int beaversStillWorking = beaversWorking - beaversSwimming;

        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansSitting = 2;
		int	toucansJoining = 1;
		int totalToucans = toucansSitting + toucansJoining;

        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrels = 4;
		int nuts = 2;
		int squirrelsThanNuts = squirrels - nuts;

        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double quarter;
		double dime;
		double nickels;
		quarter = .25;
		dime = .10;
		nickels = .05;
		double total = quarter + dime + (2*nickels);

        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int brier = 18;
		int macadam = 20;
		int flannery = 17;
		int totalMuffins = brier + macadam + flannery;

        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyo = (double).24;
		double whistle = (double).14;
		double totalSpent = yoyo + whistle;

        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int riceKrispies = 5;
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallows = largeMarshmallows + miniMarshmallows;

        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int hiltHouse = 29;
		int brecknockSchool = 17;
		int moreSnowThanSchool = hiltHouse - brecknockSchool;

        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2.50 on a pencil
        case. How much money does she have left?
        */
		int hiltMoney = 10;
		int toyTruck = 3;
		double pencil = (double)2.5;
		double hiltMoneyLeft = (double)(hiltMoney - toyTruck - pencil);

        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int marbleCollection = 16;
		int marblesLost = 7;
		int marblesLeft = marbleCollection - marblesLost;

        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int meganCurrentCollection = 19;
		int seashellsMeganWants = 25;
		int seashellsMeganNeeds = seashellsMeganWants - meganCurrentCollection;

        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int bradsBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = bradsBalloons - redBalloons;

        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int currentBooksOnShelf = 38;
		int booksPutOnShelf = 10;
		int booksOnShelf = currentBooksOnShelf + booksPutOnShelf;

        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int beesLegs = 6;
		int numberOfBees = 8;
		int totalBeesLegs = beesLegs * numberOfBees;

        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double costOfIceCream = (double)0.99;
		int quantityOfIceCream = 2;
		double totalcostOfIceCream = (double)(costOfIceCream*quantityOfIceCream);

        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int currentNumberOfRocks = 64;
		int totalRocksNeeded = 125;
		int rocksStillNeeded = totalRocksNeeded - currentNumberOfRocks;

        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int hiltMarbles = 38;
		int lostMarbles = 15;
		int hiltMarblesLeft = hiltMarbles-lostMarbles;

        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int milesAway = 78;
		int milesDrove = 32;
		int milesLeft = milesAway - milesDrove;

        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int saturdayMorning = 90;
		int saturdayAfternoon = 45;
		int minutesShovelingSnow = saturdayAfternoon + saturdayMorning;

        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		double costOfHotDog = (double).50;
		int numberOfHotDogs = 6;
		double totalCostOfHotDog = costOfHotDog * numberOfHotDogs;

        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		double hiltTotalMoney = (double)0.50;
		double costOfPencils = (double)0.07;
		int possiblePencilsBought = (int)(hiltTotalMoney/costOfPencils);

        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int butterfliesSeen = 33;
		int butterfliesOrange = 20;
		int butterfliesRed = butterfliesSeen - butterfliesOrange;

        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		int moneyGave = 1;
		double candyCost = (double)0.54;
		double changeBack = (double)(moneyGave-candyCost);

        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int treesBackyard = 13;
		int treesPlanted = 12;
		int treesTotal = treesBackyard+treesPlanted;

        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int dayTillGrandma = 2;
		int hoursInDay = 24;
		int hoursTillGrandma = dayTillGrandma*hoursInDay;

        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int kimCousins = 4;
		int gumPerCousin = 5;
		int gumNeeded = kimCousins*gumPerCousin;

        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double dansMoney = (double)3.00;
		double candyBar = (double)1.00;
		double moneyLeft = dansMoney - candyBar;

        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsInLake = 5;
		int peopleInBoat = 3;
		int peopleInLake = boatsInLake*peopleInBoat;

        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int ellenLegos = 380;
		int legosLost = 57;
		int legosLeft = ellenLegos-legosLost;

        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int bakedMuffins = 35;
		int muffinsNeeded = 83;
		int muffinsLeftBake = muffinsNeeded-bakedMuffins;

        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyCrayons = 1400;
		int lucyCrayons = 290;
		int moreCrayons = willyCrayons-lucyCrayons;

        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersOnPage = 10;
		int pageOfStickers = 22;
		int stickersTotal = stickersOnPage*pageOfStickers;

        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int cupcakesTotal = 100;
		int children = 8;
		double cupcakesPerChild = (double)cupcakesTotal/children;

        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int cookies = 47;
		int cookiesPerJar = 6;
		int cookiesLeftOver = cookies%cookiesPerJar;

        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int preparedCroissants = 59;
		int croissantsPerNeighbor = 8;
		int croissantsLeft = preparedCroissants%croissantsPerNeighbor;

        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookiesPerTray = 12;
		int cookiesNeeded = 276;
		int trayTotal = cookiesNeeded / cookiesPerTray;

        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int pretzelServingSize = 12;
		int pretzelsTotal = 480;
		int servingSizeTotal = pretzelsTotal/pretzelServingSize;

        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int cupcakesBaked = 53;
		int cupcakesForgotten = 2;
		int boxesOfCupcakes = (cupcakesBaked-cupcakesForgotten)/3;

        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotsPrepared = 74;
		int peopleServed = 12;
		int carrotsLeft = carrotsPrepared%peopleServed;

        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int totalBears = 98;
		int bearsPerShelf = 7;
		int shelvesNeeded = totalBears/bearsPerShelf;

        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int albumLimit = 20;
		int picturesTotal = 480;
		int albumsNeeded = picturesTotal/albumLimit;

        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int cardsCollected = 94;
		int fullBox = 8;
		int boxesFilled = cardsCollected/fullBox;
		int cardsInUnfilledBox = cardsCollected%fullBox;

        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int booksTotal = 210;
		int shelvesRepaired = 10;
		int booksPerShelf = booksTotal/shelvesRepaired;

        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double croissantsBaked = 17.0;
		double cristinaGuests = 7.0;
		double croissantsServed = (double)(croissantsBaked/cristinaGuests);

	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a standard room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 standard rooms?
	    Hint: Calculate the rate at which each painter can complete a room (rooms / hour), combine those rates, 
	    and then divide the total number of rooms to be painted by the combined rate.
	    */
     	double billRate = (double)(5/2.15);
		double jillRate = (double)(5/1.90);
		double ratesCombined = (billRate + jillRate);

	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName = "Grace";
		String lastName = "Hopper";
		String middle = "B.";
		String fullName = lastName + ", " + firstName + " " + middle;

	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		int distTotal = 800;
		int distTraveled = 537;
		double percentage = (double)(distTraveled/distTotal);
		double percentageTotal = percentage * 100;

	}

}
