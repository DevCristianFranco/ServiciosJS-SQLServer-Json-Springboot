package com.pruebacv.workbackend.services;


import com.pruebacv.workbackend.DatabaseEntity.Cliente;
import com.pruebacv.workbackend.Repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcesionarioService {

    @Autowired
    private ClienteRepository clienteRepository;

    public String registroCliente (String nombre, String direccion, String barrio, long telefono)
    {
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setBarrio(barrio);
        cliente.setDireccion(direccion);
        cliente.setTelefono(telefono);
        clienteRepository.save(cliente);
        return "Cliente Guardado en la Base de Datos";
    }

}
