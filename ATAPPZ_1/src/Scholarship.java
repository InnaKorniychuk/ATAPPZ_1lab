import java.util.ArrayList;
import java.util.List;

public class Scholarship {
    private State state;
    private List<String> statuses;
    private boolean allowedToStudy = false;
    private boolean  arrivedInTime = false;
    public Scholarship( boolean handledСorrectly, int month) {
        if(month>=1&&month<=3) {
            this.arrivedInTime = true;
        }
        if(handledСorrectly){
           this.allowedToStudy=true;
        }
        this.state = new CreatedState(this);
        this.statuses=new ArrayList<>();

    }

    public void changeState(State state) {
        this.state = state;
    }
    public State getState() {
        return state;
    }
    public List<String>getStatuses(){
        return statuses;
    }

    public void addStatus(String s){
        statuses.add(s);
    }
  //  public boolean getAllowedToStudy() {
    //    return allowedToStudy;
    //}

    public boolean isAllowedToStudy() {
        return allowedToStudy;
    }
    public boolean hasArrivedInTime(){return arrivedInTime;}


}
