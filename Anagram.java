import java.util.*;

class Anagram {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        Collections.addAll(l,"eat", "tea", "tan", "ate", "nat", "bat");
        Map<String,List<String>> map=new HashMap<>();
        List<List<String>> fin=new ArrayList<>();
        for(String i:l) {
            char[] ch=i.toCharArray();
            Arrays.sort(ch);
            String str=String.valueOf(ch);
            if(!map.containsKey(str)) map.put(str,new ArrayList<>());
            map.get(str).add(i);
        }
        for(String i:map.keySet()) {
            fin.add(map.get(i));
        }
        System.out.println(fin);
    }
}
