package br.com.JavaTDD.Test;

import br.com.JavaTDD.Modelo.Desempenho;
import br.com.JavaTDD.Modelo.Funcionario;
import br.com.JavaTDD.Service.ReajusteService;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteServiceTest {

    @Test
    public void  reajusteTresPorCentoComDesempenhoRuim() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));

        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        Assert.assertEquals( new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void  reajusteQuinzePorCentoComDesempenhoMediano() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));

        service.concederReajuste(funcionario, Desempenho.BOM);
        Assert.assertEquals( new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void  reajusteVintePorCentoComDesempenhoBom() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));

        service.concederReajuste(funcionario, Desempenho.OTIMO);
        Assert.assertEquals( new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
