package com.astra.controller;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.astra.dto.ProjetoTeste50DTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class ProjetoTeste50Controller {

	@GetMapping("/")
	public ResponseEntity<ProjetoTeste50DTO> index() throws IOException {

		ProjetoTeste50DTO oProjetoTeste50DTO = new ProjetoTeste50DTO();
		oProjetoTeste50DTO.setData("Hello Word");
		return ResponseEntity.ok(oProjetoTeste50DTO);
	}

}