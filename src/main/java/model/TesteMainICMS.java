package model;

import java.math.BigDecimal;

public class TesteMainICMS {
public static void main(String[] args) {
orcamento orcamento = new orcamento(new
BigDecimal("1000.0"), "ICMS_MG");
IcmsFactory icmsFactory = new IcmsFactory();
BigDecimal resultado = icmsFactory.getIcmsPorEstado(
"ICMS_MG").calculoPorRegiao(orcamento);
System.out.println(resultado);
}
}