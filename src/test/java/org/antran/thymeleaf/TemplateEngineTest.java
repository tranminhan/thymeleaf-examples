package org.antran.thymeleaf;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class TemplateEngineTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void shouldProcessTemplateWithoutException() {
        Context contex = new Context();
        TemplateEngine templateEngine = new TemplateEngine();

        final ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setTemplateMode("HTML5");
        templateResolver.setCharacterEncoding("UTF-8");
        templateEngine.setTemplateResolver(templateResolver);

        final String result = templateEngine.process("home.html", contex);
        logger.info("result: " + result);
    }

}
