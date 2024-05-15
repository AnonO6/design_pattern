package state;

public class RequisitionContext {
    private RequisitionState currentState;

    public RequisitionContext(RequisitionState initialState) {
        this.currentState = initialState;
    }

    public void setState(RequisitionState state) {
        this.currentState = state;
    }

    public void submitRequisition() {
        currentState.submitRequisition(this);
    }

    public void approveRequisition() {
        currentState.approveRequisition(this);
    }

    public void rejectRequisition() {
        currentState.rejectRequisition(this);
    }

    public void reconsiderRequisition() {
        currentState.reconsiderRequisition(this);
    }

    public void managePurchase() {
        currentState.managePurchase(this);
    }

    public void itemCollected() {
        currentState.itemCollected(this);
    }
}
