package br.com.bpmn.Service;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named
public class PrepararPartida implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String estado = "Bahia";
        String dinheiro = "1000.00";

        if (!estado.equalsIgnoreCase("Pernambuco") && !estado.equalsIgnoreCase("Alagoas")) {
            throw new BpmnError("erroEstadoInvalido", "Estado inválido: " + estado);
        }

        Double valor = Double.parseDouble(dinheiro);
        if (valor < 500) {
            throw new BpmnError("erroDinheiroInsuficiente", "Dinheiro insuficiente: " + dinheiro);
        }

        delegateExecution.setVariable("estado", estado);
        delegateExecution.setVariable("dinheiro", dinheiro);
    }
}
