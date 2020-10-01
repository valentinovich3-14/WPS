import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inputSystemPath = "../../../inputSystem.CSV";
        String inputPointsPath = "../../../inputPoints.CSV";
        String outputAnswersPath = "../../../outputAnswers.CSV";


        List<Pipe> pipes = WorkWithCSVFile.getPipes(inputSystemPath);
        pipes.stream().forEach(System.out::println);
        System.out.println();

        List<Point> points = WorkWithCSVFile.getPoints(inputPointsPath);
        points.forEach(System.out::println);
        System.out.println();

        List<Answer> answers = new ArrayList<>();
        WaterPipelineSystem waterPipelineSystem = new WaterPipelineSystem(pipes);

        points.forEach(x -> answers.add(waterPipelineSystem.findRoute(x.IdA, x.IdB)));
        answers.forEach(System.out::println);

        WorkWithCSVFile.writeAnswers(answers, outputAnswersPath);

        WorkWithDB.uploadPointsCSVtoDB(inputSystemPath);
        WorkWithDB.uploadSystemCSVtoDB(inputPointsPath);

    }
}
