package com.pruebacv.workbackend.controller;


import com.pruebacv.workbackend.dto.ClienteRequest;
import com.pruebacv.workbackend.services.ConcesionarioService;
import com.pruebacv.workbackend.services.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class NumberCotroller {

    @Autowired
    private NumberService numberService;

    @Autowired
    private ConcesionarioService concesionarioService;

    @PostMapping("/filter-even")
    public List<Integer> filterEvenNumbers(@RequestBody List<Integer> numbers) {
        return numberService.filterEvenNumbers(numbers);
    }

    @PostMapping("/filter-evenimpares")
    public List<Integer> filterEvenNumbersimpares(@RequestBody List<Integer> numbers) {
        return numberService.filterEvenNumbersimpares(numbers);
    }

     @PostMapping("/registro-clientes")
    public String respuestaregistro (@RequestBody ClienteRequest request)
    {
        return concesionarioService.registroCliente(request.getNombre(), request.getDireccion(), request.getBarrio(), request.getTelefono());
    }
}
