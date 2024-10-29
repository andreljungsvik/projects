import java.nio.file.*;

public class ExerciseThree {
    public static boolean isReadableRegularFile(Path p) {
        if (Files.isReadable(p)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Path p = Path.of(args[0]);
        System.out.println(isReadableRegularFile(p));
    }
}
