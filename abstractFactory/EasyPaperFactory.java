package abstractFactory;

// Concrete Factory for Easy Paper
class EasyPaperFactory implements PaperFactory {
    @Override
    public ComputerNetworksSection createComputerNetworksSection() {
        return new DrRajbirKaurComputerNetworks();
    }

    @Override
    public BlockchainSection createBlockchainSection() {
        return new DrJitendraGoyalBlockchain();
    }

    @Override
    public MathsSection createMathsSection() {
        return new DrPratibhaGargMaths();
    }
}