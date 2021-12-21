package junior.joseluizrosa.tutorialrestkafka.controller;

import junior.joseluizrosa.tutorialrestkafka.data.PedidoData;
import junior.joseluizrosa.tutorialrestkafka.services.RegistraEventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequiredArgsConstructor
public class PedidoController {

    private final RegistraEventoService eventoService;

    @PostMapping(path = "api/salvar-pedido")
    public ResponseEntity<String> salvarPedido(@RequestBody PedidoData pedido) {
        eventoService.adicionarEvento("salvar-pedido", pedido);
        return ResponseEntity.ok("Sucesso");
    }
}
