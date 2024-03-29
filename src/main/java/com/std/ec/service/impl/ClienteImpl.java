package com.std.ec.service.impl;

import com.std.ec.model.dao.ClienteDao;
import com.std.ec.model.entity.Cliente;
import com.std.ec.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service // importante porque ahora automaticamente detecta componentes de Spring.
public class ClienteImpl implements ICliente { // Importar los metodos ICliente automaticamente haciendo selct del foco rojo.

    @Autowired
    private ClienteDao clienteDao;

    @Transactional // elegir de springframework
    @Override
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Transactional(readOnly = true)
    @Override
    public Cliente findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }
}

/* _ @Transactional(readOnly = true) es importante en el método findById() porque indica que
   la operación se puede realizar en modo de solo lectura, lo que puede ser más eficiente y
   seguro en algunas situaciones. Esto también ayuda a resaltar la intención del método y a
   proporcionar información al lector del código sobre el comportamiento esperado del método.

   Explicacion del codigo:

   . Método save(): Este método guarda un cliente en la base de datos utilizando el método
      save() proporcionado por ClienteDao. Está anotado con @Transactional, lo que significa
      que toda la operación se llevará a cabo dentro de una transacción de base de datos.

   . Método findById(): Este método busca un cliente por su ID en la base de datos utilizando
     el método findById() proporcionado por ClienteDao. Está anotado con
     @Transactional(readOnly = true), lo que significa que esta operación no modificará los
     datos en la base de datos y, por lo tanto, se puede ejecutar en modo de solo lectura, lo
     que puede ser más eficiente.

 */


