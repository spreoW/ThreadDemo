package com.testThread;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangquan
 * @date 2021/5/21
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
  private String name;
  private Double price;
}
