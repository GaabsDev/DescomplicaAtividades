import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
    List<Projeto> findByDescricao(String descricao);
}
