package FacadeDesignPattern;

public interface IReportGenerator {
    public void createConnection();
    public void generateCsvReport();
    public void generatePdfReport();
}
