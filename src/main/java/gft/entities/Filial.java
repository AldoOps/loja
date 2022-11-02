package gft.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "tb_filial")
public class Filial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Embedded
    private Endereco endereco;

    public Filial(Long id, String name, Endereco endereco) {
        this.id = id;
        this.name = name;
        this.endereco = endereco;
    }


}
