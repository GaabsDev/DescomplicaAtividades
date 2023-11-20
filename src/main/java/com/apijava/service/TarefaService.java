import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> buscarPorStatus(String statusTarefa) {
        return tarefaRepository.findByStatusTarefa(statusTarefa);
    }
}
