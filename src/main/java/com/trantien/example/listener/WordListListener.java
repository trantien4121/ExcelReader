package com.trantien.example.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.trantien.example.data.WordList;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WordListListener extends AnalysisEventListener<WordList> {

    private List<WordList> wordLists;

    @Override
    public void invoke(WordList adaptiveWord, AnalysisContext analysisContext) {
        wordLists.add(adaptiveWord);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
