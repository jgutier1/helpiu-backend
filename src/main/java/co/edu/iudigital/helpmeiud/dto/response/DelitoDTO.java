package co.edu.iudigital.helpmeiud.dto.response;

import co.edu.iudigital.helpmeiud.model.Usuario;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DelitoDTO {

    Long id;

    String nombre;

    String descripcion;

    Usuario usuario;
}
