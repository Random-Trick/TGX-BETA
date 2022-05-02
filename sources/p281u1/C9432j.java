package p281u1;

import java.io.File;
import p323x1.AbstractC10067c;

public class C9432j implements AbstractC10067c.AbstractC10071c {
    public final String f30549a;
    public final File f30550b;
    public final AbstractC10067c.AbstractC10071c f30551c;

    public C9432j(String str, File file, AbstractC10067c.AbstractC10071c cVar) {
        this.f30549a = str;
        this.f30550b = file;
        this.f30551c = cVar;
    }

    @Override
    public AbstractC10067c mo5377a(AbstractC10067c.C10069b bVar) {
        return new C9431i(bVar.f32734a, this.f30549a, this.f30550b, bVar.f32736c.f32733a, this.f30551c.mo5377a(bVar));
    }
}
