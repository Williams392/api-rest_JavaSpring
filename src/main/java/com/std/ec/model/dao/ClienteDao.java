package com.std.ec.model.dao;

import com.std.ec.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {
}


/* Interfaz ClienteDao y su uso:

_ ClienteDao: Es una interfaz que extiende CrudRepository<Cliente, Integer>. Esto significa que
  hereda métodos CRUD (Crear, Leer, Actualizar, Eliminar) estandar para la entidad Cliente, así
  como otros métodos útiles proporcionados por CrudRepository.

_ CrudRepository<Cliente, Integer>: Esta interfaz proporciona métodos CRUD para trabajar con la
  entidad Cliente. Cliente es el tipo de entidad con la que estamos trabajando, e Integer es el
  tipo de datos del identificador de la entidad.

_ Por lo tanto, al extender CrudRepository, ClienteDao obtiene automáticamente métodos como save(),
  findById(), findAll(), delete(), etc., que pueden ser utilizados para interactuar con la base de
  datos para la entidad Cliente.

 */