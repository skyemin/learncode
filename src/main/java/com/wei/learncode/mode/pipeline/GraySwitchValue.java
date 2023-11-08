package com.wei.learncode.mode.pipeline;

public class GraySwitchValue extends AbstractPipelineValue {
    @Override
    public boolean doExec(PipelineContext pipelineContext) {

        pipelineContext.set(PipelineContext.FOR_TEST, true);

        return true;
    }
}
