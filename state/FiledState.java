package state;
class FiledState implements RequisitionState {
    @Override
    public void submitRequisition(RequisitionContext context) {
        System.out.println("Requisition submitted by student through lab assistant.");
        context.setState(new PurchasingStaffState());
    }

    @Override
    public void approveRequisition(RequisitionContext context) {
        System.out.println("Cannot approve requisition in Filed state");
    }

    @Override
    public void rejectRequisition(RequisitionContext context) {
        System.out.println("Cannot reject requisition in Filed state");
    }

    @Override
    public void reconsiderRequisition(RequisitionContext context) {
        System.out.println("Cannot reconsider requisition in Filed state");
    }

    @Override
    public void managePurchase(RequisitionContext context) {
        System.out.println("Cannot manage purchase in Filed state");
    }

    @Override
    public void itemCollected(RequisitionContext context) {
        System.out.println("Cannot collect item in Filed state");
    }
}
