package br.com.caelum.argentum.modelo;

import java.util.Calendar;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("negociacao")
public final class Negociacao implements Comparable{
	
	private final double preco;
	private final int quantidade;
	private final Calendar data;
	
	public Negociacao(double preco, int quantidade, Calendar data) {
		if(data==null){
			throw new IllegalArgumentException("data nao pode ser nula");
		}
		
		this.preco = preco;
		this.quantidade = quantidade;
		this.data = data;
	}


	
	public double getVolume(){
		return preco * quantidade;
	}	
	
	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Calendar getData() {
		return (Calendar) this.data.clone();
	}

	@Override
	public String toString() {
		return this.getData().toString();
	}
	

	public boolean isMesmoDia(Calendar outraData) {
		  return this.data.get(Calendar.DATE) == outraData.get(Calendar.DATE) &&
			       this.data.get(Calendar.MONTH) == outraData.get(Calendar.MONTH) &&
			       this.data.get(Calendar.YEAR) == outraData.get(Calendar.YEAR);
		  // 		return data.equals(outraData); equals nao resolve pq cada obj calendar foi criado em um determinado timestamp
	}


	@Override
	public int compareTo(Object o) {
		Negociacao neg = (Negociacao) o;
		return data.compareTo(neg.getData());
	}
}