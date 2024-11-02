package library.reports;
import library.books.*;
import library.loans.*;
import library.members.Member;
import library.members.MemberManager;

import java.util.*;

public class ReportGenerator {
    int width=160;
    public void BookReport() {
        System.out.printf(" ".repeat(Math.max(0,((width-"Books".length())/2)))+"Books\n");
        System.out.printf(" ".repeat(Math.max(0,((width-"--------".length())/2)))+"-------\n\n");

        System.out.printf("  S.NO");
        System.out.printf(" ".repeat(width-150-6)+"Name");
        System.out.printf(" ".repeat(width-120)+"ISBN");
        System.out.printf(" ".repeat(width-130)+"Author");
        System.out.printf(" ".repeat(width-130)+"Published Year");
        System.out.printf(" ".repeat(width-145)+"IsAvailable\n");

        System.out.printf("  ----");
        System.out.printf(" ".repeat(width-150-6)+"----");
        System.out.printf(" ".repeat(width-120)+"----");
        System.out.printf(" ".repeat(width-130)+"------");
        System.out.printf(" ".repeat(width-130)+"--------------");
        System.out.printf(" ".repeat(width-145)+"-----------\n\n");
        List<Book> l=BookManager.getBookManagerObj().getBookList();
        int i=1;
        for(Book b:l) {
            String samp="  "+i;
            System.out.printf(samp);
            System.out.printf(" ".repeat(width-150-samp.length())+b.getName());
            System.out.printf(" ".repeat(width-120-b.getName().length()+4)+b.getIsbn());
            System.out.printf(" ".repeat(width-130-b.getIsbn().length()+4)+b.getAuthor());
            System.out.printf(" ".repeat(width-130-b.getAuthor().length()+6)+b.getPublishyear());
            System.out.printf(" ".repeat(width-145-4+14)+b.isIsavailable()+"\n");
            i++;
        }
    }
    public void MemberReport() {
        System.out.printf(" ".repeat(Math.max(0,((width-"Members".length())/2)))+"Members\n");
        System.out.printf(" ".repeat(Math.max(0,((width-"----------".length())/2)))+"---------\n\n");

        System.out.printf("  S.NO");
        System.out.printf(" ".repeat(width-150-6)+"Name");
        System.out.printf(" ".repeat(width-120)+"Member ID");
        System.out.printf(" ".repeat(width-130)+"E-mail");
        System.out.printf(" ".repeat(width-125)+"Phone\n");

        System.out.printf("  ----");
        System.out.printf(" ".repeat(width-150-6)+"----");
        System.out.printf(" ".repeat(width-120)+"---------");
        System.out.printf(" ".repeat(width-130)+"------");
        System.out.printf(" ".repeat(width-125)+"-----\n\n");

        List<Member> l= MemberManager.getMemberManagerObj().getMemberList();

        int i=1;
        for(Member b:l) {
            String samp="  "+i;
            System.out.printf(samp);
            System.out.printf(" ".repeat(width-150-samp.length())+b.getName());
            System.out.printf(" ".repeat(width-120-b.getName().length()+4)+b.getMemberid());
            System.out.printf(" ".repeat(width-130-b.getMemberid().length()+9)+b.getEmail());
            System.out.printf(" ".repeat(width-125-b.getEmail().length()+6)+b.getPhone()+"\n");
            i++;
        }
    }
    public void LoanReport() {
        System.out.printf(" ".repeat(Math.max(0,((width-"Loans".length())/2)))+"Loans\n");
        System.out.printf(" ".repeat(Math.max(0,((width-"--------".length())/2)))+"-------\n\n");

        System.out.printf("  S.NO");
        System.out.printf(" ".repeat(width-150-6)+"Loan ID");
        System.out.printf(" ".repeat(width-140)+"Member ID");
        System.out.printf(" ".repeat(width-130)+"Book ISBN");
        System.out.printf(" ".repeat(width-130)+"Loan Date");
        System.out.printf(" ".repeat(width-145)+"Return Date\n");

        System.out.printf("  ----");
        System.out.printf(" ".repeat(width-150-6)+"-------");
        System.out.printf(" ".repeat(width-140)+"---------");
        System.out.printf(" ".repeat(width-130)+"---------");
        System.out.printf(" ".repeat(width-130)+"---------");
        System.out.printf(" ".repeat(width-145)+"-----------\n\n");

        List<Loan> l= LoanManager.getLoanManagerObj().getLoanList();
        int i=1;
        for(Loan b:l) {
            String samp="  "+i;
            System.out.printf(samp);
            System.out.printf(" ".repeat(width-150-samp.length())+b.getLoanId());
            System.out.printf(" ".repeat(width-140-b.getLoanId().length()+7)+b.getMemberId());
            System.out.printf(" ".repeat(width-130-b.getMemberId().length()+9)+b.getBookIsbn());
            System.out.printf(" ".repeat(width-130-b.getBookIsbn().length()+9)+b.getLoanDate());
            System.out.printf(" ".repeat(width-145-b.getLoanDate().length()+9)+b.getReturnDate()+"\n");
            i++;
        }
    }
}
