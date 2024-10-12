package in.codecraftsbysanta.splitexpense.commands;

import in.codecraftsbysanta.splitexpense.controllers.ExpenseController;
import in.codecraftsbysanta.splitexpense.dtos.CreateExpenseRequest;
import in.codecraftsbysanta.splitexpense.models.CreateUserExpenseRequest;
import in.codecraftsbysanta.splitexpense.models.Expense;
import in.codecraftsbysanta.splitexpense.models.ExpenseType;
import in.codecraftsbysanta.splitexpense.models.UserExpense;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

// Step 2 - Create the concrete command classes
@Component
@AllArgsConstructor
public class AddUserExpenseCommand implements Command {

    private ExpenseController expenseController;

    @Override
    public boolean matches(String input) {
        String command = Command.getCommand(input);
        if (!command.equals(Commands.ADD_USER_EXPENSE)) {
            return false;
        }

        return true;
    }


    @Override
    public void execute(String input) {
        System.out.println("Executing create expense command");
        List<String> tokens = Command.getTokens(input);
        CreateUserExpenseRequest request = CreateUserExpenseRequest.builder()
                .expenseId(Long.valueOf(tokens.get(1)))
                .userId(Long.valueOf(tokens.get(2)))
                .amount(Double.valueOf(tokens.get(3)))
                .type(ExpenseType.valueOf(tokens.get(4)))
                .build();

        UserExpense expense = expenseController.addUserExpense(request);
        System.out.println("Created expense with id: " + expense.getId());
    }
}