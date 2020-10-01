import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WorkWithCSVFile {

    public static void writeAnswers(List<Answer> answers, String filepath){
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filepath)));
            pw.println("ROUTE EXISTS;MIN LENGTH");
            answers.forEach(x -> {
                pw.print(x.isRoute());
                if(x.isRoute()){
                    pw.println(";" + x.getLength());
                }else {
                    pw.println();
                }
            });
            pw.flush();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Point> getPoints(String path){
        String line = "";
        List<Point> points = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            br.readLine();

            while ((line = br.readLine()) != null){
                String[] values = line.split(";");
                points.add(new Point(Integer.parseInt(values[0]), Integer.parseInt(values[1])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return points;
    }

    public static List<Pipe> getPipes(String path){
        String line = "";
        List<Pipe> pipes = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            br.readLine();
            br.readLine();

            while ((line = br.readLine()) != null){
                String[] values = line.split(";");
                pipes.add(new Pipe(Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2])));
                br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pipes;
    }
}
