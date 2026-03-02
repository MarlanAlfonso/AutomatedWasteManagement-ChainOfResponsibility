public class Main {

    public static void main(String[] args) {

        // Create handlers
        WasteHandler organicHandler = new OrganicWasteHandler();
        WasteHandler recyclableHandler = new RecyclableWasteHandler();
        WasteHandler hazardousHandler = new HazardousWasteHandler();

        // Build Chain
        organicHandler.setNextHandler(recyclableHandler);
        recyclableHandler.setNextHandler(hazardousHandler);

        // Create waste containers
        WasteContainer organicBin = new WasteContainer("organic", 100, 100);
        WasteContainer recyclableBin = new WasteContainer("recyclable", 200, 200);
        WasteContainer hazardousBin = new WasteContainer("hazardous", 50, 30); // not full
        WasteContainer unknownBin = new WasteContainer("electronic", 80, 80);

        // Trigger waste collection process
        System.out.println("\nWASTE COLLECTION PROCEESS:");

        organicHandler.handleRequest(organicBin);
        organicHandler.handleRequest(recyclableBin);
        organicHandler.handleRequest(hazardousBin);
        organicHandler.handleRequest(unknownBin);
    }
}