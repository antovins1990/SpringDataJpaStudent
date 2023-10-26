package com.example.data.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@AttributeOverrides({
	@AttributeOverride(name = "name"
			, column = @Column(name="guardian_name")),
	@AttributeOverride(name="mobileNumber",
	column = @Column(name="guardian_mobileNumber"))
})
public class Guardian {
	private String name;
	private String mobileNumber;
}
