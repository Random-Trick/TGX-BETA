package p352z0;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import p016b1.C1132h;

public class C11216f {

    public static class C11217a {
        public final int f35925a;
        public final C11218b[] f35926b;

        @Deprecated
        public C11217a(int i, C11218b[] bVarArr) {
            this.f35925a = i;
            this.f35926b = bVarArr;
        }

        public static C11217a m1204a(int i, C11218b[] bVarArr) {
            return new C11217a(i, bVarArr);
        }

        public C11218b[] m1203b() {
            return this.f35926b;
        }

        public int m1202c() {
            return this.f35925a;
        }
    }

    public static class C11218b {
        public final Uri f35927a;
        public final int f35928b;
        public final int f35929c;
        public final boolean f35930d;
        public final int f35931e;

        @Deprecated
        public C11218b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f35927a = (Uri) C1132h.m38325e(uri);
            this.f35928b = i;
            this.f35929c = i2;
            this.f35930d = z;
            this.f35931e = i3;
        }

        public static C11218b m1201a(Uri uri, int i, int i2, boolean z, int i3) {
            return new C11218b(uri, i, i2, z, i3);
        }

        public int m1200b() {
            return this.f35931e;
        }

        public int m1199c() {
            return this.f35928b;
        }

        public Uri m1198d() {
            return this.f35927a;
        }

        public int m1197e() {
            return this.f35929c;
        }

        public boolean m1196f() {
            return this.f35930d;
        }
    }

    public static class C11219c {
        public void mo1195a(int i) {
            throw null;
        }

        public void mo1194b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface m1205a(Context context, C11209d dVar, int i, boolean z, int i2, Handler handler, C11219c cVar) {
        C11203a aVar = new C11203a(cVar, handler);
        if (z) {
            return C11210e.m1212e(context, dVar, aVar, i, i2);
        }
        return C11210e.m1213d(context, dVar, i, null, aVar);
    }
}
