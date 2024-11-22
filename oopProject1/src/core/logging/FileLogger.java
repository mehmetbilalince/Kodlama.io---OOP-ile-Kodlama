package core.logging;

public class FileLogger implements ILoggerDal{
    @Override
    public void Log(String data) {
        System.out.println("Dosyaya loglandı : "+data);
    }
}
