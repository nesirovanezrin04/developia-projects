package com.developia.librariann_nezrin_nesirova.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = EntityIdsiniYoxlaYoxlayici.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface EntityIdsiniYoxla {
	public String value() default "books";

	public String message() default "Kitabin id kodu tapilmadi";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}