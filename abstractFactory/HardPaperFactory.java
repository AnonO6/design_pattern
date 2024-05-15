package abstractFactory;

// Concrete Factory for Hard Paper
class HardPaperFactory implements PaperFactory {
    @Override
    public ComputerNetworksSection createComputerNetworksSection() {
        return new DrBhairviMishraComputerNetworks();
    }

    @Override
    public BlockchainSection createBlockchainSection() {
        return new DrMohitGuptaBlockchain();
    }

    @Override
    public MathsSection createMathsSection() {
        return new DrSKGMaths();
    }
}
