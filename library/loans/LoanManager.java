package library.loans;
import java.util.*;

public class LoanManager {

    private List<Loan> l=new ArrayList<>();

    public void issue(Loan loan) {
        l.add(loan);
    }
    public void returndate(String loanid,String returnDate) {

        for(Loan loan:l) {
            if(loan.getLoanId().equals(loanid)) {
                loan.setReturnDate(returnDate);
            }
        }

    }

    private static LoanManager loanManager;

    private LoanManager(){}

    public static LoanManager getLoanManagerObj() {
        if(loanManager==null) {
            loanManager=new LoanManager();
        }
        return  loanManager;
    }

    public void display() {
        for(Loan loan:l) {
            System.out.println(loan);
        }
    }
    public void activeLoan() {
        for(Loan loan:l) {
            if(loan.getReturnDate()==null) {
                System.out.println(loan);
            }
        }
    }
    public List<Loan> getLoanList() {
        return l;
    }
}