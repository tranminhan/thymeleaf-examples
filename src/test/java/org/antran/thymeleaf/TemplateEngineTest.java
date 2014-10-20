package org.antran.thymeleaf;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

public class TemplateEngineTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void shouldProcessTemplateWithoutException()
    {
        final Context contex = new Context();
        final TemplateEngine templateEngine = TemplateEngineHelper.getEngine();
        final String result = templateEngine.process("home.html", contex);
        logger.info("result: " + result);
    }

    @Test
    public void shouldProcessTemplateWithVars()
    {
        final Context context = new Context();
        context.setVariable("var_1", "a string from a variable");
        final TemplateEngine templateEngine = TemplateEngineHelper.getEngine();
        final String result = templateEngine.process("page_with_vars.html", context);
        logger.info("result: " + result);
    }
}