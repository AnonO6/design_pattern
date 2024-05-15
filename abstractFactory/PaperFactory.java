package abstractFactory;

interface PaperFactory {
    ComputerNetworksSection createComputerNetworksSection();
    BlockchainSection createBlockchainSection();
    MathsSection createMathsSection();
}
