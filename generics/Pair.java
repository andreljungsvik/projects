import java.util.*;

public class Pair<T extends Comparable<T>> implements Comparable<Pair<T>> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public static <T extends Comparable<T>> boolean isSorted(List<T> list) {
        if (list.isEmpty() || list.size() < 2) {
            return true;
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }

    public static <T extends Comparable<T>> boolean allEqual(T o1, T o2, T o3) {
        return o1.compareTo(o2) == 0 && o2.compareTo(o3) == 0;
    }

    public static <T> boolean uniqueList(List<T> list) {
        if (list == null) {
            return true;
        }

        Set<T> uniqueElements = new HashSet<>();
        for (T element : list) {
            if (!uniqueElements.add(element)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean oddList(List<T> list) {
        return list != null && list.size() % 2 != 0;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair [first=" + first + ", second=" + second + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Pair<?> other = (Pair<?>) obj;

        return (first == null ? other.first == null : first.equals(other.first)) &&
                (second == null ? other.second == null : second.equals(other.second));
    }

    @Override
    public int hashCode() {
        int result = (first != null) ? first.hashCode() : 0;
        result = 31 * result + ((second != null) ? second.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Pair<T> other) {
        int firstComparison = first.compareTo(other.first);
        if (firstComparison != 0) {
            return firstComparison;
        }
        return second.compareTo(other.second);
    }
}
