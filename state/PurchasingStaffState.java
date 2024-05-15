package state;

class PurchasingStaffState implements RequisitionState {
    @Override
    public void submitRequisition(RequisitionContext context) {
        System.out.println("Requisition received by purchasing staff.");
    }

    @Override
    public void approveRequisition(RequisitionContext context) {
        System.out.println("Requisition approved by purchasing staff.");
        context.setState(new PurchaseOfficerState());
    }

    @Override
    public void rejectRequisition(RequisitionContext context) {
        System.out.println("Requisition rejected by purchasing staff.");
    }

    @Override
    public void reconsiderRequisition(RequisitionContext context) {
        System.out.println("Requisition reconsidered by purchasing staff.");
    }

    @Override
    public void managePurchase(RequisitionContext context) {
        System.out.println("Cannot manage purchase in Purchasing Staff state");
    }

    @Override
    public void itemCollected(RequisitionContext context) {
        System.out.println("Cannot collect item in Purchasing Staff state");
    }
}
