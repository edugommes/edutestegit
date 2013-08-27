package br.com.caelum.argentum.modelo;
import java.util.Calendar;


public final class Candlestick {

	private final double abertura;
	private final double fechamento;
	private final double minimo;
	private final double maximo;
	private final double volume;
	private final Calendar data;
	
	public Candlestick(double abertura, double fechamento, double minimo,
			double maximo, double volume, Calendar data) {
		super();
		
		if(minimo>maximo){
			throw new IllegalArgumentException("Minimo maior que M�ximo");
		}
		
		if(data==null){
			throw new IllegalArgumentException("A data n�o pode ser nulla");
		}
		
		if(abertura<0){
			throw new IllegalArgumentException("Valor abertura n�o pode ser menor que zero.");
		}

		if(fechamento<0){
			throw new IllegalArgumentException("Valor fechamento n�o pode ser menor que zero.");
		}

		if(minimo<0){
			throw new IllegalArgumentException("Valor m�nimo n�o pode ser menor que zero.");
		}

		if(maximo<0){
			throw new IllegalArgumentException("Valor maximo n�o pode ser menor que zero.");
		}

		if(volume<0){
			throw new IllegalArgumentException("Valor volume n�o pode ser menor que zero.");
		}
		this.abertura = abertura;
		this.fechamento = fechamento;
		this.minimo = minimo;
		this.maximo = maximo;
		this.volume = volume;
		this.data = data;
	}

	@Override
	public String toString() {
	
		return "Abertura " + this.abertura + ", Fechamento " + this.fechamento + ", M�nima " +  this.minimo + ", M�xima " + this.maximo + ", Volume " + this.volume ;
	}
	
	public boolean isAlta(){
		return this.abertura <= this.fechamento;
	}
	
	public boolean isBaixa(){
		return this.abertura > this.fechamento;
	}
	
	public double getAbertura() {
		return abertura;
	}

	public double getFechamento() {
		return fechamento;
	}

	public double getMinimo() {
		return minimo;
	}

	public double getMaximo() {
		return maximo;
	}

	public double getVolume() {
		return volume;
	}

	public Calendar getData() {
		return data;
	}
}