package state;

public class Main {
    public static void main(String[] args) {
        // Initialize context with initial state (Filed)
        RequisitionContext context = new RequisitionContext(new FiledState());

        // Simulate student submitting requisition
        System.out.println("Student submits requisition...");
        context.submitRequisition(); // Moves to PurchasingStaffState

        // Simulate purchasing staff actions
        System.out.println("\nPurchasing staff receives requisition...");
        context.approveRequisition(); // Moves to PurchaseOfficerState

        // Simulate purchase officer actions
        System.out.println("\nPurchase officer approves requisition...");
        context.managePurchase(); // Moves to DirectorState or PurchaseManagerState

        // Simulate director actions
        System.out.println("\nDirector approves requisition...");
        context.approveRequisition(); // Moves to PurchaseManagerState

        // Simulate purchase manager managing purchase
        System.out.println("\nPurchase manager manages purchase...");
        context.managePurchase(); // Moves to ItemCollectedState if successful, else back to DirectorState

        // Simulate student collecting item
        System.out.println("\nStudent collects item...");
        context.itemCollected(); // Moves to ItemCollectedState

        // Attempt to perform actions in end state (ItemCollectedState)
        System.out.println("\nAttempting actions in end state...");
        context.submitRequisition(); // Cannot submit requisition in Item Collected state
        context.approveRequisition(); // Cannot approve requisition in Item Collected state
        context.managePurchase(); // Cannot manage purchase in Item Collected state
        context.itemCollected(); // Item already collected
    }
}