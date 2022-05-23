package p0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

public final class m {
    public final String f20384a;
    public final CharSequence f20385b;
    public final CharSequence[] f20386c;
    public final boolean f20387d;
    public final int f20388e;
    public final Bundle f20389f;
    public final Set<String> f20390g;

    public static final class a {
        public final String f20391a;
        public CharSequence f20394d;
        public CharSequence[] f20395e;
        public final Set<String> f20392b = new HashSet();
        public final Bundle f20393c = new Bundle();
        public boolean f20396f = true;
        public int f20397g = 0;

        public a(String str) {
            if (str != null) {
                this.f20391a = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        public m a() {
            return new m(this.f20391a, this.f20394d, this.f20395e, this.f20396f, this.f20397g, this.f20393c, this.f20392b);
        }

        public a b(CharSequence charSequence) {
            this.f20394d = charSequence;
            return this;
        }
    }

    public m(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set<String> set) {
        this.f20384a = str;
        this.f20385b = charSequence;
        this.f20386c = charSequenceArr;
        this.f20387d = z10;
        this.f20388e = i10;
        this.f20389f = bundle;
        this.f20390g = set;
        if (f() == 2 && !c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput a(m mVar) {
        Set<String> d10;
        RemoteInput.Builder addExtras = new RemoteInput.Builder(mVar.i()).setLabel(mVar.h()).setChoices(mVar.e()).setAllowFreeFormInput(mVar.c()).addExtras(mVar.g());
        if (Build.VERSION.SDK_INT >= 26 && (d10 = mVar.d()) != null) {
            for (String str : d10) {
                addExtras.setAllowDataType(str, true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            addExtras.setEditChoicesBeforeSending(mVar.f());
        }
        return addExtras.build();
    }

    public static RemoteInput[] b(m[] mVarArr) {
        if (mVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[mVarArr.length];
        for (int i10 = 0; i10 < mVarArr.length; i10++) {
            remoteInputArr[i10] = a(mVarArr[i10]);
        }
        return remoteInputArr;
    }

    public boolean c() {
        return this.f20387d;
    }

    public Set<String> d() {
        return this.f20390g;
    }

    public CharSequence[] e() {
        return this.f20386c;
    }

    public int f() {
        return this.f20388e;
    }

    public Bundle g() {
        return this.f20389f;
    }

    public CharSequence h() {
        return this.f20385b;
    }

    public String i() {
        return this.f20384a;
    }

    public boolean j() {
        return !c() && (e() == null || e().length == 0) && d() != null && !d().isEmpty();
    }
}
