package decorator;

class GunSkinDecorator extends SkinDecorator {
    public GunSkinDecorator(PlayerSkin decoratedPlayerSkin) {
        super(decoratedPlayerSkin);
    }

    @Override
    public void showSkin() {
        super.showSkin();
        System.out.println(" + Gun Skin");
    }
}
