package com.lamptt.languages;

import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import org.springframework.extensions.surf.mvc.LocaleResolver;
import org.springframework.extensions.surf.util.I18NUtil;

public class CustomLocaleResolver extends LocaleResolver {

public Locale resolveLocale(HttpServletRequest request) {
    //Locale locale = new Locale("ja", "JP");
    Locale locale = new Locale("vi", "VN");
    I18NUtil.setLocale(locale);

    return locale;
    }
}