//tag나 각종 테이터 발견시 이벤트 발생시키는 객체

package xml.sax;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Handler extends DefaultHandler{
	//시작태그가 발견되면 호출
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		super.startElement(uri, localName, qName, attributes);
	}
	
	//닫는태그가 발견되면 호출
	public void endElement(String uri, String localName, String qName) throws SAXException {
		super.endElement(uri, localName, qName);
	}
	
	//텍스트가 발견되면 호출되는 메서드
	public void characters(char[] ch, int start, int length) throws SAXException {
		super.characters(ch, start, length);
	}
}
