package com.vlm.Dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {

	@NotNull(message = "user name could not be empty")
	private String name;
	@Min(18)
	@Max(60)
	private int age;
	@Email(message = "invalid email")
	private String email;
	@Pattern(regexp = "^({10}",message = "invalid number entered")
	private String mobileno;
	@NotBlank(message = "Gender Must be Specify")
	private String gender;
	@NotBlank(message = "city name can not be null")
	private String city;
}
