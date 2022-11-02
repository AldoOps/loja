package gft.dto.endereco;

import gft.entities.Endereco;

public class EnderecoMapper {

    public static Endereco fromDTO(EnderecoDTO dto){
        return new Endereco(dto.getLogradouro(), dto.getNumero(), dto.getComplemento(), dto.getCep());
    }


}
