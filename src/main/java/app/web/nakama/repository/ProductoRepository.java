package app.web.nakama.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.web.nakama.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}
