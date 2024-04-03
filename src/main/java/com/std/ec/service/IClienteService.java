package com.std.ec.service;

import com.std.ec.model.dto.ClienteDto;
import com.std.ec.model.entity.Cliente;

public interface IClienteService {

    Cliente save(ClienteDto cliente); // Es guardar y actualizar.

    Cliente findById(Integer id);

    void delete(Cliente cliente);

    boolean existsByid(Integer id);

}
