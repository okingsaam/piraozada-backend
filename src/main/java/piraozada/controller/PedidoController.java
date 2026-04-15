package piraozada.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import piraozada.domain.entity.Pedido;
import piraozada.dto.PedidoDTO;
import piraozada.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
@RequiredArgsConstructor
public class PedidoController{
    private final PedidoService  pedidoService;

    @PostMapping
    public ResponseEntity<Pedido> lancarPedidos(@RequestBody PedidoDTO dto){
        Pedido pedido = new Pedido();
        pedido.setNomeCliente(dto.getNomeCliente());
        pedido.setDataPedido(dto.getDataPedido());
        pedido.setTamanho(dto.getTamanho());
        pedido.setSabor(dto.getSabor());
        pedido.setQuantidade(dto.getQuantidade());
        Pedido salvo = pedidoService.salvarPedido(pedido);
        return ResponseEntity.ok(salvo);
    }

}