package gft.dto.filial;


import gft.dto.endereco.EnderecoDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ConsultaFilialDTO {


    private Long id;
    private String name;
    private EnderecoDTO enderecoDTO;


}
