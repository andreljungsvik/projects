public class ExerciseThree {
    public enum WeekDays {
        MON, TUE, WED, THU, FRI, SAT, SUN;

        @Override
        public String toString() {
            switch (this) {
                case MON:
                    return "Måndag";
                case TUE:
                    return "Tisdag";
                case WED:
                    return "Onsdag";
                case THU:
                    return "Torsdag";
                case FRI:
                    return "Fredag";
                case SAT:
                    return "Lördag";
                case SUN:
                    return "Söndag";
                default:
                    return null;
            }
        }
    }

    // public static void main(String[] args) {
    //     System.out.println("Alla veckodagar: ");
    //     for (WeekDays day : WeekDays.values()) {
    //         System.out.println(day);
    //     }
    //     System.out.println("Specifik dag: " + WeekDays.FRI);
    // }
}
