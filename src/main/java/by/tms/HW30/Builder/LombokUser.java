package by.tms.HW30.Builder;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LombokUser {
private String name;
private String surname;
private int age;
private int id;
}
