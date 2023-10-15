package com.trantien.example.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdaptiveThemeDTO   {
    private String head;
    private String bodyText;
    private String wordList;
    private String themeCode;

}
