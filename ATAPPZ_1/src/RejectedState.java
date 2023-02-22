public class RejectedState extends State{

    public RejectedState(Scholarship scholarship){
        super(scholarship);
     //   scholarship.addStatus(this.status());
    }
    @Override
    public String status() {
        return "We are sorry, but your application is rejected.";
    }
    @Override
    public String toString() {
        return status();
    }
}
