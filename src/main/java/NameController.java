import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class NameController {
    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");

        Name name = new Name();

        get("/:num", (req, res) -> {
            int index = Integer.parseInt(req.params(":num"));
            HashMap<String, Object> model = new HashMap<>();
            model.put("name", name);
            model.put("num", index);
            model.put("template", "names1.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

//        get("/1", (req, res) -> {
//            HashMap<String, Object> model = new HashMap<>();
//            model.put("name", name);
//            model.put("template", "names1.vtl");
//            return new ModelAndView(model, "layout.vtl");
//        }, velocityTemplateEngine);
//
//        get("/2", (req, res) -> {
//            HashMap<String, Object> model = new HashMap<>();
//            model.put("name", name);
//            model.put("template", "names2.vtl");
//            return new ModelAndView(model, "layout.vtl");
//        }, velocityTemplateEngine);
    }
}
