/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package readtxtfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author udit
 */
public class ReadTxtFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        try {
//            File file = new File("C:\\Users\\udits\\OneDrive\\Desktop\\ReadFile\\Schedule_EBANGHD_20220810_20220816.txt");    //creates a new file instance  
//            FileReader fr = new FileReader(file);   //reads the file  
//            BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream  
//            StringBuffer sb = new StringBuffer();    //constructs a string buffer with no characters  
//            String line;
//            while ((line = br.readLine()) != null) {
//                sb.append(line);      //appends line to string buffer  
//                sb.append(line.split("\\|"));
//                sb.append("\n");     //line feed   
//            }
//            fr.close();    //closes the stream and release the resources  
//            System.out.println("Contents of File: ");
//            System.out.println(sb.toString());   //returns a string that textually represents the object  
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
        int columnIndex = 0;
        String line;
        String[] split;
        BufferedReader reader = null;
  String[]test = null ;
        try {

//            reader = new BufferedReader(new FileReader(args[0]));
            reader = new BufferedReader(new FileReader("C:\\Users\\udits\\OneDrive\\Desktop\\ReadFile\\Schedule_EBANGHD_20220810_20220816.txt"));
//            reader.readLine();
            while ((line = reader.readLine()) != null) {
                split = line.split("\\|");

                for (int i = 0; i < split.length; i++) {
                    if (split[i].contains("Program Episode ID")) {
                        columnIndex = i;
                    }
                }
                String xmlobjectName = split[columnIndex].replaceAll("^\"|\"$", "");
                System.out.println(xmlobjectName);
                
//                String url = "http://192.168.1.100:9763/services/DIVArchiveWS_SOAP_2.1.DIVArchiveWSHttpSoap12Endpoint/";
//                String url = "http://192.168.1.101:9763/services/DIVArchiveWS_SOAP_2.1.DIVArchiveWSHttpSoap12Endpoint/";
//                URL obj = new URL(url);
//                HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//                con.setRequestMethod("POST");
//                con.setRequestProperty("Content-Type", "application/xml");
//                String xml = "<ns1:getObjectDetailsList xmlns:ns1=\"http://interaction.api.ws.diva.fpdigital.com/xsd\">\n"
//                        + "    <ns1:sessionCode>test</ns1:sessionCode>\n"
//                        + "    <ns1:isFirstTime>1</ns1:isFirstTime>\n"
//                        + "    <ns1:initialTime>0</ns1:initialTime>\n"
//                        + "    <ns1:listType >1</ns1:listType>\n"
//                        + "    <ns1:objectsListType >2</ns1:objectsListType>\n"
//                        + "    <ns1:listPosition >0</ns1:listPosition>\n"
//                        + "    <ns1:maxListSize>50</ns1:maxListSize>\n"
//                        + "    <ns1:objectName>" + xmlobjectName + "</ns1:objectName>\n"
//                        + "    <ns1:objectCategory>*</ns1:objectCategory>\n"
//                        + "    <ns1:mediaName>*</ns1:mediaName>\n"
//                        + "    <ns1:levelOfDetail>0</ns1:levelOfDetail>\n"
//                        + "</ns1:getObjectDetailsList>";
//                con.setDoOutput(true);
//                //wirte body in api
//                try ( OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream())) {
//                    wr.write(xml);
//                    wr.flush();
//                } catch (IOException e) {
//                    System.out.println(e);
//                    e.printStackTrace();
//                }
//                String responseStatus = con.getResponseMessage();
//                System.out.println("Response :" + responseStatus);
//.replace("Program Episode ID", "")
//            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
