package ab.techstack.azure.springboot.api.SpringBootOnAzure.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name= "PERSON")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Person {

    @Id
    @Column(name="id")
    @GeneratedValue
    private Long id;

    @Column(name="first_name")
    private String first_name;

    @Column(name="last_name")
    private String last_name;

    @Column(name="email")
    private String email;

}
