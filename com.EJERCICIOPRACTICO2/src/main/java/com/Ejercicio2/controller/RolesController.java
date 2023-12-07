/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Ejercicio2.controller;

import com.Ejercicio2.domain.Roles;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Roles")
public class RolesController {

    private final RolesController rolesRepository;

    public RolesController(RolesController rolesRepository) {
        this.rolesRepository = rolesRepository;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Roles roles) {
        rolesRepository.save(roles);
        return ResponseEntity.ok(roles);
    }

    private void save(Roles roles) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}