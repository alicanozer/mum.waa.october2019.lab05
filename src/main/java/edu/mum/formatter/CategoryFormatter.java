package edu.mum.formatter;

import edu.mum.domain.Category;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class CategoryFormatter implements Formatter<Category> {
    @Override
    public Category parse(String s, Locale locale) throws ParseException {
        return null;
    }

    @Override
    public String print(Category category, Locale locale) {
        return category.getId()+": "+category.getName();
    }
}
