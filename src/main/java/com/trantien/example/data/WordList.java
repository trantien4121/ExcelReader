package com.trantien.example.data;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WordList {
    @ExcelProperty(index = 0)
    private String wordId;

    @ExcelProperty(index = 1)
    private String word;

    @ExcelProperty(index = 2)
    private int priority;

    @ExcelProperty(index = 3)
    private String pathway;

    @ExcelProperty(index = 4)
    private String wordBk;

}
