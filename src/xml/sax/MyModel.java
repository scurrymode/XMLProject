package xml.sax;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class MyModel extends AbstractTableModel{
	Vector<String> columnName = new Vector<String>();
	Vector<Vector> data = new Vector<Vector>();
	
	public MyModel() {
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			parser.parse(new File("C:/java_workspace2/XMLProject/data/member.xml"),new MyHandler2(this));
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
		
		columnName.addElement("이름");
		columnName.addElement("나이");
		columnName.addElement("성별");
	}
	
	
	public String getColumnName(int col) {
		return columnName.get(col);
	}

	public int getColumnCount() {
		return columnName.size();
	}

	
	public int getRowCount() {
		return data.size();
	}

	
	public Object getValueAt(int row, int col) {
		return data.get(row).get(col);
	}
	

}
