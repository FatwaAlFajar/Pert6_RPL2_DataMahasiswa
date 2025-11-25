/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert6_51422104fajars.repository;

import com.mycompany.pert6_51422104fajars.model.ModelMahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Fajar
 */

@Repository
public interface MahasiswaRepository extends JpaRepository<ModelMahasiswa, Integer> {

}

