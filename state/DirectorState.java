package state;

class DirectorState implements RequisitionState {
    @Override
    public void submitRequisition(RequisitionContext context) {
        System.out.println("Requisition received by director.");
    }

    @Override
    public void approveRequisition(RequisitionContext context) {
        System.out.println("Requisition approved by director.");
        context.setState(new PurchaseManagerState());
    }

    @Override
    public void rejectRequisition(RequisitionContext context) {
        System.out.println("Requisition rejected by director.");
    }

    @Override
    public void reconsiderRequisition(RequisitionContext context) {
        System.out.println("Requisition reconsidered by director.");
    }

    @Override
    public void managePurchase(RequisitionContext context) {
        System.out.println("Cannot manage purchase in Director state");
    }

    @Override
    public void itemCollected(RequisitionContext context) {
        System.out.println("Cannot collect item in Director state");
    }
}
