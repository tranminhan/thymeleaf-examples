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
        final Context context = new Context();
        final TemplateEngine templateEngine = TemplateEngineHelper.getEngine();
        final String result = templateEngine.process("home.html", context);
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

    @Test
    public void shouldProcessTemplateWithLinkVars()
    {
        final Context context = new Context();
        context.setVariable("HOST", "http://HOST.COM/");
        context.setVariable("var_1", "a string from a variable");

        final TemplateEngine templateEngine = TemplateEngineHelper.getEngine();
        final String result = templateEngine.process("page_with_links.html", context);
        logger.info("result: " + result);
    }

    @Test
    public void shouldProcessTemplateWithStyle()
    {
        final Context context = new Context();
        context.setVariable("appURL", "http://HOST.COM/");

        final TemplateEngine templateEngine = TemplateEngineHelper.getEngine();
        final String result = templateEngine.process("page_with_style_tags.html", context);
        logger.info("result: " + result);
    }

    @Test
    public void shouldProcessTemplateWithStyleHead()
    {
        final Context context = new Context();
        context.setVariable("appURL", "http://HOST.COM/");

        final TemplateEngine templateEngine = TemplateEngineHelper.getEngine();
        final String result = templateEngine.process("page_with_style_head.html", context);
        logger.info("result: " + result);
    }
}