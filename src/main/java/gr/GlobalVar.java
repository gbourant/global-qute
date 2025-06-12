package gr;

import io.quarkus.qute.TemplateGlobal;

import java.time.Year;

@TemplateGlobal
public class GlobalVar {
    public static final int YEAR = Year.now().getValue();
}
