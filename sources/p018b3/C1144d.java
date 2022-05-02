package p018b3;

import android.content.Context;
import ga.AbstractC4533a;
import java.util.concurrent.Executor;
import p018b3.AbstractC1166s;
import p030c3.C1545j;
import p030c3.C1548l;
import p043d3.AbstractC3589b;
import p043d3.C3588a;
import p043d3.C3590c;
import p043d3.C3591d;
import p088g3.C4465c;
import p088g3.C4466d;
import p088g3.C4469g;
import p088g3.C4471i;
import p100h3.AbstractC4934g;
import p100h3.AbstractC4950s;
import p100h3.C4944m;
import p100h3.C4945n;
import p100h3.C4948q;
import p100h3.C4949r;
import p116i3.AbstractC5179c;
import p116i3.C5174b0;
import p116i3.C5180c0;
import p116i3.C5186f;
import p116i3.C5189g;
import p116i3.C5192h;
import p116i3.C5197i0;
import p146k3.C6047c;
import p146k3.C6049d;

public final class C1144d extends AbstractC1166s {
    public AbstractC4533a f4365M;
    public AbstractC4533a f4366N;
    public AbstractC4533a<C5174b0> f4367O;
    public AbstractC4533a<AbstractC4934g> f4368P;
    public AbstractC4533a<AbstractC4950s> f4369Q;
    public AbstractC4533a<C4465c> f4370R;
    public AbstractC4533a<C4944m> f4371S;
    public AbstractC4533a<C4948q> f4372T;
    public AbstractC4533a<C1165r> f4373U;
    public AbstractC4533a<Executor> f4374a;
    public AbstractC4533a<Context> f4375b;
    public AbstractC4533a f4376c;

    public static final class C1146b implements AbstractC1166s.AbstractC1167a {
        public Context f4377a;

        public C1146b() {
        }

        @Override
        public AbstractC1166s mo38243a() {
            C3591d.m29917a(this.f4377a, Context.class);
            return new C1144d(this.f4377a);
        }

        public C1146b mo38242b(Context context) {
            this.f4377a = (Context) C3591d.m29916b(context);
            return this;
        }
    }

    public static AbstractC1166s.AbstractC1167a m38310y0() {
        return new C1146b();
    }

    @Override
    public AbstractC5179c mo38245m() {
        return this.f4367O.get();
    }

    @Override
    public C1165r mo38244t() {
        return this.f4373U.get();
    }

    public final void m38309z0(Context context) {
        this.f4374a = C3588a.m29920a(C1153j.m38281a());
        AbstractC3589b a = C3590c.m29918a(context);
        this.f4375b = a;
        C1545j a2 = C1545j.m36494a(a, C6047c.m21450a(), C6049d.m21446a());
        this.f4376c = a2;
        this.f4365M = C3588a.m29920a(C1548l.m36486a(this.f4375b, a2));
        this.f4366N = C5197i0.m23621a(this.f4375b, C5186f.m23649a(), C5189g.m23645a());
        this.f4367O = C3588a.m29920a(C5180c0.m23667a(C6047c.m21450a(), C6049d.m21446a(), C5192h.m23641a(), this.f4366N));
        C4469g b = C4469g.m27551b(C6047c.m21450a());
        this.f4368P = b;
        C4471i a3 = C4471i.m27548a(this.f4375b, this.f4367O, b, C6049d.m21446a());
        this.f4369Q = a3;
        AbstractC4533a<Executor> aVar = this.f4374a;
        AbstractC4533a aVar2 = this.f4365M;
        AbstractC4533a<C5174b0> aVar3 = this.f4367O;
        this.f4370R = C4466d.m27557a(aVar, aVar2, a3, aVar3, aVar3);
        AbstractC4533a<Context> aVar4 = this.f4375b;
        AbstractC4533a aVar5 = this.f4365M;
        AbstractC4533a<C5174b0> aVar6 = this.f4367O;
        this.f4371S = C4945n.m24403a(aVar4, aVar5, aVar6, this.f4369Q, this.f4374a, aVar6, C6047c.m21450a());
        AbstractC4533a<Executor> aVar7 = this.f4374a;
        AbstractC4533a<C5174b0> aVar8 = this.f4367O;
        this.f4372T = C4949r.m24395a(aVar7, aVar8, this.f4369Q, aVar8);
        this.f4373U = C3588a.m29920a(C1168t.m38241a(C6047c.m21450a(), C6049d.m21446a(), this.f4370R, this.f4371S, this.f4372T));
    }

    public C1144d(Context context) {
        m38309z0(context);
    }
}
