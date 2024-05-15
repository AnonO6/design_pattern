package state;

class ItemCollectedState implements RequisitionState {
    @Override
    public void submitRequisition(RequisitionContext context) {
        System.out.println("Cannot submit requisition in Item Collected state");
    }

    @Override
    public void approveRequisition(RequisitionContext context) {
        System.out.println("Cannot approve requisition in Item Collected state");
    }

    @Override
    public void rejectRequisition(RequisitionContext context) {
        System.out.println("Cannot reject requisition in Item Collected state");
    }

    @Override
    public void reconsiderRequisition(RequisitionContext context) {
        System.out.println("Cannot reconsider requisition in Item Collected state");
    }

    @Override
    public void managePurchase(RequisitionContext context) {
        System.out.println("Cannot manage purchase in Item Collected state");
    }

    @Override
    public void itemCollected(RequisitionContext context) {
        System.out.println("Item already collected.");
    }
}