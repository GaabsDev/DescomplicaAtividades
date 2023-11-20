import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
    @Autowired
    private TarefaService tarefaService;

    @GetMapping("/buscarPorStatus")
    public List<Tarefa> buscarTarefasPorStatus(@RequestParam String statusTarefa) {
        return tarefaService.buscarPorStatus(statusTarefa);
    }
}
