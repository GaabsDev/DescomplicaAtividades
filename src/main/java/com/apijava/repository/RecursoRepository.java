import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecursoRepository extends JpaRepository<Recurso, Long> {
    List<Recurso> findByNomeRecurso(String nomeRecurso);
}
