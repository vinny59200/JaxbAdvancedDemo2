package com.websystique.xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.websystique.xml.workflow.Sendee;
import com.websystique.xml.workflow.Address;


public class JaxbCodeGenerationDemo {
    private static final String XML_FILE = "sendee.xml";

    public static void main(String[] args) throws JAXBException,
            FileNotFoundException {

        // create JAXB context
        JAXBContext context = JAXBContext.newInstance(Sendee.class);



        System.out.println("<!---------------Generating the Java objects from a given XML Input-------------->");
        // UnMarshalling [Generate JAVA from XML]
        // Instantiate Unmarshaller via context
        Unmarshaller um = context.createUnmarshaller();
        // Unmarshall the provided XML into an object
        Sendee sendee = (Sendee) um.unmarshal(new FileReader(new File(
                JaxbCodeGenerationDemo.class.getClassLoader().getResource(XML_FILE).getFile()
        )
        ));
        System.out.println("[Before] Sendee : " + sendee);



        System.out.println("<!----------Generating the XML Output after adding the address -------------->");
        // Marshalling [Generate XML from JAVA]
        // create Marshaller using JAXB context
        Marshaller m = context.createMarshaller();
        // To format the [to be]generated XML output
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        //Adding the address
        Address a1 = new Address();
        a1.setLine1("32 Palm Street");
        a1.setLine2("Venice Beach");
        sendee.setAddress(a1);
        // Marshall it and write output to System.out or to a file
        m.marshal(sendee, new File(XML_FILE));
        System.out.println("[After] Sendee : " + sendee);



        System.out.println("<!----------Final XML -------------->");
        m.marshal(sendee, System.out);

    }


}
