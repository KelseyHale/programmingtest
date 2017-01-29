package com.kh.domain;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

public class WriteCsv {
  public static void appendToFile(String filename, User user) {
    FileWriter fileWriter = null;
    
    CSVPrinter csvFilePrinter = null;
    
    CSVFormat csvFileFormat = CSVFormat.DEFAULT.withRecordSeparator("\n");
    try {
      fileWriter = new FileWriter(filename, true);
      
      csvFilePrinter = new CSVPrinter(fileWriter, csvFileFormat);
      List<String> userDataRecord = new ArrayList<String>();
      userDataRecord.add(user.FirstName);
      userDataRecord.add(user.LastName);
      userDataRecord.add(user.Address);
      userDataRecord.add(user.City);
      userDataRecord.add(user.State);
      userDataRecord.add(user.Zip);
      userDataRecord.add(user.IsActive);
      
      fileWriter.write("\n");
      csvFilePrinter.printRecord(userDataRecord); return;
    } catch (Exception e) {
      System.out.println("Error in CsvFileWriter");
      e.printStackTrace();
    } finally {
      try {
        fileWriter.flush();
        fileWriter.close();
        csvFilePrinter.close();
      } catch (IOException e) {
        System.out.println("Error while flushing/closing fileWriter/csvPrinter");
        e.printStackTrace();
      }
    }
  }
}