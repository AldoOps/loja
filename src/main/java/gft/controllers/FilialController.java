package gft.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/filias")
public class FilialController {



    @GetMapping
    public ResponseEntity<?> buscarTodasAsFilias(){
        return ResponseEntity.ok(null);
    }


}
