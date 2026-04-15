package piraozada.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import piraozada.domain.entity.Pedido;
import piraozada.repository.PedidoRepository;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class PedidoService {


    private final PedidoRepository pedidoRepository;

    public Pedido salvarPedido(Pedido pedido){
        BigDecimal preco= pedido.getTamanho().getPreco();
        BigDecimal quantidade = new BigDecimal(pedido.getQuantidade());
        pedido.setValorTotal(preco.multiply(quantidade));
        return pedidoRepository.save(pedido);
    }
}
