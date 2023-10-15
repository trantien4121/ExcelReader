package com.trantien.example;

import com.alibaba.excel.EasyExcel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.trantien.example.data.Definition;
import com.trantien.example.data.Theme;
import com.trantien.example.data.WordList;
import com.trantien.example.dto.AdaptiveWordDTO;
import com.trantien.example.listener.DefinitionListener;
import com.trantien.example.listener.ThemeListener;
import com.trantien.example.listener.WordListListener;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

        List<WordList> wordLists = new ArrayList<>();
        List<Theme> themes = new ArrayList<>();
        List<Definition> definitions = new ArrayList<>();

        EasyExcel.read(excelFilePath, WordList.class, new WordListListener(wordLists)).sheet("wordlist").doRead();
        EasyExcel.read(excelFilePath, Theme.class, new ThemeListener(themes)).sheet("Theme How big").doRead();
        EasyExcel.read(excelFilePath, Definition.class, new DefinitionListener(definitions)).sheet("Definitions").doRead();

        //Get List of wordId from wordList
        for (WordList adaptiveWord : wordLists) {
            System.out.println(adaptiveWord.getWordId());
        }


        //Read data from file and write values
        String wordListJson = new ObjectMapper().writeValueAsString(wordLists);
        System.out.println(wordListJson);

        String themeJson = new ObjectMapper().writeValueAsString(themes);
        System.out.println(themeJson);

        String definitionJson = new ObjectMapper().writeValueAsString(definitions);
        System.out.println(definitionJson);

        //Filter value from file and map to DTO
        List<AdaptiveWordDTO> adaptiveWorDTOs = wordLists.stream()
                .flatMap(wordList -> definitions.stream()
                        .filter(d -> d.getWordId().equals(wordList.getWordId()))
                        .map(definition -> AdaptiveWordDTO.builder()
                            .wordId(wordList.getWordId())
                            .word(wordList.getWord())
                            .priority(wordList.getPriority())
                            .pathway(wordList.getPathway())
                            .wordBk(wordList.getWordBk())
                            .prefix(definition.getPrefix())
                            .rootOrBase(definition.getRootOrBase())
                            .suffix(definition.getSuffix())
                            .build()))
                .collect(Collectors.toList());

        System.out.println(new ObjectMapper().writeValueAsString(adaptiveWorDTOs));
    }
}
