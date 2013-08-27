import java.util.Calendar;

import br.com.caelum.argentum.modelo.Negociacao;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


public class TestaCandlestickFactory {

	public static void main(String[] args) {
		
		//teste1
//		Calendar hoje = Calendar.getInstance();
//		
//		Negociacao  negociacao1 = new Negociacao(40.5, 100, hoje);
//		Negociacao  negociacao2 = new Negociacao(45.0, 100, hoje);
//		Negociacao  negociacao3 = new Negociacao(39.8, 100, hoje);
//		Negociacao  negociacao4 = new Negociacao(42.3, 100, hoje);
//		
//		List<Negociacao> negociacoes = Arrays.asList(negociacao1, negociacao2, negociacao3, negociacao4);
//	
//		CandlestickFactory fabrica = new CandlestickFactory();
//		Candlestick candle = fabrica.constroiCandleParaData(hoje, negociacoes);
//		
//		System.out.println(candle.getAbertura());
//		System.out.println(candle.getFechamento());
//		System.out.println(candle.getMinimo());
//		System.out.println(candle.getMaximo());
//		System.out.println(candle.getVolume());

		
		//teste2
//		Calendar hoje = Calendar.getInstance();
//		
//		Negociacao  negociacao1 = new Negociacao(40.5, 100, hoje);
//		
//		List<Negociacao> negociacoes = Arrays.asList(negociacao1);
//	
//		CandlestickFactory fabrica = new CandlestickFactory();
//		Candlestick candle = fabrica.constroiCandleParaData(hoje, negociacoes);
//		
//		System.out.println(candle.getAbertura());
//		System.out.println(candle.getFechamento());
//		System.out.println(candle.getMinimo());
//		System.out.println(candle.getMaximo());
//		System.out.println(candle.getVolume());

		//teste3
//		Calendar hoje = Calendar.getInstance();
//	    
//	    List<Negociacao> negociacoes = Arrays.asList();
//	    
//	    CandlestickFactory fabrica = new CandlestickFactory();
//	    Candlestick candle = fabrica.constroiCandleParaData(hoje, negociacoes);
//	    
//	    System.out.println(candle.getAbertura());
//	    System.out.println(candle.getFechamento());
//	    System.out.println(candle.getMinimo());
//	    System.out.println(candle.getMaximo());
//	    System.out.println(candle.getVolume());
		
		//teste com xml 1
//		Negociacao negociacao = new Negociacao(3.20, 100, Calendar.getInstance());
//		XStream stream = new XStream(new DomDriver());
//		stream.autodetectAnnotations(true);
//		//		stream.alias("negociacao", Negociacao.class);
//		System.out.println(stream.toXML(negociacao));
		
		//teste com xml 2
//		XStream stream = new XStream(new DomDriver());
//		stream.alias("negociacao", Negociacao.class);
//		
//		Negociacao negociacao = (Negociacao) stream.fromXML("" +
//				"<negociacao>" +
//					"<preco>42.3</preco>" +
//					"<quantidade>100</quantidade>" +
//				"</negociacao>");
//
//		System.out.println(negociacao.getPreco());

		
	}
	
}
