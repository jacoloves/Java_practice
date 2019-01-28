package xml_catch;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class xml_read {

	/**
	 * デフォルトコンストラクタ
	 * @return
	 * @throws Exception
	 *
	 */

	public xml_read(String db_name, String info) throws Exception {
		String db_xml = db_name;
		String db_info = info;

	}


	public xml_read setUser(String db_name, String info) throws Exception {
		String user = ReadFile(db_name, info);
		return user;
	}

	//xmlファイルを読み込む
	private static String ReadFile(String db_xml, String db_info) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(db_xml);

		Element root = document.getDocumentElement();
		String db_info_get = null;

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
							if (node.getNodeName() == db_info) {
								db_info_get = node.getTextContent();
							}else if (node.getNodeName() == db_info) {
								db_info_get = node.getTextContent();

							}
						}
					}
				}
			}
		}
		return db_info_get;
	}

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		String db_name = "./src/cfg/db_config.xml";
		String user = "db_name";
		String pass = "pass";

		String user_info = ReadFile(db_name, user);
		String pass_info = ReadFile(db_name, pass);

		System.out.println("ユーザ： " + user_info);
		System.out.println("パス： " + pass_info);
	}

}
