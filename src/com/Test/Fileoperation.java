package Test;

import java.io.*;
public class Fileoperation {
   public static final String delimiter = ",";
   public static void read(String csvFile) {
      try {
         File file = new File(csvFile);
         FileReader Ha = new FileReader(file);
         BufferedReader In = new BufferedReader(Ha);
         String line = "";
         String[] InvArr;
         while((line = In.readLine()) != null) {
            InvArr = line.split(delimiter);
            for(String LineStr : InvArr) {
               System.out.print(LineStr + " ");
            }
            System.out.println();
         }
         In.close();
         } catch(IOException ioe) {
            ioe.printStackTrace();
         }
   }

    public Fileoperation() {
    }
   public static void main(String[] args) {
      String csvFile = "F:\\front end testing udacity\\project 1\\InvoiceHeader.csv";
       Fileoperation.read(csvFile);
   }
}