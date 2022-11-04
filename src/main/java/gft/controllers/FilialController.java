package gft.controllers;


import gft.dto.filial.ConsultaFilialDTO;
import gft.dto.filial.FilialMapper;
import gft.dto.filial.RegistroFilialDTO;
import gft.entities.Filial;
import gft.services.FilialService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("v1/filiais")
public class FilialController {

    private final FilialService filialService;

    public FilialController(FilialService filialService) {
        this.filialService = filialService;
    }

    @GetMapping
    public ResponseEntity<List<ConsultaFilialDTO>> buscarTodasFilias() {
        return ResponseEntity.ok(filialService.listarTodasAsFilias().stream().map(FilialMapper::fromEntity).collect(Collectors.toList()));
    }

    @PostMapping
    public ResponseEntity<ConsultaFilialDTO> salvarFilial(@RequestBody RegistroFilialDTO dto) {
        Filial filial = filialService.salvarFilial(FilialMapper.fromDTO(dto));
        return ResponseEntity.ok(FilialMapper.fromEntity(filial));


    }



}
