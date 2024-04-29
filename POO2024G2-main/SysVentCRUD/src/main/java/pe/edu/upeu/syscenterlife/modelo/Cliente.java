package pe.edu.upeu.syscenterlife.modelo;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    String dniruc;
    String nombres;
    String documento;

}
