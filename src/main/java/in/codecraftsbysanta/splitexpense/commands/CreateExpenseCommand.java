package in.codecraftsbysanta.splitexpense.commands;

import in.codecraftsbysanta.splitexpense.controllers.ExpenseController;
import in.codecraftsbysanta.splitexpense.controllers.UserController;
import in.codecraftsbysanta.splitexpense.dtos.CreateExpenseRequest;
import in.codecraftsbysanta.splitexpense.dtos.CreateUserRequest;
import in.codecraftsbysanta.splitexpense.models.Expense;
import in.codecraftsbysanta.splitexpense.models.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

// Step 2 - Create the concrete command classes
@Component
@AllArgsConstructor
public class CreateExpenseCommand implements Command {

    private ExpenseController expenseController;

    @Override
    public boolean matches(String input) {
        String command = Command.getCommand(input);
        if (!command.equals(Commands.CREATE_EXPENSE_COMMAND)) {
            return false;
        }

        return true;
    }


    @Override
    public void execute(String input) {
        System.out.println("Executing create expense command");
        List<String> tokens = Command.getTokens(input);
        List<Long> userIds = Arrays.stream(tokens.get(3).split(","))
                .map(Long::valueOf)
                .toList();
        CreateExpenseRequest request = CreateExpenseRequest.builder()
                .description(tokens.get(1))
                .amount(Double.valueOf(tokens.get(2)))
                .userIds(userIds)
                .build();

        Expense expense = expenseController.createExpense(request);
        System.out.println("Created expense with id: " + expense.getId());
    }
}