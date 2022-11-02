package gft.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor


public class EnderecoDTO {

    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;

}
