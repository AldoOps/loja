package gft.controllers;

import gft.dto.cliente.ClienteMapper;
import gft.dto.cliente.ConsultaClienteDTO;
import gft.dto.cliente.RegistroClienteDTO;
import gft.entities.Cliente;
import gft.services.ClienteService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("vi/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<Page<ConsultaClienteDTO>> buscarTodosOsClientes(@PageableDefault Pageable pageable) {
        return ResponseEntity.ok(clienteService.listarTodosOsCliente(pageable).map(ClienteMapper::fromEntity));
    }

    @PostMapping
    public ResponseEntity<ConsultaClienteDTO> salvarCliente(@RequestBody RegistroClienteDTO dto) {
        Cliente cliente = clienteService.salvarCliente(ClienteMapper.fromDTO(dto));
        return ResponseEntity.ok(ClienteMapper.fromEntity(cliente));
    }

    @GetMapping("{id}")
    public ResponseEntity<ConsultaClienteDTO> buscarCliente(@PathVariable Long id) {
        Cliente cliente = clienteService.buscarCliente(id);
        return ResponseEntity.ok(ClienteMapper.fromEntity(cliente));
    }

    @PutMapping("{id}")
    public ResponseEntity<ConsultaClienteDTO> alterarCliente(@RequestBody RegistroClienteDTO dto, @PathVariable Long id) {
        try {
            Cliente cliente = clienteService.atualizarCliente(ClienteMapper.fromDTO(dto), id);
            return ResponseEntity.ok(ClienteMapper.fromEntity(cliente));
        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ConsultaClienteDTO> excluirCliente(@PathVariable Long id) {
        try {
            clienteService.excluirCliente(id);
            return ResponseEntity.ok().build();
        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }


}
