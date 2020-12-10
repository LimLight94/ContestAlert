import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("hihihi");

        String url = "http://www.detizen.com/contest/";
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Elements elements = doc.select("ul.basic-list.page-list");

        Iterator<Element> iter1 = elements.select("li").iterator();
        while (iter1.hasNext()){
            System.out.println(iter1.next().select("a").text());
        }

    }
}
