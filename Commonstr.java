import java.util.*;

class Commonstr {

    public static List<String> findstr(List<String> li) {
        Set<String> set=new HashSet<>();
        List<String> l=new ArrayList<>();
        for(String i:li) {
            if(set.contains(i)) continue;;
            l.add(i);
            set.add(i);
        }
        return l;
    }

    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        String sentence="the quick brown fox jumps over the lazy dog";
        Collections.addAll(l,sentence.split("\\s+"));
        System.out.println(String.join(" ", findstr(l)));
    }
}
