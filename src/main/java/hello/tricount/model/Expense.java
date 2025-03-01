package hello.tricount.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Expense {
    private Long id;
    private String name;
    private Long settlementId;
    private Long payerMemberId;
    private BigDecimal amount;
    private LocalDateTime expenseDateTime;
}
