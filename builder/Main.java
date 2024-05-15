public class Main {
    public static void main(String[] args) {
        NetworkDirector director = new NetworkDirector();
        Builder builder = new NetworkRequestBuilder();

        director.construct(builder);
        NetworkRequest networkRequest = builder.getResult();
        networkRequest.display();
    }
}