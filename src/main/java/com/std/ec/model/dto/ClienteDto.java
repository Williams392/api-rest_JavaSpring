package com.std.ec.model.dto;

// estas importaciones son Automaticas:
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
// ---------------------


// Anotaciones de Lombok - En ves de CREAR UNO CADA UNO:
@Data
@ToString
@Builder
public class ClienteDto implements Serializable {


    private Integer idCliente; // Atributo para almacenar el ID del cliente
    private String nombre;
    private String apellido;
    private String correo;
    private Date fechaRegistro;

}




