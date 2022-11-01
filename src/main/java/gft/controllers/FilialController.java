package gft.controllers;


import gft.dto.ConsultaFilialDTO;
import gft.dto.EnderecoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/filias")
public class FilialController {


    @GetMapping
    public ResponseEntity<List<ConsultaFilialDTO>> buscarTodasAsFilias() {

        EnderecoDTO endereco1 = new EnderecoDTO();
        endereco1.setLogradouro("Rua A");

        EnderecoDTO endereco2 = new EnderecoDTO();
        endereco2.setLogradouro("Rua B");

        ConsultaFilialDTO filial1 = new ConsultaFilialDTO();
        filial1.setName("Filial A");
        filial1.setEnderecoDTO(endereco1);

        ConsultaFilialDTO filial2 = new ConsultaFilialDTO();
        filial2.setName("Filial B");
        filial2.setEnderecoDTO(endereco2);


        List<ConsultaFilialDTO> list = List.of(filial1, filial2);

        return ResponseEntity.ok(list);


    }


}
