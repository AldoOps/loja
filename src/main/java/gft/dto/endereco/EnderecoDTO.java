package gft.dto.endereco;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoDTO {

    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;



}
