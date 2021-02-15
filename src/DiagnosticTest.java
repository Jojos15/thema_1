public class DiagnosticTest extends Test{

    private String sample;
    private boolean positive;

    public DiagnosticTest(String date, String surname, String sample, boolean positive){
        super(date, surname);
        this.sample = sample;
        this.positive = positive;
    }

    public String getSample() {
        return sample;
    }

    public boolean isPositive() {
        return positive;
    }

    @Override
    public String getDate() {
        return super.getDate();
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public String printDetails() {
        return "";
    }
}
