package br.com.caelum.argentum.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CandlestickFactory {

	public Candlestick constroiCandleParaData(Calendar data, List<Negociacao> negociacoes){
		if(negociacoes.isEmpty()){
			throw new ArrayIndexOutOfBoundsException("ARRAY VAZIOO");
		}
		
		double maximo = negociacoes.get(0).getPreco();
		double minimo =  negociacoes.get(0).getPreco();
		Double volume = 0.0;
		
			for (Negociacao negociacao : negociacoes) {
				volume += negociacao.getVolume();
				
				if(negociacao.getPreco()> maximo){
					maximo = negociacao.getPreco();
				}else if(negociacao.getPreco()<minimo){
					minimo = negociacao.getPreco();
				}
			}
	
		Double abertura = new Double(0.00);
		abertura = negociacoes.get(0).getPreco();
		Double fechamento = negociacoes.get(negociacoes.size()-1).getPreco();
		
		BigDecimal ab = new BigDecimal(abertura.toString()).setScale(2 , BigDecimal.ROUND_HALF_UP);
		abertura = new Double (ab.doubleValue());
		
		ab = new BigDecimal(fechamento.toString()).setScale(2, RoundingMode.HALF_DOWN);
		fechamento = new Double (ab.doubleValue());
		
		ab = new BigDecimal(volume.toString()).setScale(2, RoundingMode.HALF_DOWN);;
		volume = new Double (ab.doubleValue());
		
		return new CandleBuilder().comAbertura(abertura).comFechamento(fechamento).comMinimo(minimo).comMaximo(maximo).comVolume(volume).comData(data).gerarCandle();
	}

	public List<Candlestick> constroiCandles(List<Negociacao> todasNegociacoes) {
		List<Candlestick> candles = new ArrayList<Candlestick>();

		  List<Negociacao> negociacoesDoDia = new ArrayList<Negociacao>();
		  Calendar dataAtual = todasNegociacoes.get(0).getData();

		  for (Negociacao negociacao : todasNegociacoes) {
			  if (negociacao.getData().before(dataAtual)) {
				    throw new IllegalStateException("negocia��es em ordem errada");
			  }
			  
			// se n�o for mesmo dia, fecha candle e reinicia vari�veis
		    if (!negociacao.isMesmoDia(dataAtual)) {
		      Candlestick candleDoDia = constroiCandleParaData(dataAtual, 
		                            negociacoesDoDia);
		      candles.add(candleDoDia);
		      negociacoesDoDia = new ArrayList<Negociacao>();
		      dataAtual = negociacao.getData();
		    }
		    negociacoesDoDia.add(negociacao);
		  }
		  // adiciona �ltimo candle
		  Candlestick candleDoDia = constroiCandleParaData(dataAtual,
		         negociacoesDoDia);
		  candles.add(candleDoDia);

		  return candles;
	}
}
