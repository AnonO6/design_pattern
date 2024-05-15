package builder;
public interface Builder {
    void buildUrl();
    void buildHeader();
    void buildMethod();
    void buildBodyData();
    NetworkRequest getResult();
}
