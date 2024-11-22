package core.logging;

public class DatabaseLogger implements ILoggerDal{
    @Override
    public void Log(String data) {
        System.out.println("Veritabanına loglandı : "+data);
    }
}
