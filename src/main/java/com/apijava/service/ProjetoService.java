import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjetoService {
    @Autowired
    private ProjetoRepository projetoRepository;

    public List<Projeto> buscarPorDescricao(String descricao) {
        return projetoRepository.findByDescricao(descricao);
    }
}
