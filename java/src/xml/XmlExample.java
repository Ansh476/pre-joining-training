package xml;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;
import java.io.File;

public class XmlExample {

    static String filePath = "./src/xml/students.xml";

    public static void main(String[] args) {

        try {
            writeXML();
            readXML();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    // create and write xml file
    static void writeXML() throws Exception {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder builder = factory.newDocumentBuilder();

        Document doc = builder.newDocument();

        // root element
        Element root =doc.createElement("students");

        doc.appendChild(root);

        // records
        root.appendChild(createStudent(doc,"1","Ansh","INFT"));

        root.appendChild(createStudent(doc,"2","Vivek","CMPN"));

        // writing xml to file
        Transformer transformer =TransformerFactory.newInstance().newTransformer();

        transformer.setOutputProperty(OutputKeys.INDENT,"yes");

        transformer.transform(new DOMSource(doc),new StreamResult(new File(filePath)));

        System.out.println("XML File Created");
    }

    // helper method
    static Element createStudent(
            Document doc,
            String id,
            String name,
            String branch) {

        Element student =doc.createElement("student");

        Element idElement =doc.createElement("id");

        idElement.appendChild(doc.createTextNode(id));

        student.appendChild(idElement);

        Element nameElement =doc.createElement("name");

        nameElement.appendChild(doc.createTextNode(name));

        student.appendChild(nameElement);

        Element branchElement =doc.createElement("branch");

        branchElement.appendChild(doc.createTextNode(branch));

        student.appendChild(branchElement);

        return student;
    }

    // Read XML File
    static void readXML() throws Exception {

        File file =new File(filePath);

        DocumentBuilder builder =DocumentBuilderFactory
                        .newInstance()
                        .newDocumentBuilder();

        Document doc =builder.parse(file);

        NodeList students =doc.getElementsByTagName("student");

        System.out.println("\nStudent Details");

        for (int i = 0;i < students.getLength();i++) {

                Element student =(Element) students.item(i);

                String id =student
                        .getElementsByTagName("id")
                        .item(0)
                        .getTextContent();

                String name =student
                        .getElementsByTagName("name")
                        .item(0)
                        .getTextContent();

                String branch =student
                        .getElementsByTagName("branch")
                        .item(0)
                        .getTextContent();

                System.out.println("id: " + id);
                System.out.println("name: " + name);
                System.out.println("branch: " + branch);
            
        }
    }
}