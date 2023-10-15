package com.trantien.example.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.trantien.example.data.Definition;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DefinitionListener extends AnalysisEventListener<Definition> {
    private List<Definition> definitions;

    @Override
    public void invoke(Definition definition, AnalysisContext analysisContext) {
        definitions.add(definition);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
