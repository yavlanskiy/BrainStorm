package test;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MySuteListtener2 implements ISuiteListener {
    @Override
    public void onStart(ISuite suite) {
        System.out.println("Hello Init!! (2)");
    }

    @Override
    public void onFinish(ISuite suite) {

    }
}
