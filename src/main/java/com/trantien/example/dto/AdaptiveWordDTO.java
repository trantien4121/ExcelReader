package com.trantien.example.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdaptiveWordDTO {
    private String wordId;
    private String word;
    private int priority;
    private String pathway;
    private String wordBk;
    private String prefix;
    private String rootOrBase;
    private String suffix;
    private String themeCode;
}
