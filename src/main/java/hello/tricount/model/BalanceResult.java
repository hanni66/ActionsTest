package hello.tricount.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BalanceResult {
    private Long senderMemberId;
    private String senderMemberName;
    private BigDecimal sendAmount;
    private Long receiverMemberId;
    private String receiverMemberName;
}
