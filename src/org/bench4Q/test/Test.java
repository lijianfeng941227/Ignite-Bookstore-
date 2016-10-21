package org.bench4Q.test;

import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Test {

	public static void main(String[] args) {

		try {

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

			DocumentBuilder db = dbf.newDocumentBuilder();

			Document doc = db.parse("WebRoot/META-INF/context.xml");

			NodeList list = doc.getElementsByTagName("Resource");

			for (int i = 0; i < list.getLength(); i++) {

				Element ele = (Element) list.item(i);

				String brandName = ele.getAttribute("url");
				
				System.out.println(brandName);
				
				String urlString = "jdbc:ignite://localhost:11211/";
				
				if (brandName.startsWith(urlString)) {
					int length = urlString.length();
					System.out.println(length);
					ele.setAttribute("url", urlString.substring(0,length)+"Customer");
					System.out.println(ele.getAttribute("url"));
				//	ele.setAttribute("id", "一班");
				}

			}

			TransformerFactory transformerFactory = TransformerFactory
					.newInstance();

			Transformer transformer = transformerFactory.newTransformer();

			DOMSource domSource = new DOMSource(doc);

			// 设置编码类型

			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

			StreamResult result = new StreamResult(new FileOutputStream(
					"WebRoot/META-INF/context.xml"));

			transformer.transform(domSource, result);

		} catch (Exception ex) {

			ex.printStackTrace();

		}

	}

}
