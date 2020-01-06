//package connection;
//
//
//import java.beans.PropertyVetoException;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.util.ResourceBundle;
//
//public class DataSource {
//
//    private static DataSource datasource;
//    private ComboPooledDataSource pooledDatasource;
//
//    private final String URL = "jdbc:mysql://localhost:3306/TranslatorsBureau?&characterEncoding=UTF-8";
//    private final String DRIVER = "com.mysql.jdbc.Driver";
//    private final String USER ="root";
//    private final String PASSWORD = "MacBook";
//
////    {
////        ResourceBundle rb = ResourceBundle.getBundle("db");
////        if (rb == null) {
////            URL = "UNDEFINED";
////            USER = "UNDEFINED";
////            PASSWORD = "UNDEFINED";
////            DRIVER = "com.mysql.jdbc.Driver";
////            System.out.println("Бандл для db не был инициализирован");
////        } else {
////            URL = rb.getString("url");
////            USER = rb.getString("user");
////            PASSWORD = rb.getString("password");
////            DRIVER = rb.getString("driver");
////        }
////    }
//
//    private DataSource() throws IOException, SQLException, PropertyVetoException {
//        pooledDatasource = new ComboPooledDataSource();
//        pooledDatasource.setDriverClass(DRIVER); //loads the jdbc driver
//        pooledDatasource.setJdbcUrl(URL);
//        pooledDatasource.setUser(USER);
//        pooledDatasource.setPassword(PASSWORD);
//
//        // the settings below are optional -- c3p0 can work with defaults
//        pooledDatasource.setMinPoolSize(10);
//        pooledDatasource.setAcquireIncrement(5);
//        pooledDatasource.setMaxPoolSize(20);
//        pooledDatasource.setMaxStatements(180);
//
//    }
//
//    public static synchronized DataSource getInstance() throws IOException, SQLException, PropertyVetoException {
//        if (datasource == null) {
//            datasource = new DataSource();
//            return datasource;
//        } else {
//            return datasource;
//        }
//    }
//
//    public Connection getConnection() throws SQLException {
//        return pooledDatasource.getConnection();
//    }
//}
