package threads;

public class Producer extends Thread{

    private Company company;
    @Override
    public void run() {
        company.produce_item(1);
    }

}
