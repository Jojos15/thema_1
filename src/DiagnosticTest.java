public class DiagnosticTest extends Test{

    private String sample;
    private boolean positive;

    public DiagnosticTest(String date, String surname, String sample, boolean positive){
        super(date, surname);
        this.sample = sample;
        this.positive = positive;
    }
}
