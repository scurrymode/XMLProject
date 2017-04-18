package xml.sax;

import java.util.Vector;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler2 extends DefaultHandler{
	MyModel model;
	Vector vec;
	boolean flag = false;
	
	
	public MyHandler2(MyModel model) {
		this.model= model;
	}

	public void startDocument() throws SAXException {
		System.out.println("문서가 시작입니다.");
	}
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if(qName.equals("member")){
			vec = new Vector();
		}else if(qName.equals("name")){
			flag = true;
		}else if(qName.equals("age")){
			flag = true;
		}else if(qName.equals("gender")){
			flag = true;
		}else{
			flag = false;
		}
	}
	
	public void characters(char[] ch, int start, int length) throws SAXException {
		if(flag){
			vec.add(new String(ch, start, length));
		}
	}
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		flag=false;
		if(qName.equals("member")){
			model.data.add(vec);
		}
	}
	
	public void endDocument() throws SAXException {
		System.out.println("문서의 끝입니다.");
	}
}