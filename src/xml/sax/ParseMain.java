package xml.sax;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class ParseMain {
	
	public static void main(String[] args){
		//�ڹ� ���� SAX����� �Ľ��� �õ��Ϸ��� SAXParser�� �ʿ��ϴ�. javaSE���� xml�ļ��� ���ԵǾ� �ִ�. �� ������ xml�� ���ø����̼� ���߽� ���� ���δ�.
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
