package br.com.caelum.argentum.modelo;

import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;

public class CandleBuilderTest {

	@Test(expected=IllegalStateException.class)
	public void geracaoDeCandleDeveTerTodosOsDadosNecessarios () {
		Candlestick candle2 = new CandleBuilder().gerarCandle();
	}
	
	@Test
	public void quandoAberturaIgualFechamentoEhAlta(){
		Candlestick candle = new CandleBuilder()
		.comAbertura(40.5)
	    .comFechamento(40.5)
	    .comMinimo(39.8)
	    .comMaximo(45.0)
	    .comVolume(145234.20)
	    .comData(new GregorianCalendar(2008,8,12,0,0,0)).gerarCandle();
		
		Assert.assertEquals(true, candle.isAlta());
		
	} 
}
