//tag�� ���� ������ �߽߰� �̺�Ʈ �߻���Ű�� ��ü

package xml.sax;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Handler extends DefaultHandler{
	//�����±װ� �߰ߵǸ� ȣ��
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		super.startElement(uri, localName, qName, attributes);
	}
	
	//�ݴ��±װ� �߰ߵǸ� ȣ��
	public void endElement(String uri, String localName, String qName) throws SAXException {
		super.endElement(uri, localName, qName);
	}
	
	//�ؽ�Ʈ�� �߰ߵǸ� ȣ��Ǵ� �޼���
	public void characters(char[] ch, int start, int length) throws SAXException {
		super.characters(ch, start, length);
	}
}
