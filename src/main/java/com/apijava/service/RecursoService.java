import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecursoService {
    @Autowired
    private RecursoRepository recursoRepository;

    public List<Recurso> buscarPorNome(String nomeRecurso) {
        return recursoRepository.findByNomeRecurso(nomeRecurso);
    }
}
