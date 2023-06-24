package br.com.bpmn.Service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named
public class Ferias implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Tirando férias");

        //tempo de duração de 5 segundos
        Thread.sleep(5000);
    }
}
