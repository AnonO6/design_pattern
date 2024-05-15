import java.util.HashMap;

public class NetworkRequestBuilder implements Builder{

    private NetworkRequest networkRequest = new NetworkRequest();
    @Override
    public void buildUrl() {
        networkRequest.setUrl("http://www.google.com");
    }

    @Override
    public void buildHeader() {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Content-Type", "application/json");
        networkRequest.setHeaders(hm);
    }

    @Override
    public void buildMethod() {
        networkRequest.setMethod("GET");
    }

    @Override
    public void buildBodyData() {
        networkRequest.setBodyData("I love design patterns!");
    }

    @Override
    public NetworkRequest getResult() {
        return networkRequest;
    }
}
