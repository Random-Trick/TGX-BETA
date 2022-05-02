package p212p;

import android.os.Bundle;

public final class C7937a {
    public final Integer f25817a;
    public final Integer f25818b;
    public final Integer f25819c;
    public final Integer f25820d;

    public static final class C7938a {
        public Integer f25821a;
        public Integer f25822b;
        public Integer f25823c;
        public Integer f25824d;

        public C7937a m14038a() {
            return new C7937a(this.f25821a, this.f25822b, this.f25823c, this.f25824d);
        }

        public C7938a m14037b(int i) {
            this.f25822b = Integer.valueOf(i);
            return this;
        }

        public C7938a m14036c(int i) {
            this.f25821a = Integer.valueOf(i | (-16777216));
            return this;
        }
    }

    public C7937a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f25817a = num;
        this.f25818b = num2;
        this.f25819c = num3;
        this.f25820d = num4;
    }

    public Bundle m14039a() {
        Bundle bundle = new Bundle();
        Integer num = this.f25817a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f25818b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f25819c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f25820d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
