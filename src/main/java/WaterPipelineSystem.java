import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WaterPipelineSystem {
    private List<Pipe> pipes;

    public WaterPipelineSystem(List<Pipe> pipes) {
        this.pipes = pipes;
    }

    public Answer findRoute(int a, int b){
        Answer answer = new Answer();
        answer.addWay(a);

        while (!answer.isRoute()){
            int localPipe = answer.getWay().get(answer.getWay().size()-1);
            List<Pipe> pipesX = pipes.stream().filter(x -> x.getIdX() == localPipe).collect(Collectors.toList());
            if(pipesX.isEmpty()){
                break;
            }
            Pipe pipeX = pipesX.stream().min(Comparator.comparing(Pipe::getLength)).get();
            answer.setLength(answer.getLength() + pipeX.getLength());

            if(pipeX.getIdY() == b){
                answer.setRoute(true);
            }else {
                answer.addWay(pipeX.getIdY());
            }
        }
        answer.addWay(b);
        return answer;

    }

    public List<Pipe> getPipes() {
        return pipes;
    }

    public void setPipes(List<Pipe> pipes) {
        this.pipes = pipes;
    }

    private List<Way> getWays(){
        List<Way> ways = new ArrayList<>();
        pipes.forEach(x -> ways.add(new Way(x.getIdX(), x.getIdY(), x.getLength())));
        return ways;
    }
}
