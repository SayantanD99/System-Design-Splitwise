package in.codecraftsbysanta.splitexpense.repositories;

import in.codecraftsbysanta.splitexpense.models.UserExpense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserExpenseRepository extends JpaRepository<UserExpense, Long> {
}