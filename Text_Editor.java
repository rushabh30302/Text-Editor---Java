import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
public class Text_Editor {
   public static String fileToString(String filePath) throws Exception{
      String input = null;
      Scanner sc = new Scanner(new File(filePath));
      StringBuffer sb = new StringBuffer();
      while (sc.hasNextLine()) {
         input = sc.nextLine();
         sb.append(input);
      }
      sc.close();
      return sb.toString();
   }
   public static void main(String args[]) throws Exception {

      Scanner sc = new Scanner (System.in);

      // FILE 1

      System.out.println("\t\tTEXT EDITOR\n\n");
      System.out.println("\t\tFOR  FILE  1");

      System.out.println("\n\nEnter File-1 Name");
      String filePath;
      filePath=sc.nextLine();
      String result = fileToString(filePath);
      System.out.println("Contents of the file:\n"+result);

      // OPERATION 1

      System.out.println("\n\nOPERATION 1-To delete specific content from the file:\n");
     
      //Deleting the desired word 

      System.out.println("Enter the content you want to delete");
      String s,c;
      s=sc.nextLine();
      c=result;
      result = result.replaceAll(s, "");

      if(result.equals(c))
      {
         System.out.println("The specified content doesnt exists in the file\n");
      }
      else
      {
         //Creating New Local File after changes are made

         try {
            File myObj = new File("Demo1_Delete.txt");
            if (myObj.createNewFile()) {
               System.out.println("New Local File created: " + myObj.getName() +"\n");
            } else {
               System.out.println("File already exists.");
            }
         } 
         catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
         }

         //Rewriting the contents of the file

         try {
            FileWriter myWriter = new FileWriter("Demo1_Delete.txt");
            myWriter.write(result);
            myWriter.close();
         }
         catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
         }

         //Printing after changes are made
            
         System.out.println("Contents of the file after deleting the desired word:");
         System.out.println(fileToString("Demo1_Delete.txt"));
      }



      // Operation 2

      System.out.println("\n\nOPERATION 2-To Copy the content from one file to another file\n");

      System.out.println("Contents of the file: \n"+result + "\n");

      //Taking the file location where the content is to be copied
      System.out.println("Enter the filename to whose the content is to be copied");
      String copy_filename;
      copy_filename=sc.nextLine();
         
      String result2 = fileToString(copy_filename);
      System.out.println("Contents of the file: \n"+result2 + "\n");
      // Copying content from one file to another

      String result1 = fileToString(copy_filename);
      result1 = result1  + result;

      //Creating New Local File after changes are made

      try {
         File myObj = new File("Demo1_Copy2.txt");
         if (myObj.createNewFile()) {
           System.out.println("New Local File created: " + myObj.getName() + "\n");
         }
         else {
           System.out.println("File already exists.");
         }
      } 
      catch (IOException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }

      try {
         FileWriter myWriter = new FileWriter("Demo1_Copy2.txt");
         myWriter.write(result1);
         myWriter.close();
      }
      catch (IOException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }

      System.out.println("Contents of the file 2 after copying from file 1");
      System.out.println(fileToString("Demo1_Copy2.txt") + "\n");
           

      // FILE 2

      System.out.println("\n\n\t\tFOR  FILE  2");

      System.out.println("\n\nEnter File-2 Name");
      filePath=sc.nextLine();
      result = fileToString(filePath);
      System.out.println("Contents of the file:\n"+result);

      // OPERATION 1

      System.out.println("\n\nOPERATION 1-To delete specific content from the file:\n");
     
      
      //Replacing the word with desired one

      System.out.println("Enter the content you want to delete");
      s=sc.nextLine();
      c=result;
      result = result.replaceAll(s, "");

      if(result.equals(c))
      {
         System.out.println("The specified content doesnt exists in the file\n");
      }
      else
      {
         //Creating New Local File after changes are made

         try {
            File myObj = new File("Demo2_Delete.txt");
            if (myObj.createNewFile()) {
               System.out.println("New Local File created: " + myObj.getName() +"\n");
            } else {
               System.out.println("File already exists.");
            }
         } 
         catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
         }

         //Rewriting the contents of the file

         try {
            FileWriter myWriter = new FileWriter("Demo2_Delete.txt");
            myWriter.write(result);
            myWriter.close();
         }
         catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
         }

         //Printing after changes are made
            
         System.out.println("Contents of the file after deleting the desired word:");
         System.out.println(fileToString("Demo2_Delete.txt"));
      }
      
      // Operation 2

      System.out.println("\n\nOPERATION 2-To copy Copy the content from one file to another file\n");

      System.out.println("Contents of the file: \n"+result + "\n");

      //Taking the file location where the content is to be copied
      System.out.println("Enter the filename to whose the content is to be copied");
      copy_filename=sc.nextLine();
         
      result2 = fileToString(copy_filename);
      System.out.println("Contents of the file: \n"+result2 + "\n");

      // Copying content from one file to another

      result1 = fileToString(copy_filename);
      result1 = result1  + result;

      //Creating New Local File after changes are made

      try {
         File myObj = new File("Demo2_Copy2.txt");
         if (myObj.createNewFile()) {
           System.out.println("New Local File created: " + myObj.getName() + "\n");
         }
         else {
           System.out.println("File already exists.");
         }
      } 
      catch (IOException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }

      try {
         FileWriter myWriter = new FileWriter("Demo2_Copy2.txt");
         myWriter.write(result1);
         myWriter.close();
      }
      catch (IOException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }

      System.out.println("Contents of the file 2 after copying from file 1");
      System.out.println(fileToString("Demo2_Copy2.txt") + "\n");
      sc.close();
      
   }
}