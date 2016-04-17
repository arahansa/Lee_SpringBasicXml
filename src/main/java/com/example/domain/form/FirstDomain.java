package com.example.domain.form;



import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FirstDomain {
	
	// public, private, (default, protected)
	@NotBlank
	@Size(max=3)
	private String name;
	
	@Digits(fraction = 0, integer = 10)
	private int age;
	
}
