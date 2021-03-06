package com.kh.service;
import org.springframework.stereotype.Service;

import com.kh.domain.User;
import com.kh.domain.WriteCsv;
import java.io.File;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;


@Service
public class UserService {
	public List<User> userList = new LinkedList<User>();
	  
	UserService() {
		File csvData = new File("../webapps/programmingtest/WEB-INF/classes/question1.csv");
	    CSVFormat csvFileFormat = CSVFormat.DEFAULT.withHeader(new String[0]).withIgnoreSurroundingSpaces();
	    try {
	      CSVParser parser = CSVParser.parse(csvData, Charset.forName("UTF-8"), csvFileFormat);
	      for (CSVRecord csvRecord : parser) {
	        String firstName = csvRecord.get("FirstName");
	        String lastName = csvRecord.get("LastName");
	        String address = csvRecord.get("Address");
	        String city = csvRecord.get("City");
	        String state = csvRecord.get("State");
	        String zip = csvRecord.get("Zip");
	        String isActive = csvRecord.get("IsActive");
	        
	        User user = new User();
	        user.setFirstName(firstName);
	        user.setLastName(lastName);
	        user.setAddress(address);
	        user.setCity(city);
	        user.setState(state);
	        user.setZip(zip);
	        if(isActive == "true") {
	        	user.setIsActive(true);
	        } else {
	        	user.setIsActive(false);
	        }
	        
	        System.out.println(user.getFirstName());
	        
	        this.userList.add(user);
	      }
	    } catch (Exception e) {
	      System.out.println("Error in csvfilereader!!!");
	      e.printStackTrace();
	    }
	  }
	  
	  public List<User> findAll() {
		  System.out.println(userList);
	    return this.userList;
	  }
	  
	  public void findNew(User user) {
	    this.userList.add(user);
	  }
	  
	  public void add(User user) {
	    WriteCsv.appendToFile("../webapps/programmingtest/WEB-INF/classes/question1.csv", user);
	    this.userList.add(user);
	  }
}
