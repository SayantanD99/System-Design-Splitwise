package in.codecraftsbysanta.splitexpense.exceptions;

public class ExpenseNotFoundException extends RuntimeException {
    public ExpenseNotFoundException(Long expenseId) {
        super("Expense not found: " + expenseId);
    }
}
