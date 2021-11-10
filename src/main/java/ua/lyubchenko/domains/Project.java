package ua.lyubchenko.domains;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Project {
    private int id;
    private String name;
    private String start;
    private int coast;
}
