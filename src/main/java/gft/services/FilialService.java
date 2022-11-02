package gft.services;


import gft.entities.Filial;
import gft.repositories.FilialRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilialService {


    private final FilialRepository filialRepository;

    public FilialService(FilialRepository filialRepository) {
        this.filialRepository = filialRepository;
    }


    public Filial saveFilial(Filial filial) {
        return filialRepository.save(filial);
    }

    public List<Filial> listarTodasFiliais() {
        return filialRepository.findAll();
    }


}
