import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {
    @Autowired
    private ProjetoService projetoService;

    @GetMapping("/buscarPorDescricao")
    public List<Projeto> buscarProjetosPorDescricao(@RequestParam String descricao) {
        return projetoService.buscarPorDescricao(descricao);
    }
}
