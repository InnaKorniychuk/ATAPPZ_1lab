public class DeferredState extends State{
    public DeferredState(Scholarship scholarship){
        super(scholarship);
        scholarship.changeState(new RejectedState(scholarship));
       // scholarship.addStatus(this.status());
    }
    @Override
    public String status() {
        return "Your application is deferred.";
    }
}
