package gft.controllers;

import gft.dto.fornecedor.ConsultarFornecedorDTO;
import gft.dto.fornecedor.FornecedorMapper;
import gft.dto.fornecedor.RegistroFornecedorDTO;
import gft.entities.Fornecedor;
import gft.services.FornecedorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("V1/fornecedores")
public class FornecedorController {

    private final FornecedorService fornecedorService;

    public FornecedorController(FornecedorService fornecedorService) {
        this.fornecedorService = fornecedorService;
    }

    @GetMapping
    public ResponseEntity<Page<ConsultarFornecedorDTO>> buscarTodosFornecedores(@PageableDefault Pageable pageable){
        return ResponseEntity.ok(fornecedorService.listarTodosOsFornecedores(pageable).map(FornecedorMapper:: fromEntity));
    }


    @PostMapping
    public ResponseEntity<ConsultarFornecedorDTO> salvarFornecedor(@RequestBody RegistroFornecedorDTO dto){

        Fornecedor fornecedor = fornecedorService.salvarFornecedor(FornecedorMapper.fromDTO(dto));

        return ResponseEntity.ok(FornecedorMapper.fromEntity(fornecedor));

    }

    @GetMapping("{id}")
    public ResponseEntity<ConsultarFornecedorDTO> buscarFornecedor(@PathVariable Long id){

        Fornecedor fornecedor = fornecedorService.buscarFornecedor(id);

        return ResponseEntity.ok(FornecedorMapper.fromEntity(fornecedor));


    }

    @PutMapping("{id}")
    public ResponseEntity<ConsultarFornecedorDTO> alterarFornecedor(@RequestBody RegistroFornecedorDTO dto,
                                                                   @PathVariable Long id){

        try {

            Fornecedor fornecedor = fornecedorService.atualizarFornecedor(FornecedorMapper.fromDTO(dto), id);

            return ResponseEntity.ok(FornecedorMapper.fromEntity(fornecedor));
        }catch(RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }

    }

    @DeleteMapping("{id}")
    public ResponseEntity<ConsultarFornecedorDTO> excluirFornecedor(@PathVariable Long id){

        try {
            fornecedorService.excluirFornecedor(id);

            return ResponseEntity.ok().build();
        }catch(RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }

    }

}


