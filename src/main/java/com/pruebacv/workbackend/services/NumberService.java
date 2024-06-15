package com.pruebacv.workbackend.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class NumberService {


    public List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<Integer> filterEvenNumbersimpares (List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 != 0)
                .collect(Collectors.toList());
    }
}


