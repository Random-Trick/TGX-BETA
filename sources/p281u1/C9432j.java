package p281u1;

import java.io.File;
import p323x1.AbstractC10067c;

public class C9432j implements AbstractC10067c.AbstractC10071c {
    public final String f30552a;
    public final File f30553b;
    public final AbstractC10067c.AbstractC10071c f30554c;

    public C9432j(String str, File file, AbstractC10067c.AbstractC10071c cVar) {
        this.f30552a = str;
        this.f30553b = file;
        this.f30554c = cVar;
    }

    @Override
    public AbstractC10067c mo5377a(AbstractC10067c.C10069b bVar) {
        return new C9431i(bVar.f32737a, this.f30552a, this.f30553b, bVar.f32739c.f32736a, this.f30554c.mo5377a(bVar));
    }
}
