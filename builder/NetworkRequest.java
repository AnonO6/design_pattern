package builder;
import java.util.Map;

public class NetworkRequest {
    private String url;
    private String method;
    private Map<String, String> headers;
    private String bodyData;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public void setBodyData(String bodyData) {
        this.bodyData = bodyData;
    }

    public void display(){
        System.out.println("URL: "+ this.url);
        System.out.println("METHOD: "+ this.method);
        System.out.println("HEADER: "+ this.headers);
        System.out.println("BODY DATA: "+ this.bodyData);
    }
}
