package state;

public interface RequisitionState {
    void submitRequisition(RequisitionContext context);
    void approveRequisition(RequisitionContext context);
    void rejectRequisition(RequisitionContext context);
    void reconsiderRequisition(RequisitionContext context);
    void managePurchase(RequisitionContext context);
    void itemCollected(RequisitionContext context);
}
