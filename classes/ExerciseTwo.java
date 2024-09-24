public class ExerciseTwo {
    public static void main(String[] args) {
        Car carFord = new Car();
        carFord.setRegistrationNumber("ABC123");
        carFord.setCarMake("Ford");
        carFord.setCurbWeight(2500);
        carFord.setHorsePower(450);
        carFord.setGeneration(2024);

      /*  System.out.println("Registration number: " + carFord.registrationNumber + "\n" + "Car make: " + carFord.carMake
                + "\n" + "Curb weight: " + carFord.curbWeight + "\n" + "Horse power: " + carFord.horsePower + "\n"
                + "Generation: " + carFord.generation);
                */ 
        System.out.println(carFord.getRegistrationNumber());
    }

}
