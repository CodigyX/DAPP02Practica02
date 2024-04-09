/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/Repository.java to edit this template
 */
package org.uv.DAPP02Practica02;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Codigy
 */
public interface RepositoryEmpleado extends JpaRepository<Empleado, Long> {
    
}
