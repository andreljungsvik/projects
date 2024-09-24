public class ExerciseFour {
    public static void main(String[] args) {

        FighterRobot robotOne = new FighterRobot();
        robotOne.setName("zZzDussyPestroyerzZz");
        robotOne.setStrength(69);
        robotOne.setWeapon("Rock");

        FighterRobot robotTwo = new FighterRobot();
        robotTwo.setName("Shrek");
        robotTwo.setStrength(666);
        robotTwo.setWeapon("AK-47");

        fight(robotOne, robotTwo);
    }

    private static void fight(FighterRobot robotOne, FighterRobot robotTwo) {
        if (robotOne.getStrength() == robotTwo.getStrength()) {
            System.out.println("It's a tie!");
            return;
        }

        FighterRobot winner = robotOne;
        if (robotOne.getStrength() < robotTwo.getStrength()) {
            winner = robotTwo;
        }
        System.out.printf("Robot %s wins the fight with its %s!", winner.getName(), winner.getWeapon());
    }
}
