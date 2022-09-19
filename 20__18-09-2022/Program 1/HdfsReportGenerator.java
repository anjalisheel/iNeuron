package FacadeDesignPattern;

public class HdfsReportGenerator implements IReportGenerator {
    @Override
    public void createConnection() {
        System.out.println("Creating connection with HDFS");
    }

    @Override
    public void generateCsvReport() {
        System.out.println("Generating the CSV report from HDFS");
    }

    @Override
    public void generatePdfReport() {
        System.out.println("Generating the PDF report from HDFS");
    }
}
