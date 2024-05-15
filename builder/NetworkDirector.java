public class NetworkDirector {
    void construct(Builder builder){
        builder.buildUrl();
        builder.buildHeader();
        builder.buildMethod();
        builder.buildBodyData();
    }
}
