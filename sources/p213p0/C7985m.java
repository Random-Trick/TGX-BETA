package p213p0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

public final class C7985m {
    public final String f26018a;
    public final CharSequence f26019b;
    public final CharSequence[] f26020c;
    public final boolean f26021d;
    public final int f26022e;
    public final Bundle f26023f;
    public final Set<String> f26024g;

    public static final class C7986a {
        public final String f26025a;
        public CharSequence f26028d;
        public CharSequence[] f26029e;
        public final Set<String> f26026b = new HashSet();
        public final Bundle f26027c = new Bundle();
        public boolean f26030f = true;
        public int f26031g = 0;

        public C7986a(String str) {
            if (str != null) {
                this.f26025a = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        public C7985m m13834a() {
            return new C7985m(this.f26025a, this.f26028d, this.f26029e, this.f26030f, this.f26031g, this.f26027c, this.f26026b);
        }

        public C7986a m13833b(CharSequence charSequence) {
            this.f26028d = charSequence;
            return this;
        }
    }

    public C7985m(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set<String> set) {
        this.f26018a = str;
        this.f26019b = charSequence;
        this.f26020c = charSequenceArr;
        this.f26021d = z;
        this.f26022e = i;
        this.f26023f = bundle;
        this.f26024g = set;
        if (m13839f() == 2 && !m13842c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput m13844a(C7985m mVar) {
        Set<String> d;
        RemoteInput.Builder addExtras = new RemoteInput.Builder(mVar.m13836i()).setLabel(mVar.m13837h()).setChoices(mVar.m13840e()).setAllowFreeFormInput(mVar.m13842c()).addExtras(mVar.m13838g());
        if (Build.VERSION.SDK_INT >= 26 && (d = mVar.m13841d()) != null) {
            for (String str : d) {
                addExtras.setAllowDataType(str, true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            addExtras.setEditChoicesBeforeSending(mVar.m13839f());
        }
        return addExtras.build();
    }

    public static RemoteInput[] m13843b(C7985m[] mVarArr) {
        if (mVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[mVarArr.length];
        for (int i = 0; i < mVarArr.length; i++) {
            remoteInputArr[i] = m13844a(mVarArr[i]);
        }
        return remoteInputArr;
    }

    public boolean m13842c() {
        return this.f26021d;
    }

    public Set<String> m13841d() {
        return this.f26024g;
    }

    public CharSequence[] m13840e() {
        return this.f26020c;
    }

    public int m13839f() {
        return this.f26022e;
    }

    public Bundle m13838g() {
        return this.f26023f;
    }

    public CharSequence m13837h() {
        return this.f26019b;
    }

    public String m13836i() {
        return this.f26018a;
    }

    public boolean m13835j() {
        return !m13842c() && (m13840e() == null || m13840e().length == 0) && m13841d() != null && !m13841d().isEmpty();
    }
}
