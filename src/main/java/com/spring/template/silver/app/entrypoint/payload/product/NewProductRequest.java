package com.spring.template.silver.app.entrypoint.payload.product;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NewProductRequest {

  @NotNull
  private String name;

  @NotNull
  private String description;

  @NotNull
  private Integer price;

  private Integer categoryId;

}
