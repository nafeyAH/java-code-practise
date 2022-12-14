package bankmanagmentsystem.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity

public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long number;
    private String name;


}
