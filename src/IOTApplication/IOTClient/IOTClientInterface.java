package IOTApplication.IOTClient;

import java.util.ArrayList;

/**
 * Created by melaniebalaz on 24/10/2016.
 */
public interface IOTClientInterface {

    /**
     * This method broadcasts UDP packages which describe the service
     */
    public void broadcastServiceOffering(String typeOfService);
    public void notifySubscribers(String messageType, ArrayList notification);
    public void createSubscriptionRequest(String destinationIP, int destinationPort);

}