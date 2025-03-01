package hello.tricount.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@NoArgsConstructor
public class Settlement {
    private Long id;
    private String name;
    private List<Member> participants = new ArrayList<>();
}
