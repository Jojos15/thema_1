public class AntigenTest extends DiagnosticTest{

    private int resultTime;

    public AntigenTest(String date, String surname, String sample, boolean positive, int resultTime){
        super(date, surname, sample, positive);
        this.resultTime = resultTime;
    }
}
