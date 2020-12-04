//import com.codeborne.selenide.Configuration;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//
//import static com.codeborne.selenide.Condition.text;
//import static com.codeborne.selenide.Selenide.$;
//import static com.codeborne.selenide.Selenide.open;
//
//public class GoogleSearchTest {
//
//    @BeforeAll
//    static void setup() {
//        Configuration.startMaximized = true;
//    }
//
//    @Test
//    void googleTest() {
//        open("https://www.google.com/");
//        $("[name='q']").val("Selenium").pressEnter();
//        $("body").shouldHave(text("selenium.dev"));
//    }
//}
