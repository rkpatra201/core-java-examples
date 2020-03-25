import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(String.class.getName());
        Configuration cfg = new Configuration();
        cfg.setClassForTemplateLoading(App.class, "/");
        try {
            //Load template from source folder
            Template template = cfg.getTemplate("test.ftl", Locale.ENGLISH);

            Employee e = new Employee();
            e.setId(100);
            // Build the data-model
            Map<String, Object> data = new HashMap<String, Object>();
            data.put("message", "Hello World!");
            data.put("type", DataType.STRING);

            //List parsing
            List<String> countries = new ArrayList<String>();
            countries.add("India");
            countries.add("United States");
            countries.add("Germany");
            countries.add("France");

            data.put("countries", countries);


            // Console output
            Writer out = new OutputStreamWriter(System.out);
            template.process(data, out);
            out.flush();

            // File output
            Writer file = new FileWriter(new File("result.txt"));
            template.process(data, file);
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
}
