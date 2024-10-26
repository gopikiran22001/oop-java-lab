import java.util.*;

class Frequent {

    public static List<Integer> findk(List<Integer> li,int k) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(Integer  i:li) {
            if(!map.containsKey(i)) map.put(i,0);
            map.put(i,map.get(i)+1);
        }
        PriorityQueue<Integer> q=new PriorityQueue<>();
        Set<Integer> set=map.keySet();
        for(Integer i:set) {
            if(map.get(i)>=k) q.add(i);
        }
        while (!q.isEmpty()) {
            l.add(q.poll());
        }
        return l;
    }

    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        Collections.addAll(l,1, 1, 1, 2, 2, 3);
        System.out.println(findk(l,2));
    }
}
