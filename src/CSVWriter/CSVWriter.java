package CSVWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CSVWriter {
    public static void write(String[] rows, String methodName, String inputDescription) {
        String pathname = "";
        pathname += methodName + " on " + inputDescription + ".csv";
        try (PrintWriter writer = new PrintWriter(new File(pathname))) {
            StringBuilder sb = new StringBuilder();

            //name columns
            sb.append("iterations,");
            sb.append("time_in_milliseconds");
            sb.append("\n");

            //add rows
            for (int i = 0; i < rows.length; i++) {
                String[] rowArray = rows[i].split(" ");
                sb.append(rowArray[0]);
                sb.append(",");
                sb.append(rowArray[1]);
                sb.append("\n");
            }

            writer.write(sb.toString());
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
