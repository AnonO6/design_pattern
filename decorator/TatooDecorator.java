package decorator;

class TattooDecorator extends SkinDecorator {
    public TattooDecorator(PlayerSkin decoratedPlayerSkin) {
        super(decoratedPlayerSkin);
    }

    @Override
    public void showSkin() {
        super.showSkin();
        System.out.println(" + Tattoo");
    }
}
