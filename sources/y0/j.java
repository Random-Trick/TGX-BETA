package y0;

import android.os.LocaleList;
import java.util.Locale;

public final class j implements i {
    public final LocaleList f26463a;

    public j(LocaleList localeList) {
        this.f26463a = localeList;
    }

    @Override
    public Object a() {
        return this.f26463a;
    }

    public boolean equals(Object obj) {
        return this.f26463a.equals(((i) obj).a());
    }

    @Override
    public Locale get(int i10) {
        return this.f26463a.get(i10);
    }

    public int hashCode() {
        return this.f26463a.hashCode();
    }

    @Override
    public int size() {
        return this.f26463a.size();
    }

    public String toString() {
        return this.f26463a.toString();
    }
}
