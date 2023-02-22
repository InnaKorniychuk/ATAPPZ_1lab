public abstract class State {
    Scholarship scholarship;

    /**
     * Context passes itself through the state constructor. This may help a
     * state to fetch some useful context data if needed.
     */
    State(Scholarship scholarship) {
        this.scholarship=scholarship;
    }

    public abstract String status();

    @Override
    public String toString() {
        return status();
    }

    /*    public abstract String created();
    public abstract String considered ;
    public abstract String deferred();
    public abstract String rejected();
    public abstract String confirmed();*/

}
