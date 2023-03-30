package model;

import java.math.BigDecimal;
    
    public class orcamento {
private BigDecimal valorOrcamento;
private String IcmsRegiao;

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public String getIcmsRegiao() {
        return IcmsRegiao;
    }

    public void setIcmsRegiao(String IcmsRegiao) {
        this.IcmsRegiao = IcmsRegiao;
    }

    public orcamento(BigDecimal valorOrcamento, String IcmsRegiao) {
        this.valorOrcamento = valorOrcamento;
        this.IcmsRegiao = IcmsRegiao;
    }
    }
