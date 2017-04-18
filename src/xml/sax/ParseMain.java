package xml.sax;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class ParseMain {
	
	public static void main(String[] args){
		//자바 언어로 SAX방식의 파싱을 시도하려면 SAXParser가 필요하다. javaSE에는 xml파서가 포함되어 있다. 그 정도로 xml은 어플리케이션 개발시 많이 쓰인다.
		SAXParserFactory factory = SAXParserFactory.newInstance();
		String path= "C:/java_workspace2/XMLProject/data/member.xml";
		try {
			SAXParser parser=factory.newSAXParser();
			parser.parse(new File(path), new MyHandler());
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
