package state;

class PurchaseManagerState implements RequisitionState {
    @Override
    public void submitRequisition(RequisitionContext context) {
        System.out.println("Requisition received by purchase manager.");
    }

    @Override
    public void approveRequisition(RequisitionContext context) {
        System.out.println("Cannot approve requisition in Purchase Manager state");
    }

    @Override
    public void rejectRequisition(RequisitionContext context) {
        System.out.println("Cannot reject requisition in Purchase Manager state");
    }

    @Override
    public void reconsiderRequisition(RequisitionContext context) {
        System.out.println("Cannot reconsider requisition in Purchase Manager state");
    }

    @Override
    public void managePurchase(RequisitionContext context) {
        System.out.println("Managing purchase...");
        // Simulating purchase success
        boolean purchaseSuccess = true;
        if (purchaseSuccess) {
            System.out.println("Purchase successful. Item can be collected.");
            context.setState(new ItemCollectedState());
        } else {
            System.out.println("Purchase failed. Sending back to Director for reapproval.");
            context.setState(new DirectorState());
        }
    }

    @Override
    public void itemCollected(RequisitionContext context) {
        System.out.println("Cannot collect item in Purchase Manager state");
    }
}