public class RacingApp {

    public static void main(String[] args) {
        /*
         * TODO: Create a pro race tour
         */
        ProRaceTour mushroomcup = new ProRaceTour();


        /*
         * TODO: Create a new racetrack
         */
        Racetrack forest500 = new Racetrack("forest500");

        /*
         * TODO: Create 1 competitor for the racetrack
         */
        //String pollyImageUrl = "https://raw.githubusercontent.com/dencee/method-climber/main/assets/images/polly-programmer.png";
        String potatoesImageUrl = "https://www.pngfind.com/pngs/m/55-556567_sacks-of-potatoes-potato-bag-png-transparent-png.png";
        Competitor potatoes = new Competitor("https://www.pngfind.com/pngs/m/55-556567_sacks-of-potatoes-potato-bag-png-transparent-png.png");

        /*
         * TODO: Add your competitor(s) to the racetrack
         */
        forest500.addCompetitor(potatoes);

        /*
         * TODO: Add the racetrack to the pro tour!
         */
        mushroomcup.addRacetrackToTheTour(forest500);

        /*
         *  TODO: Start your race from the tour!
         *   Do you see your competitor? Why aren't they moving??
         *   Go into the Competitor class and see if you can make them move
         */
        mushroomcup.startRace("forest500");

        /*
         * TODO: After getting 1 Competitor to move,
         *  try adding other competitors
         */
    }
}
