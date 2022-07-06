package com.example.Luis_Angel_Glez_H.Examen2.Model;




import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="language")
public class Language {
	@Id //Llave primaria de la tabla
	@GeneratedValue(strategy = GenerationType.AUTO) //Se le indica que el campo ID es Autonumerico
	private long id;

	@Column(name = "code")
	private String code;
	
	@Column(name = "name")
	private String name;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;	
	}

	public void setName(String name) {
		this.name = name;
	}



}