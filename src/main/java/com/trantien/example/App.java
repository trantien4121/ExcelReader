package com.trantien.example;

import com.alibaba.excel.EasyExcel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.trantien.example.data.AdaptiveTheme;
import com.trantien.example.data.AdaptiveWord;
import com.trantien.example.listener.AdaptiveThemeListener;
import com.trantien.example.listener.AdaptiveWordListener;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class App
{
    public static void main( String[] args ) throws JsonProcessingException {
        /*File file = new File("C:\\Users\\PHI LONG\\Documents\\VWA_U11_SP.xlsx");
        FileInputStream fis = new FileInputStream(file);

        XSSFWorkbook wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheet("wordlist");
        Object object = wb.getName("wordlist");
        // In ra dữ liệu trong object
        System.out.println(sheet.getLastRowNum());*/

        String excelFilePath = "C:\\Users\\VWA_U11_SP.xlsx";

        List<AdaptiveWord> adaptiveWords = new ArrayList<>();
        List<AdaptiveTheme> adaptiveThemes = new ArrayList<>();

        EasyExcel.read(excelFilePath, AdaptiveWord.class, new AdaptiveWordListener(adaptiveWords)).sheet("wordlist").doRead();
        EasyExcel.read(excelFilePath, AdaptiveTheme.class, new AdaptiveThemeListener(adaptiveThemes)).sheet("Theme How big").doRead();

        for (AdaptiveWord adaptiveWord : adaptiveWords) {
            System.out.println(adaptiveWord.getWordId());
        }

        String adaptiveWordJson = new ObjectMapper().writeValueAsString(adaptiveWords);
        System.out.println(adaptiveWordJson);

        String adaptiveThemeJson = new ObjectMapper().writeValueAsString(adaptiveThemes);
        System.out.println(adaptiveThemeJson);

    }
}
