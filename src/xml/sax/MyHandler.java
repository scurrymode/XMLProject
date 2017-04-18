package xml.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler{
	int count;

	public void startDocument() throws SAXException {
		System.out.println("문서가 시작입니다.");
	}
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("<"+qName+">");
	}
	
	public void characters(char[] ch, int start, int length) throws SAXException {
		count++;
		System.out.println("텍스트발견"+count);
	}
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("</"+qName+">");
	}
	
	public void endDocument() throws SAXException {
		System.out.println("문서의 끝입니다.");
	}
}
