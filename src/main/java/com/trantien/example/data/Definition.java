package com.trantien.example.data;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Definition {
    @ExcelProperty(index = 0)
    private String wordId;

    @ExcelProperty(index = 1)
    private String word;

    @ExcelProperty(index = 2)
    private String inflectForm;

    @ExcelProperty(index = 3)
    private String prefix;

    @ExcelProperty(index = 4)
    private String rootOrBase;

    @ExcelProperty(index = 5)
    private String suffix;
}

