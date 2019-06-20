package team.innovation.security;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "sec_user")
@Data
@ToString
public class User {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name = "code_")
    private String code;

    @Column(name = "name_")
    private String name;

    @Column(name = "pwd")
    private String password;
}
