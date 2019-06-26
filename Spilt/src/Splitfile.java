import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Splitfile {
//	 ArrayList<String> Data = new ArrayList<>();
	 public ArrayList<double[]> LongMoveMent = new ArrayList<double[]>();
	public static void main(String args[])throws Exception{    
//		 File file = new File("logfile_5.4.2019.15.16.json"); 
//		 BufferedReader br = new BufferedReader(new FileReader(file)); 
//		 String st; 
//		 String[] data = new String[21];
//		  while ((st = br.readLine()) != null) 
//			  data = st.split(", ");
//		  	
//		    System.out.println(st); 
//     
		String line = null;
		String aom = null;
		String firstLine = null;
		 File file = new File("logfile_11.4.2019.19.39.json"); 
		 BufferedReader bufferedReader = new BufferedReader(new FileReader(file)); 
		//BufferedReader bufferedReader = new BufferedReader(fileReader);
		//FileReader fileReader2 = new FileReader(filePath1 + fileName1); // read logfile
		double frcX, frcY, frcZ;
		double dirX, dirY, dirZ;
		Float posX, posY, posZ;
		String[] data = new String[21];
		String[] toothdir = new String[3];
		String actRecog = "";
		String cmd = "", cmd2 = "";
		double mvmtDir[] = {0.0, 0.0, 0.0};
		Queue<Double> qX = new LinkedList<>();
		Queue<Double> qY = new LinkedList<>();
		Queue<Double> qZ = new LinkedList<>();
		firstLine = bufferedReader.readLine();
		toothdir = firstLine.split(", ");
		double toothDir[] = {Double.parseDouble(toothdir[0]),
				Double.parseDouble(toothdir[1]),
				Double.parseDouble(toothdir[2])};
		bufferedReader.readLine();

		
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("aom2.txt"));
		double[] nums = new double[3];
		int count =0;
		while((line = bufferedReader.readLine()) != null) {
			count++;
			line = line.replace("{", "");
			data = line.split("\\{|, |\\}"); // get 19 data
			frcX = Double.parseDouble(data[7]);
			frcY = Double.parseDouble(data[8]);
			frcZ = Double.parseDouble(data[9]);
			dirX = Double.parseDouble(data[10]);
			dirY = Double.parseDouble(data[11]);
			dirZ = Double.parseDouble(data[12]);
			double direction[] = {dirX, dirY, dirZ};
			posX = Float.parseFloat(data[1]);
			posY = Float.parseFloat(data[2]);
			posZ = Float.parseFloat(data[3]);
			System.out.println(posX+" "+posY+" "+posZ);
			
			 
			  	//float outFileName = posX+posY+posZ;
			    writer.write(data[1]+","+data[2]+","+data[3]+"\n");
			    //writer.write(data[1]+","+data[2]+","+data[3]);
			   
			

} writer.close();
System.out.println("Total = "+count);}}

