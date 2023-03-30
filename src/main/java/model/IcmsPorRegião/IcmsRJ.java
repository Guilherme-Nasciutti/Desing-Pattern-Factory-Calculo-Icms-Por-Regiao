package model.IcmsPorRegião;

import java.math.BigDecimal;
import model.calculoIcms.CalculoPorRegiao;
import model.orcamento;


public class IcmsRJ implements CalculoPorRegiao{
@Override
public BigDecimal calculoPorRegiao(orcamento orcamento) {
return orcamento.getValorOrcamento().multiply(new
BigDecimal("0.17"));
}
}