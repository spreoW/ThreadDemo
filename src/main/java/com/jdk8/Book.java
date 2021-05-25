package com.jdk8;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author wangquan
 * @date 2021/5/21
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
  private Integer id;
  private String name;
  private Double price;


}
