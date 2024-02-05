package com.spring.template.silver.app.entrypoint.payload.product;

import com.spring.template.silver.app.infrastructure.entity.CategoryEntity;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProductRequest {

  @NotNull
  private Integer id;

  private String name;

  private String description;

  private Integer price;

  private CategoryEntity category;

}
