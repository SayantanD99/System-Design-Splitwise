package in.codecraftsbysanta.splitexpense.repositories;

import in.codecraftsbysanta.splitexpense.models.GroupExpense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupExpenseRepository extends JpaRepository<GroupExpense, Long> {
}