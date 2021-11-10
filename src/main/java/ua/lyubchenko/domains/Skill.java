package ua.lyubchenko.domains;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Skill {
    private int id;
    private String department;
    private String level;
}
