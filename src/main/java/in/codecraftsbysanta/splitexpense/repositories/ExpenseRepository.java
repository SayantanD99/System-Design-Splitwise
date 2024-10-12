package in.codecraftsbysanta.splitexpense.repositories;

import in.codecraftsbysanta.splitexpense.models.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}