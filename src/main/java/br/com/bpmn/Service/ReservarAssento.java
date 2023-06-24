package br.com.bpmn.Service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;
import java.util.Date;

@Named
public class ReservarAssento implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        //Registro de hora
        String horaVoo = new Date().toString();
        delegateExecution.setVariable("horaVoo", horaVoo);


        System.out.println("Reservando assento para o cliente");
        //Hora do Voo
        System.out.println("Hora do Voo: " + horaVoo);
    }
}
