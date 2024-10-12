package in.codecraftsbysanta.splitexpense.controllers;

import in.codecraftsbysanta.splitexpense.dtos.CreateExpenseRequest;
import in.codecraftsbysanta.splitexpense.dtos.CreateGroupExpenseRequest;
import in.codecraftsbysanta.splitexpense.models.*;
import in.codecraftsbysanta.splitexpense.services.ExpenseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class ExpenseController {
    private ExpenseService expenseService;
    public Expense createExpense(CreateExpenseRequest request) {
        return expenseService.createExpense(request);
    }

    public UserExpense addUserExpense(CreateUserExpenseRequest request) {
        return expenseService.addUserExpense(request);
    }

    public GroupExpense createGroupExpense(CreateGroupExpenseRequest request) {
        return expenseService.createGroupExpense(request);
    }

    public Expense getExpense(Long id) {
        return expenseService.getExpense(id);
    }
}
