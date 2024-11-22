public class Main {
    public static void main(String[] args) {
        MysqlCustomerDal mysqlCustomerDal=new MysqlCustomerDal();
        mysqlCustomerDal.add();

        CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}