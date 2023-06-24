package br.com.bpmn.Service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named
public class ReservarCabine implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        String tipoCabine = "Cabine";

        String dinheiro = (String) delegateExecution.getVariable("dinheiro");
        Double valor = Double.parseDouble(dinheiro);

        if (valor >= 5000) {
            tipoCabine = "Cabine Luxo";
        } else {
            tipoCabine = "Cabine Simples";
        }

        delegateExecution.setVariable("tipoCabine", tipoCabine);
        System.out.println("Reservando " + tipoCabine + " para o cliente");
    }
}
