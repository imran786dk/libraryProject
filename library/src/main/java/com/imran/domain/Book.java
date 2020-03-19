package com.imran.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Test comment

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity
public class Book {
	
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	private String title, isbn;
	

}
