package piraozada.dto;


import lombok.Data;
import piraozada.enums.Sabor;
import piraozada.enums.Tamanho;
import java.time.LocalDate;





@Data
public class PedidoDTO {

    private String nomeCliente;
    private LocalDate dataPedido;
    private Sabor sabor;
    private Tamanho tamanho;
    private Integer quantidade;
}
