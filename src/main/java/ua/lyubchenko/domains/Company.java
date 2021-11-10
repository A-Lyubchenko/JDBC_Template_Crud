package ua.lyubchenko.domains;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Company {
    private int id;
    private String name;
    private String location;
}
