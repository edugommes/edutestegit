package br.com.caelum.argentum.modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CandleBuilder {

	private double abertura;
	private double fechamento;
	private double minimo;
	private double maximo;
	private double volume;
	private Calendar data;
	
	
	public CandleBuilder comAbertura(double abertura){
		this.abertura = abertura;
		return this;
	}
	
	public CandleBuilder comFechamento(double fechamento){
		this.fechamento = fechamento;
		return this;
	}
	
	public CandleBuilder comMinimo(double minimo){
		this.minimo = minimo;
		return this;
	}
	
	public CandleBuilder comMaximo(double maximo){
		this.maximo = maximo;
		return this;
	}
	
	public CandleBuilder comVolume(double volume){
		this.volume = volume;
		return this;
	}
	
	public CandleBuilder comData(Calendar data){
		this.data = data;
		return this;
	}
	
	public Candlestick gerarCandle(){
		return new Candlestick(this.abertura, this.fechamento, this.minimo, this.maximo, this.volume, this.data);
	}
	
	
	public static void main(String[] args) {
		CandleBuilder builder = new CandleBuilder();
		
		builder.comAbertura(40.5);
		builder.comFechamento(42.3);
		builder.comMinimo(39.8);
		builder.comMaximo(45.0);
		builder.comVolume(145234.20);
		builder.comData(new GregorianCalendar(2012, 8, 12, 0, 0, 0));
		  
		Candlestick candle = builder.gerarCandle();
		System.out.println(candle);
		
		
		Candlestick candle2 = new CandleBuilder()
				.comAbertura(40.5)
			    .comFechamento(42.3)
			    .comMinimo(39.8)
			    .comMaximo(45.0)
			    .comVolume(145234.20)
			    .comData(new GregorianCalendar(2008,8,12,0,0,0)).gerarCandle();
		
		System.out.println(candle2);
	}
	
	
	
}