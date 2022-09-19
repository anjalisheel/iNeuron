package FacadeDesignPattern;

public class OracleDbReportGenerator implements IReportGenerator {

        @Override
        public void createConnection() {
            System.out.println("Creating connection with oracle DB");
        }

        @Override
        public void generateCsvReport() {
            System.out.println("Generating the CSV report from oracle DB");
        }

        @Override
        public void generatePdfReport() {
            System.out.println("Generating the PDF report from oracle DB");
        }
}
