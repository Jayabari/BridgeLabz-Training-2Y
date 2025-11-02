interface Exporter {
    void export();
    default void exportToJSON() {
        System.out.println("Exported to JSON");
    }
}

class CSVExporter implements Exporter {
    public void export() {
        System.out.println("Exported to CSV");
    }
}

class PDFExporter implements Exporter {
    public void export() {
        System.out.println("Exported to PDF");
    }
}

public class DataExport {
    public static void main(String[] args) {
        CSVExporter c = new CSVExporter();
        PDFExporter p = new PDFExporter();
        c.export();
        c.exportToJSON();
        p.export();
        p.exportToJSON();
    }
}

