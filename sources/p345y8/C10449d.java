package p345y8;

import java.util.logging.Level;
import java.util.logging.Logger;

public class C10449d extends AbstractC10452f {
    public Logger f33520a;

    public C10449d(String str) {
        this.f33520a = Logger.getLogger(str);
    }

    @Override
    public void mo5098b(String str) {
        this.f33520a.log(Level.FINE, str);
    }

    @Override
    public void mo5097c(String str) {
        this.f33520a.log(Level.SEVERE, str);
    }

    @Override
    public void mo5096d(String str) {
        this.f33520a.log(Level.WARNING, str);
    }
}
