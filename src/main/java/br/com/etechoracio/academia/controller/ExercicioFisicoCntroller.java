package br.com.etechoracio.academia.controller;

import br.com.etechoracio.academia.dto.ExercicioFisicoResponseDto;
import br.com.etechoracio.academia.service.ExercicioFisicoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exercicios-fisicos")

public class ExercicioFisicoCntroller {

    private final ExercicioFisicoService service;

    public ExercicioFisicoCntroller(ExercicioFisicoService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<ExercicioFisicoResponseDto>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExercicioFisicoResponseDto> buscarPorId(@PathVariable Longid){
        return service.buscarPorId(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
