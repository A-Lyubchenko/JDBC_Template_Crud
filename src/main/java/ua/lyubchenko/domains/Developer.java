package ua.lyubchenko.domains;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Developer {
    private int id;
    private String name;
    private int age;
    private String sex;
    private String phone_number;
    private int salary;
}
