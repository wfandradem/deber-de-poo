/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.encuestas.domain;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstudiante;
    private String nombre;
    private String apellido;
    @JsonIgnore
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="pensum_id", nullable = false)
	private Set<Pensum> pensum;
    
    public Estudiante() {
        super();
    }

    
    



	public Estudiante(Set<Pensum> pensum) {
		super();
		this.pensum = pensum;
	}

	



    public Estudiante(int idEstudiante, String nombre, String apellido) {
        super();
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
    }






	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



	public Set<Pensum> getPensum() {
		return pensum;
	}

	public void setPensum(Set<Pensum> pensum) {
		this.pensum = pensum;
	}

	

	
	
	
    
    
}
