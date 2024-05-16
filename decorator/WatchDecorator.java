package decorator;

// Concrete decorators
class WatchDecorator extends SkinDecorator {
    public WatchDecorator(PlayerSkin decoratedPlayerSkin) {
        super(decoratedPlayerSkin);
    }

    @Override
    public void showSkin() {
        super.showSkin();
        System.out.println(" + Watch");
    }
}
