package FacadeDesignPattern;

public class ReportFacade {
    public void generateReport(String dataSourceType, String reportType)
    {
        if(dataSourceType == "HDFS")
        {
            HdfsReportGenerator hdfsReportGenerator = new HdfsReportGenerator();
            hdfsReportGenerator.createConnection();

            if(reportType == "CSV")
            {
                hdfsReportGenerator.generateCsvReport();
            }
            else
            {
                hdfsReportGenerator.generateCsvReport();
            }
        }
        else
        {
            OracleDbReportGenerator oracleDbReportGenerator = new OracleDbReportGenerator();
            oracleDbReportGenerator.createConnection();

            if(reportType == "CSV")
            {
                oracleDbReportGenerator.generateCsvReport();
            }
            else
            {
                oracleDbReportGenerator.generateCsvReport();
            }
        }
    }
}
