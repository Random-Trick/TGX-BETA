package p213p0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

public final class C7985m {
    public final String f26015a;
    public final CharSequence f26016b;
    public final CharSequence[] f26017c;
    public final boolean f26018d;
    public final int f26019e;
    public final Bundle f26020f;
    public final Set<String> f26021g;

    public static final class C7986a {
        public final String f26022a;
        public CharSequence f26025d;
        public CharSequence[] f26026e;
        public final Set<String> f26023b = new HashSet();
        public final Bundle f26024c = new Bundle();
        public boolean f26027f = true;
        public int f26028g = 0;

        public C7986a(String str) {
            if (str != null) {
                this.f26022a = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        public C7985m m13835a() {
            return new C7985m(this.f26022a, this.f26025d, this.f26026e, this.f26027f, this.f26028g, this.f26024c, this.f26023b);
        }

        public C7986a m13834b(CharSequence charSequence) {
            this.f26025d = charSequence;
            return this;
        }
    }

    public C7985m(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set<String> set) {
        this.f26015a = str;
        this.f26016b = charSequence;
        this.f26017c = charSequenceArr;
        this.f26018d = z;
        this.f26019e = i;
        this.f26020f = bundle;
        this.f26021g = set;
        if (m13840f() == 2 && !m13843c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput m13845a(C7985m mVar) {
        Set<String> d;
        RemoteInput.Builder addExtras = new RemoteInput.Builder(mVar.m13837i()).setLabel(mVar.m13838h()).setChoices(mVar.m13841e()).setAllowFreeFormInput(mVar.m13843c()).addExtras(mVar.m13839g());
        if (Build.VERSION.SDK_INT >= 26 && (d = mVar.m13842d()) != null) {
            for (String str : d) {
                addExtras.setAllowDataType(str, true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            addExtras.setEditChoicesBeforeSending(mVar.m13840f());
        }
        return addExtras.build();
    }

    public static RemoteInput[] m13844b(C7985m[] mVarArr) {
        if (mVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[mVarArr.length];
        for (int i = 0; i < mVarArr.length; i++) {
            remoteInputArr[i] = m13845a(mVarArr[i]);
        }
        return remoteInputArr;
    }

    public boolean m13843c() {
        return this.f26018d;
    }

    public Set<String> m13842d() {
        return this.f26021g;
    }

    public CharSequence[] m13841e() {
        return this.f26017c;
    }

    public int m13840f() {
        return this.f26019e;
    }

    public Bundle m13839g() {
        return this.f26020f;
    }

    public CharSequence m13838h() {
        return this.f26016b;
    }

    public String m13837i() {
        return this.f26015a;
    }

    public boolean m13836j() {
        return !m13843c() && (m13841e() == null || m13841e().length == 0) && m13842d() != null && !m13842d().isEmpty();
    }
}
