package z8;

import java.util.logging.Level;
import java.util.logging.Logger;

public class d extends f {
    public Logger f27028a;

    public d(String str) {
        this.f27028a = Logger.getLogger(str);
    }

    @Override
    public void b(String str) {
        this.f27028a.log(Level.FINE, str);
    }

    @Override
    public void c(String str) {
        this.f27028a.log(Level.SEVERE, str);
    }

    @Override
    public void d(String str) {
        this.f27028a.log(Level.WARNING, str);
    }
}
