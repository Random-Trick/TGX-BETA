package p;

import android.os.Bundle;

public final class a {
    public final Integer f20219a;
    public final Integer f20220b;
    public final Integer f20221c;
    public final Integer f20222d;

    public static final class C0174a {
        public Integer f20223a;
        public Integer f20224b;
        public Integer f20225c;
        public Integer f20226d;

        public a a() {
            return new a(this.f20223a, this.f20224b, this.f20225c, this.f20226d);
        }

        public C0174a b(int i10) {
            this.f20224b = Integer.valueOf(i10);
            return this;
        }

        public C0174a c(int i10) {
            this.f20223a = Integer.valueOf(i10 | (-16777216));
            return this;
        }
    }

    public a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f20219a = num;
        this.f20220b = num2;
        this.f20221c = num3;
        this.f20222d = num4;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f20219a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f20220b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f20221c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f20222d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
