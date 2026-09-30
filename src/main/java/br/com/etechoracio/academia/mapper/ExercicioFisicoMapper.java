package br.com.etechoracio.academia.mapper;


import br.com.etechoracio.academia.dto.ExercicioFisicoResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExercicioFisicoMapper {
    ExercicioFisicoResponseDto toResponseDto(ExercicioFisicoResponseDto entity);
}
