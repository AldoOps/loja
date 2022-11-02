package gft.repositories;

import gft.entities.Filial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilialRepository  extends JpaRepository<Filial, Long> {
}
