import dao.entities.Language;
import dao.entities.Order;
import dao.entities.Translator;
import dao.entities.User;
import org.junit.Test;
import servises.TranslatorService;
import servises.impl.LanguageServiceImpl;
import servises.impl.OrderServiceImpl;
import servises.impl.MySqlTranslatorService;
import servises.impl.UserServiceImpl;

import java.sql.Date;
import java.sql.SQLException;
import java.util.GregorianCalendar;
import java.util.List;


public class UnitTestForLang extends MySqlTranslatorService {

    @Test
    public void forTranslatorTest() throws SQLException {


        /*  Connection*/
//        ConnectionManagerWithoutTL cmwtl = new ConnectionManagerWithoutTL();
//        cmwtl.getConnection();
//    }



        /* TRANSLATORS*/

        /* Translators
        getAll()*/
//
//        MySqlTranslatorService translatorService = new MySqlTranslatorService();
//        List<Translator> first = translatorService.getAll();
//        for (Translator t : first) {
//            System.out.print(t.getNameTranslator()+ "  ");
//            System.out.println(t.getConnectionNumber());
//        }

        /*Translator
        getById*/


//        MySqlTranslatorService translatorService = new MySqlTranslatorService();
//       Translator trans = translatorService.read(2);
//        System.out.println(trans.getNameTranslator() + trans.getConnectionNumber());


        /*create
        Translator*/

//        MySqlTranslatorService translatorService = new MySqlTranslatorService();
//        Translator tr = translatorService.create("Name", 5, "Name@mail.ru", "123");
//        System.out.println(tr.getNameTranslator());

        /*delete
        translator*/
//        MySqlTranslatorService translatorService = new MySqlTranslatorService();
//        translatorService.delete(8);


        //?????
//
//        MySqlTranslatorService translatorService = new MySqlTranslatorService();
//        Translator translator = new Translator();
//        translator.set
//       translatorService.update();



        /*LANGUAGES*/

        /*languages
        gellAll*/

//        LanguageServiceImpl ls = new LanguageServiceImpl();
//        List<Language> lang = ls.getAll();
//        for (Language l : lang) {
//            System.out.println(l.getNameLanguage() + "  ");
//        }

//
//        LanguageServiceImpl ls = new LanguageServiceImpl();
//       Language language = ls.read(2);
//        System.out.println(language.getNameLanguage());


 /* create
// language*/
//LanguageServiceImpl ls = new LanguageServiceImpl();
//ls.create("yoyo");


        /*ORDERS*/


        /*create
        order*/

//        OrderServiceImpl os = new OrderServiceImpl();
//        Order order = os.create("2018-12-23", "2019-02-13",
//                "chinese","belorussian");
//        System.out.println(order.getIdOrder());

        //  new Date(GregorianCalendar.getInstance().getTime().getTime()),
        //                new Date(GregorianCalendar.getInstance().getTime().getTime()),

        /*delete order by Id*/
//
//        OrderServiceImpl os = new OrderServiceImpl();
//        os.delete(3);

OrderServiceImpl os = new OrderServiceImpl();
List<Order> orders = os.getAll();
        for (Order o : orders) {
            System.out.print(o.getIdOrder()+ "  ");
            System.out.println(o.getDeadline());
        }


//        /*USER*/
//        UserServiceImpl us = new UserServiceImpl();
//        User user = us.getRole("Admin", "adm");
//        System.out.println(user.getRole());


//    UserServiceImpl us = new UserServiceImpl();
//    User user = us.getUserByName("Admin");
//        System.out.println(user.getUserName()  + user.getRole());

//    UserServiceImpl us = new UserServiceImpl();
//    User user = us.read(1);
//        System.out.println(user.getUserName());



//        UserServiceImpl us = new UserServiceImpl();
//        User user = us.create("Duda","dada");
//        System.out.println(user.getUserName());
    }}
