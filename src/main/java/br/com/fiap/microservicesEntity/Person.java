package br.com.fiap.microservicesEntity;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String firstName;

    private String lastName;
}
