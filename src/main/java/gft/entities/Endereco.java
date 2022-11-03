package gft.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Endereco {

    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;




}
