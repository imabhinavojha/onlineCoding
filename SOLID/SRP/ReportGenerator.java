package SOLID.SRP;

public class ReportGenerator {
    public void generatePDFReport() {
        System.out.println("PDF");
    }

    public void generateCSVReport() {
        System.out.println("CSV");
    }

    public void sendEmail() {
        System.out.println("Email");
    }

    public static void main(String[] args) {
        ReportGenerator obj = new ReportGenerator();
        obj.generatePDFReport();

        CSVReportGenerator obj1 = new CSVReportGenerator();
        obj1.generateCSVReport();
    }
}
