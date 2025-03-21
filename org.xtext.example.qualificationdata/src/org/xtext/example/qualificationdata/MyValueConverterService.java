package org.xtext.example.qualificationdata;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;
import org.eclipse.xtext.conversion.impl.STRINGValueConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.conversion.IValueConverter;

public class MyValueConverterService extends AbstractDeclarativeValueConverterService {
    
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public IValueConverter<Date> EDate() {
        return new IValueConverter<Date>() {
            @Override
            public Date toValue(String string, INode node) throws ValueConverterException {
                try {
                    return dateFormat.parse(string);
                } catch (ParseException e) {
                    throw new ValueConverterException("Invalid date format. Expected format: yyyy-MM-dd", node, e);
                }
            }

            @Override
            public String toString(Date value) {
                return dateFormat.format(value);
            }
        };
    }
}
