package u1;

import java.io.File;
import x1.c;

public class j implements c.AbstractC0241c {
    public final String f23526a;
    public final File f23527b;
    public final c.AbstractC0241c f23528c;

    public j(String str, File file, c.AbstractC0241c cVar) {
        this.f23526a = str;
        this.f23527b = file;
        this.f23528c = cVar;
    }

    @Override
    public c a(c.b bVar) {
        return new i(bVar.f25933a, this.f23526a, this.f23527b, bVar.f25935c.f25932a, this.f23528c.a(bVar));
    }
}
