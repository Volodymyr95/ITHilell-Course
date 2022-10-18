package hilell.l12.task;

public class ManualQA extends QA {


    @Override
    public void doJob() {
        System.out.println("Testing...");
    }

    @Override
    public void doResult() {
        System.out.println("Bug founded!");
    }
}
