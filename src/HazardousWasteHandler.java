public class HazardousWasteHandler extends WasteHandler {

    @Override
    protected boolean canHandle(WasteContainer container) {
        return container.getWasteType().equals("hazardous");
    }

    @Override
    protected void process(WasteContainer container) {
        if (container.isFull()) {
            System.out.println("Hazardous Waste Collector: Safely disposing hazardous waste.");
            container.emptyContainer();
        } else {
            System.out.println("Hazardous Waste Collector: Container not full yet.");
        }
    }
}