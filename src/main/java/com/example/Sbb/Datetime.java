package com.example.Sbb;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Datetime {
    String string = "January 2, 2010";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
    LocalDate date = LocalDate.parse(string, formatter);
;
}
