package org.antran.thymeleaf;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

/**
 * Created by atran on 10/20/14.
 */
public class TemplateEngineHelper
{
    private static final TemplateEngine templateEngine = new TemplateEngine();

    {
        final ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setTemplateMode("HTML5");
        templateResolver.setCharacterEncoding("UTF-8");
        templateEngine.setTemplateResolver(templateResolver);
    }

    public static TemplateEngine getEngine()
    {
        return templateEngine;
    }
}
