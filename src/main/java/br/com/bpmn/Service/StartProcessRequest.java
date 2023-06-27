package br.com.bpmn.Service;

public class StartProcessRequest {
    private String dinheiro;
    private String local;


    public String getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(String dinheiro) {
        this.dinheiro = dinheiro;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}

