import library.books.*;
import library.loans.*;
import library.reports.*;
import library.members.*;


public class LibraryManagementSystem {
    public static void main(String[] args) {
        BookManager bookManager=BookManager.getBookManagerObj();
        MemberManager memberManager=MemberManager.getMemberManagerObj();
        LoanManager loanManager=LoanManager.getLoanManagerObj();
        ReportGenerator reportGenerator=new ReportGenerator();

        bookManager.add(new Book("Fairy tail","002-550-889-333","Zeref",2021,true));
        bookManager.add(new Book("Unnamed Memory","992-560-009-883","Natsu",2023,true));
        bookManager.add(new Book("Dragon Slayer","012-789-996-890","Laxus",2015,false));
        bookManager.add(new Book("Class Room of Elite","412-856-756-003","Kiyotaka",2018,true));
        bookManager.add(new Book("The Eminence in the  Shadow","963-741-147-123","Cid",2020,true));

        memberManager.add(new Member("Kiran","2DHK00","thuop@123","6789054321"));
        memberManager.add(new Member("Prem","56YUIO","prem@143","6789012345"));
        memberManager.add(new Member("Roy","890OPL","roy@963","1357924680"));

        loanManager.issue(new Loan("ET5679IO","56YUIO","012-789-996-890","22-01-2024"));
        loanManager.issue(new Loan("GTY5647","2DHK00","963-741-147-123","14-03-2024"));
        loanManager.issue(new Loan("DGFR564","890OPL","002-550-889-333","17-05-2024"));

        loanManager.returndate("ET5679IO","22-11-2024");
        memberManager.display();
        loanManager.activeLoan();
        reportGenerator.LoanReport();
    }
}