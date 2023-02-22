public class ConfirmedState extends State{
    public ConfirmedState(Scholarship scholarship){
        super(scholarship);
        //scholarship.addStatus(this.status());
    }
    @Override
    public String status() {
        return "Congratulations! You are accepted.";
    }
}
