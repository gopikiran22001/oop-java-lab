package library.loans;
public class Loan {
    private String loanId,memberId,bookIsbn,loanDate,returnDate;

    public Loan(String loanId, String bookIsbn, String memberId, String loanDate, String returnDate) {
        this.loanId = loanId;
        this.bookIsbn = bookIsbn;
        this.memberId = memberId;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    public Loan(String loanId, String memberId, String bookIsbn, String loanDate) {
        this.loanId = loanId;
        this.memberId = memberId;
        this.bookIsbn = bookIsbn;
        this.loanDate = loanDate;
    }

    public Loan(){}

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    public String toString() {
        return "Loan [ LoanID:"+loanId+", MemberID:"+memberId+", Book ISBN:"+bookIsbn+", Loan Date:"+loanDate+", Return Date:"+returnDate+" ]";
    }
}