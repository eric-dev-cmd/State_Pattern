package StatePattern;

public class ApprovedState implements State {
    @Override
    public void handleRequest() {
        System.out.println("ApprovedState");
    }
}
