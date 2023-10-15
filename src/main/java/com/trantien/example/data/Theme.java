package com.trantien.example.data;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Theme {
    @ExcelProperty(index = 0)
    private String head;

    @ExcelProperty(index = 1)
    private String bodyText;

    @ExcelProperty(index = 2)
    private String wordList;

    @ExcelProperty(index = 3)
    private String themeCode;
}
