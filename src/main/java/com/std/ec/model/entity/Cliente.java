package com.std.ec.model.entity;

// ---------------------------
// Aplicando LOMBOK en entidad
// ---------------------------


// estas importaciones son Automaticas:
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
// ---------------------


// Anotaciones de Lombok - En ves de CREAR UNO CADA UNO:
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
/* Estas anotaciones de Lombok generan automáticamente métodos getter, setter, toString(), y un
constructor con todos los argumentos, uno sin argumentos y el método toString() para la clase.
Esto reduce la cantidad de codigo que necesitas escribir manualmente. */
// ---------------------


// Anotaciones de JPA para mapear esta clase a una tabla de la base de datos
@Entity // Indica que esta clase es una entidad JPA
@Table(name = "clientes")
public class Cliente implements Serializable {

    @Id // Indica que este atributo es la clave primaria de la tabla
    @Column(name = "id_cliente") // Especifica el nombre de la columna en la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que el valor de esta columna se generará automáticamente por la base de datos
    private Integer idCliente; // Atributo para almacenar el ID del cliente

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "correo")
    private String correo;
    @Column(name = "fecha_registro")
    private Date fechaRegistro;

}




/* En resumen, este código define una entidad JPA llamada Cliente, que se mapea a una tabla
llamada clientes en la base de datos. La entidad tiene varios atributos que representan las
columnas de la tabla, junto con anotaciones que indican cómo deben ser mapeados y generados
automáticamente. Lombok se utiliza para generar automáticamente los métodos de acceso,
constructores y toString().  */