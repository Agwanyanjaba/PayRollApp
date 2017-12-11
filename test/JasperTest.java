
/*
package payrollsystem;
import java.sql.Connection;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.export.*;
import java.util.*;
			
public class JasperTest 
{
    JasperReport jasperReport;
    JasperPrint jasperPrint;
    Connection connection;
    public static void main(String[] args) {
        String fileName = "G:/Projects/payroll Sytem/src/payrollsystem/payslip2.jrxml";
        String outFileName = "test.pdf";
        HashMap hm = new HashMap();
        try {
            // Fill the report using an empty data source
            //JasperReport jasperReport = JasperCompileManager.compileReport("C://sample_report.jrxml");
            JasperPrint print = JasperFillManager.fillReport(fileName, hm, new JREmptyDataSource());
            
            // Create a PDF exporter
            JRExporter exporter = new JRPdfExporter();
            
            // Configure the exporter (set output file name and print object)
            exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outFileName);
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
            
            // Export the PDF file
            exporter.exportReport();
            
        } catch (JRException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

* */