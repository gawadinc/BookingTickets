package org.gawad.thirdparty;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import org.gawad.thirdparty.soap.*;
import org.gawad.ui.JFrameMainApp;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Vadim on 24.12.2016.
 */
public class Connection {

    private URL url = null;
    private final QName qname = new QName("https://demo.contentrail.com/ws/SoapApi/0.1/", "SoapApiService");

    private JFrameMainApp jFrameMainApp;
    private Access access;

    public void setjFrameMainApp (JFrameMainApp jFrameMainApp) {
        this.jFrameMainApp = jFrameMainApp;
    }

    public void setAccess(Access access){
        this.access=access;
    }

    public void call() {
        try {
            url = new URL("https://demo.contentrail.com/ws/soapApi");

        Service service = Service.create(url, qname);
        SoapApiPortType message = service.getPort(SoapApiPortType.class);
        JourneySearchResponse journeySearchResponse = message.acrJourneySearch(access, getOriginDestinationSearch(), getRoundtripOriginDestinationSearch(), getPassenger());

        jFrameMainApp.printResult("Original: " + journeySearchResponse.getRoundtripOriginDestination().getDestinationName());
        jFrameMainApp.printResult("Destination: " + journeySearchResponse.getOriginDestination().getDestinationName());
        if (journeySearchResponse.getJourneys().getJourney().size() > 0){
            for (Journey journey : journeySearchResponse.getJourneys().getJourney()){
                jFrameMainApp.printResult(journey.getJourneyInfo().getArrivalCountry());
            }
        } else {
            jFrameMainApp.printResult("Jornay: empty");
        }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private OriginDestinationSearch getOriginDestinationSearch() {
        OriginDestinationSearch originDestinationSearch = jFrameMainApp.getOriginDestinationSearch();
        XMLGregorianCalendar date = new XMLGregorianCalendarImpl();
        date.setYear(2016);
        date.setMonth(12);
        date.setDay(26);
        originDestinationSearch.setOriginDate(date);
        originDestinationSearch.setOriginTimeFrom("00:00");
        originDestinationSearch.setOriginTimeTo("12:01");
        return originDestinationSearch;
    }

    private InboundOriginDestinationSearch getRoundtripOriginDestinationSearch () {
        InboundOriginDestinationSearch roundtripOriginDestinationSearch = new InboundOriginDestinationSearch();
        XMLGregorianCalendar date2 = new XMLGregorianCalendarImpl();
        date2.setYear(2016);
        date2.setMonth(12);
        date2.setDay(28);
        roundtripOriginDestinationSearch.setOriginDate(date2);
        roundtripOriginDestinationSearch.setOriginTimeFrom("00:00");
        roundtripOriginDestinationSearch.setOriginTimeTo("12:01");
        return roundtripOriginDestinationSearch;
    }

    private Passengers getPassenger() {
        Passengers passengers = new Passengers();
        Passenger passenger = new Passenger();
        passengers.getPassenger().add(passenger);
        return passengers;
    }
}
