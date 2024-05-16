package decorator;

class DefaultPlayerSkin implements PlayerSkin {
    @Override
    public void showSkin() {
        System.out.println("Default outfit");
    }
}