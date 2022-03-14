package main.java.com.mistiq.classwork.json;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SaxHandler extends DefaultHandler {

    private List<Car> resultList = new ArrayList<>();

    private Car currentCar = null;

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start parsing!!");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("End parsing!!");
    }

    //    @Override
//    public void characters(char[] ch, int start, int length) throws SAXException {
//        throw SAXException {
//            String payload = new String(ch, start, length).trim();
//            if (currentTag == null) {
//                return;
//            }
//
//            switch (currentTag) {
//                case TTYPE:
//                    currentCar.setTtype(payload);
//                    break;
//                case VIN:
//                    currentCar.setVin(Integer.parseInt(payload));
//                    break;
//                case COLOR:
//                    currentCar.setColor(payload);
//                    break;
//                case YEAR:
//                    currentCar.setYear(Integer.parseInt(payload));
//                    break;
//                case MODEL:
//                    currentCar.setModel(payload);
//                    break;
//            }
//        }
//    }
//
    @Override
    public void startElement(String uri,
                             String localName,
                             String qName,
                             Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
    }
}
