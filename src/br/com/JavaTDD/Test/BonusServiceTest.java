package br.com.JavaTDD.Test;

import br.com.JavaTDD.Modelo.Funcionario;
import br.com.JavaTDD.Service.BonusService;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BonusServiceTest {

    @Test
    public void bonusZeroParaSalarioMuitoAlto() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));

        Assert.assertEquals(new BigDecimal("0.00"), bonus);
    }

    @Test
    public void bonus10PorCentoDoSalario() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("2500")));

        Assert.assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    public void bonus1000ParaSalarioDeDezMil() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000")));

        Assert.assertEquals(new BigDecimal("1000.00"), bonus);
    }

}
