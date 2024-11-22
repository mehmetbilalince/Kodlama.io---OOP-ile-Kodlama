package core.logging;

public class EmailLogger implements ILoggerDal{
    @Override
    public void Log(String data) {
        System.out.println("Emaile loglandı : "+data);
    }
}
