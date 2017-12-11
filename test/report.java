/*
package payrollsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
 
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRXlsExporter;

public class report
{
   JasperReport jasperReport;
   JasperPrint jasperPrint;
   Connection connection;
    public  void reportMethod()
    {
         
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/employees");
        
        HashMap jasperParameter = new HashMap();

        // jrxml compiling process
        try
        {
        jasperReport = JasperCompileManager.compileReport("G:/Projects/payroll Sytem/src/payrollsystem/payslip2.jrxml");

        // filling report with data from data source

        jasperPrint = JasperFillManager.fillReport(jasperReport,jasperParameter, connection);
        // exporting process
        // 1- export to PDF
        JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/sample_report.pdf");

        // 2- export to HTML
        JasperExportManager.exportReportToHtmlFile(jasperPrint, "C:/sample_report.html" ); 

        // 3- export to Excel sheet
        JRXlsExporter exporter = new JRXlsExporter();
        exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
        exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, "C:/simple_report.xls" );

        exporter.exportReport();
        }
        catch(JRException e)
        {
            
        }



    }
    catch(SQLException exception)
     {
      exception.printStackTrace();
     }
    catch (ClassNotFoundException e)
    {
        
    }
        //return connection;
    }
       public static void main(String []args) 
       {
           report ob  = new report();
           ob.reportMethod();
       } 
    
    
    /* JasperReport is the object
        that holds our compiled jrxml file */
        /* JasperPrint is the object contains
        report after result filling process */
        // connection is the data source we used to fetch the data from
        //Connection connection = establishConnection(); 
        // jasperParameter is a Hashmap contains the parameters
        // passed from application to the jrxml layout
        
 
//}
//*/