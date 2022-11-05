package gft.repositories;

import gft.entities.Fornecedor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
    Page<Fornecedor> findAll(Pageable pageable);
}
