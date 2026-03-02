public abstract class WasteHandler {

    protected WasteHandler nextHandler;

    public void setNextHandler(WasteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(WasteContainer container) {
        if (canHandle(container)) {
            process(container);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(container);
        } else {
            System.out.println("No handler available for waste type: " 
                               + container.getWasteType());
        }
    }

    protected abstract boolean canHandle(WasteContainer container);
    protected abstract void process(WasteContainer container);
}