package decorator;

abstract class SkinDecorator implements PlayerSkin {
    protected PlayerSkin decoratedPlayerSkin;

    public SkinDecorator(PlayerSkin decoratedPlayerSkin) {
        this.decoratedPlayerSkin = decoratedPlayerSkin;
    }

    public void showSkin() {
        decoratedPlayerSkin.showSkin();
    }
}