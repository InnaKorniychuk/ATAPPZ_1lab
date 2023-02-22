public class ConsideredState extends State{

    public ConsideredState(Scholarship scholarship){
        super(scholarship);
        this.scholarship=scholarship;
        if(scholarship.isAllowedToStudy()){
            scholarship.changeState(new ConsideredState(scholarship));
        }
        else{
            scholarship.changeState(new ConsideredState(scholarship));
        }
      //  scholarship.addStatus(this.status());
    }
    @Override
    public String status() {
        return "You application is in progress.";
    }
    @Override
    public String toString() {
        return status();
    }
}
