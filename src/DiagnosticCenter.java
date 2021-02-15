import java.util.ArrayList;

public class DiagnosticCenter {

    ArrayList<Test> tests;

    public DiagnosticCenter () {
        tests = new ArrayList<Test>();
    }

    public void addTest(Test t){
        tests.add(t);
    }
}
