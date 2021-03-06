package DB_xml_catch;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class db_xml_catch {

	public static void main(String[] args) throws Exception{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse("./src/cfg/db_config.xml");

		Element root = document.getDocumentElement();
		String user_name = null, password = null;

		NodeList connectNodeList = root.getChildNodes();
		for (int i = 0; i < connectNodeList.getLength(); i++) {
			Node db_connectNode = connectNodeList.item(i);
			if (db_connectNode.getNodeType() == Node.ELEMENT_NODE) {
				Element dbElement = (Element)db_connectNode;
				if (dbElement.getNodeName().equals("singleDB")) {
					NodeList dbChildrenNodeList = dbElement.getChildNodes();
					for (int j= 0; j < dbChildrenNodeList.getLength(); j++) {
						Node node = dbChildrenNodeList.item(j);
						if(node.getNodeType() == Node.ELEMENT_NODE) {
							if (node.getNodeName() == "db_name") {
								user_name = node.getTextContent();
							}else if (node.getNodeName() == "pass") {
								password = node.getTextContent();
							}
						}
					}
				}
			}
		}

		//テスト
		System.out.println("取得した値を出力します。");
		System.out.println("ユーザ:" + user_name);
		System.out.println("パスワード：" + password);
	}

}
