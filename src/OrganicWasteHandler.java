public class OrganicWasteHandler extends WasteHandler {

    @Override
    protected boolean canHandle(WasteContainer container) {
        return container.getWasteType().equals("organic");
    }

    @Override
    protected void process(WasteContainer container) {
        if (container.isFull()) {
            System.out.println("Organic Waste Collector: Collecting and composting organic waste.");
            container.emptyContainer();
        } else {
            System.out.println("Organic Waste Collector: Container not full yet.");
        }
    }
}