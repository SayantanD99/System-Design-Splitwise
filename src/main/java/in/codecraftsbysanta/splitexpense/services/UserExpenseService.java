package in.codecraftsbysanta.splitexpense.services;

import in.codecraftsbysanta.splitexpense.models.UserExpense;
import in.codecraftsbysanta.splitexpense.repositories.UserExpenseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserExpenseService {
    private UserExpenseRepository userExpenseRepository;
    public UserExpense createUserExpense(UserExpense userExpense) {
        return userExpenseRepository.save(userExpense);
    }
}
