package p306w;

import p293v.C9809d;
import p336y.C10317x1;

public class C9931i {
    public final boolean f32312a;
    public boolean f32313b = false;

    public C9931i(C10317x1 x1Var) {
        boolean z = false;
        this.f32312a = x1Var.m5479b(C9809d.class) != null ? true : z;
    }

    public void m6470a() {
        this.f32313b = false;
    }

    public void m6469b() {
        this.f32313b = true;
    }

    public boolean m6468c(int i) {
        return this.f32313b && i == 0 && this.f32312a;
    }
}
