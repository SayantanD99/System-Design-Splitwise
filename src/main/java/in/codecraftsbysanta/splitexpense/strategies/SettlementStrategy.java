package in.codecraftsbysanta.splitexpense.strategies;

import in.codecraftsbysanta.splitexpense.dtos.SettleUpTransaction;
import in.codecraftsbysanta.splitexpense.models.Expense;


import java.util.List;

public interface SettlementStrategy {
    List<SettleUpTransaction> settleExpenses(List<Expense> expenses);

}