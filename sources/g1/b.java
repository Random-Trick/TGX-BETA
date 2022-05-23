package g1;

import android.database.Cursor;
import android.widget.Filter;

public class b extends Filter {
    public a f12021a;

    public interface a {
        void a(Cursor cursor);

        Cursor b();

        CharSequence c(Cursor cursor);

        Cursor d(CharSequence charSequence);
    }

    public b(a aVar) {
        this.f12021a = aVar;
    }

    @Override
    public CharSequence convertResultToString(Object obj) {
        return this.f12021a.c((Cursor) obj);
    }

    @Override
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d10 = this.f12021a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d10 != null) {
            filterResults.count = d10.getCount();
            filterResults.values = d10;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b10 = this.f12021a.b();
        Object obj = filterResults.values;
        if (obj != null && obj != b10) {
            this.f12021a.a((Cursor) obj);
        }
    }
}
