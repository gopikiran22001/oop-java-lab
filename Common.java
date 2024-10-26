import java.util.*;

class Common {

    public static Set<Integer> findCom(List<Set<Integer>> sets) {
        Set<Integer> commonElements = new HashSet<>(sets.get(0));
        for (int i = 1; i < sets.size(); i++) {
            commonElements.retainAll(sets.get(i));
        }
        return commonElements;
    }

    public static void main(String[] args) {
        List<Set<Integer>> sets = new ArrayList<>();
        sets.add(Set.of(1, 2, 3));
        sets.add(Set.of(2, 3, 4));
        sets.add(Set.of(3,5,6));

        System.out.println("Common elements in all sets: " + findCom(sets));
    }
}
