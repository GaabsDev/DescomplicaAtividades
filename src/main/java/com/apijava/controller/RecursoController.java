import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recursos")
public class RecursoController {
    @Autowired
    private RecursoService recursoService;

    @GetMapping("/buscarPorNome")
    public List<Recurso> buscarRecursosPorNome(@RequestParam String nomeRecurso) {
        return recursoService.buscarPorNome(nomeRecurso);
    }
}
