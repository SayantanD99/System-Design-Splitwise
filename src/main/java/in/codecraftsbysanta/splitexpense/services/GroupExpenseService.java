package in.codecraftsbysanta.splitexpense.services;

import in.codecraftsbysanta.splitexpense.models.GroupExpense;
import in.codecraftsbysanta.splitexpense.repositories.GroupExpenseRepository;
import in.codecraftsbysanta.splitexpense.repositories.GroupRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GroupExpenseService {
    private GroupExpenseRepository groupExpenseRepository;
    public GroupExpense createGroupExpense(GroupExpense groupExpense) {
        return groupExpenseRepository.save(groupExpense);
    }
}
