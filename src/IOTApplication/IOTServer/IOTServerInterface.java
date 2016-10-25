package IOTApplication.IOTServer;


import java.util.ArrayList;

/**
 * Created by melaniebalaz on 24/10/2016.
 */
public interface IOTServerInterface {


    /**
     * This method receives a UDP Service Offering package and analyzes its content.
     * If it is interested in the Service it tells the Client to sent a subscription request.
     */
    public void receiveServiceOffering();
    /**
     * This method handles incoming subscribe requests
     */
    public void subscribeRequestHandler(String destinationIP, int destinationPort);
    public void incomingNotificationHandler(String messageType, ArrayList notification);

}
