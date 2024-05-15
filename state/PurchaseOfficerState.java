package state;

class PurchaseOfficerState implements RequisitionState {
    @Override
    public void submitRequisition(RequisitionContext context) {
        System.out.println("Requisition received by purchase officer.");
    }

    @Override
    public void approveRequisition(RequisitionContext context) {
        System.out.println("Requisition approved by purchase officer.");
        context.setState(new DirectorState());
    }

    @Override
    public void rejectRequisition(RequisitionContext context) {
        System.out.println("Requisition rejected by purchase officer.");
    }

    @Override
    public void reconsiderRequisition(RequisitionContext context) {
        System.out.println("Requisition reconsidered by purchase officer.");
    }

    @Override
    public void managePurchase(RequisitionContext context) {
        System.out.println("Cannot manage purchase in Purchase Officer state");
    }

    @Override
    public void itemCollected(RequisitionContext context) {
        System.out.println("Cannot collect item in Purchase Officer state");
    }
}
