package org.antran.thymeleaf;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

/**
 * Created by atran on 10/20/14.
 */
public class TemplateEngineHelper
{
    static TemplateEngine templateEngine;

    public static TemplateEngine getEngine()
    {
        if (templateEngine == null)
        {
            templateEngine = new TemplateEngine();
            final ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
            templateResolver.setTemplateMode("HTML5");
            templateResolver.setCharacterEncoding("UTF-8");
            templateEngine.setTemplateResolver(templateResolver);
        }
        return templateEngine;
    }
}
