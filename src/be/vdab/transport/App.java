package be.vdab.transport;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        Transport t = TransportCreator.createTransport(); // "Factory" method

        if(t instanceof Airplane) {
            ((Airplane) t).fly();
        } else {
            System.out.println("UNABLE TO FLY B/C NOT PLANE");
        }

        GasStation station = new GasStation();

        Car c = new Car("Astra", "Opel");

        ((SquareWheel)c.getWheel(3)).angles();

        c.move();

        station.service(c);

        Airplane p = new Airplane("Boeing", "747", "lost somewhere");
        station.service(p);

        Generator g = new Generator();
        station.service(g);

        Bicycle b = new Bicycle("ZX-34B Pro", "Gazelle");

        WashingStation ws = new WashingStation();
        ws.service(c);
        ws.service(p);
        ws.service(b);
    }

}
