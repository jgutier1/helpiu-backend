package co.edu.iudigital.helpmeiud.repository;

import co.edu.iudigital.helpmeiud.model.Delito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // opcional esta anotación
public interface IDelitoRepository
        extends JpaRepository<Delito, Long> {

    List<Delito> findByNombre(String nombre);// Spring Data JPA

    @Query("SELECT d FROM Delito d inner join d.usuario u")
    List<Delito> findAllWithUsuarios();
}
