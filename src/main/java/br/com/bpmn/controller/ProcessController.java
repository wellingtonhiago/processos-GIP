package br.com.bpmn.controller;

import br.com.bpmn.Service.StartProcessRequest;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProcessController {

    @Autowired
    private RuntimeService runtimeService;

    @PostMapping("/startProcess")
    public String startProcess(@RequestBody StartProcessRequest request) {
        Map<String, Object> vars = new HashMap<>();
        vars.put("dinheiro", request.getDinheiro());
        vars.put("estado", request.getLocal());
        runtimeService.startProcessInstanceByKey("processos-GIP-process", vars);
        return "Processo iniciado";
    }
}
