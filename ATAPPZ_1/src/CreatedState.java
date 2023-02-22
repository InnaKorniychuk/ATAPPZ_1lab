public class CreatedState extends State{
   Scholarship scholarship;
    public CreatedState(Scholarship scholarship){
            super(scholarship);
        this.scholarship=scholarship;
        if(scholarship.hasArrivedInTime()){
            scholarship.changeState(new ConsideredState(scholarship));
        }
        else{
           scholarship.changeState(new DeferredState(scholarship));
        }
        //this.scholarship.addStatus(status());
    }

    @Override
    public String status() {
        return "Your application has arrived to us. Please, wait. We will notify you later.";
    }

}
