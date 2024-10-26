import java.util.*;

class Commonpair {

    public static Set<Set<Integer>> finduni(Set<Integer> lo,int k) {
        Set<Integer> set=new HashSet<>(lo);
        Set<Set<Integer>> l=new HashSet<>();
        for(Integer i:set) {
            if(set.contains(k-i)) {
                l.add(Set.of(i,k-i));
            }
        }
        return l;
    }

    public static void main(String[] args) {
        Set<Integer> set=Set.of(1, 2, 3, 4, 5, 6);
        int k=7;
        System.out.println("unique pairs: " + finduni(set,k));
    }
}
