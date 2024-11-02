package library.members;
import java.util.*;

public class MemberManager {
    private  List<Member> l=new ArrayList<>();
    public void add(Member memb) {
        l.add(memb);
    }
    public void remove(Member memb) {
        l.remove(memb);
    }

    private static MemberManager memberManager;

    private MemberManager(){}

    public static MemberManager getMemberManagerObj() {
        if(memberManager==null) {
            memberManager=new MemberManager();
        }
        return memberManager;
    }

    public Member search(String inan) {
        Member memb=null;
        for(Member b:l) {
            if (b.getMemberid()==inan || b.getName()==inan)
            {
                memb=b;
                break;
            }
        }
        return memb;
    }
    public Member search(String id,String name) {
        Member memb=null;
        for(Member b:l) {
            if (b.getMemberid()==id && b.getName()==name)
            {
                memb=b;
                break;
            }
        }
        return memb;
    }
    public void display() {
        for(Member memb:l) {
            System.out.println(memb);
        }
    }
    public List<Member> getMemberList() {
        return l;
    }
}