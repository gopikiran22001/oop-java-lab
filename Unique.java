import java.util.*;

class Unique {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        Collections.addAll(l,"hello world", "world of programming", "hello java");
        Set<String> set=new HashSet<>();
        for(String i:l) {
            for(String j:i.split("\\s+")) {
                if(!set.contains(j)) {
                    set.add(j);
                }
            }
        }
        PriorityQueue<String> q = new PriorityQueue<>(
                (a, b) -> {
                    if (a.length() != b.length()) {
                        return Integer.compare(a.length(), b.length()); 
                    }
                    return a.compareTo(b); 
                }
        );
        for(String i:set) {
            q.add(i);
        }
        List<String> li=new ArrayList<>();
        while (!q.isEmpty()) {
            li.add(q.poll());
        }
        System.out.println(li);
    }
}
