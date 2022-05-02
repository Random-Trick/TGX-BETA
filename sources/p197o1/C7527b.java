package p197o1;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC0846g;
import androidx.lifecycle.AbstractC0856o;
import androidx.lifecycle.AbstractC0863s;
import androidx.lifecycle.C0855n;
import androidx.lifecycle.C0864t;
import androidx.lifecycle.C0868u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p016b1.C1126b;
import p143k0.C6038h;
import p214p1.C7990a;

public class C7527b extends AbstractC7526a {
    public static boolean f24100c = false;
    public final AbstractC0846g f24101a;
    public final C7529b f24102b;

    public static class C7528a<D> extends C0855n<D> {
        public final int f24103l;
        public final Bundle f24104m;
        public final C7990a<D> f24105n;
        public AbstractC0846g f24106o;

        @Override
        public void mo15733i() {
            if (C7527b.f24100c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        @Override
        public void mo15732j() {
            if (C7527b.f24100c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        @Override
        public void mo15731l(AbstractC0856o<? super D> oVar) {
            super.mo15731l(oVar);
            this.f24106o = null;
        }

        @Override
        public void mo15730m(D d) {
            super.mo15730m(d);
        }

        public C7990a<D> m15729n(boolean z) {
            if (C7527b.f24100c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        public void m15728o(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f24103l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f24104m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f24105n);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            throw null;
        }

        public void m15727p() {
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f24103l);
            sb2.append(" : ");
            C1126b.m38338a(this.f24105n, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    public static class C7529b extends AbstractC0863s {
        public static final C0864t.AbstractC0865a f24107e = new C7530a();
        public C6038h<C7528a> f24108c = new C6038h<>();
        public boolean f24109d = false;

        public static class C7530a implements C0864t.AbstractC0865a {
            @Override
            public <T extends AbstractC0863s> T mo15722a(Class<T> cls) {
                return new C7529b();
            }
        }

        public static C7529b m15724f(C0868u uVar) {
            return (C7529b) new C0864t(uVar, f24107e).m39618a(C7529b.class);
        }

        @Override
        public void mo15726d() {
            super.mo15726d();
            int n = this.f24108c.m21464n();
            for (int i = 0; i < n; i++) {
                this.f24108c.m21463o(i).m15729n(true);
            }
            this.f24108c.m21475b();
        }

        public void m15725e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f24108c.m21464n() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f24108c.m21464n(); i++) {
                    C7528a o = this.f24108c.m21463o(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f24108c.m21468i(i));
                    printWriter.print(": ");
                    printWriter.println(o.toString());
                    o.m15728o(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        public void m15723g() {
            int n = this.f24108c.m21464n();
            for (int i = 0; i < n; i++) {
                this.f24108c.m21463o(i).m15727p();
            }
        }
    }

    public C7527b(AbstractC0846g gVar, C0868u uVar) {
        this.f24101a = gVar;
        this.f24102b = C7529b.m15724f(uVar);
    }

    @Override
    @Deprecated
    public void mo15735a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f24102b.m15725e(str, fileDescriptor, printWriter, strArr);
    }

    @Override
    public void mo15734c() {
        this.f24102b.m15723g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((int) org.thunderdog.challegram.Log.TAG_YOUTUBE);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        C1126b.m38338a(this.f24101a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
