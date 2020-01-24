package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CompaniaReducidaDTO {
	private String nombre;
	private String ruc;
	@JsonProperty(value = "razon_social")
	private String razonSocial;
}
