public class RecyclableWasteHandler extends WasteHandler {

    @Override
    protected boolean canHandle(WasteContainer container) {
        return container.getWasteType().equals("recyclable");
    }

    @Override
    protected void process(WasteContainer container) {
        if (container.isFull()) {
            System.out.println("Recyclable Waste Collector: Collecting and sending recyclables for processing.");
            container.emptyContainer();
        } else {
            System.out.println("Recyclable Waste Collector: Container not full yet.");
        }
    }
}