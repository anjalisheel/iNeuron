package FacadeDesignPattern;

public class Client {
    public static void main(String[] args) {
        ReportFacade reportFacade = new ReportFacade();

        //know historical reports in PDF format
        reportFacade.generateReport("HDFS", "PDF");
        System.out.println();

        //know the report from last24 hours in CSV format
        reportFacade.generateReport("OracleDb", "CSV");
    }
}
