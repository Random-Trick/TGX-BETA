package p086g1;

import android.database.Cursor;
import android.widget.Filter;

public class C4446b extends Filter {
    public AbstractC4447a f14711a;

    public interface AbstractC4447a {
        void mo27646a(Cursor cursor);

        Cursor mo27645b();

        CharSequence mo27644c(Cursor cursor);

        Cursor mo27643d(CharSequence charSequence);
    }

    public C4446b(AbstractC4447a aVar) {
        this.f14711a = aVar;
    }

    @Override
    public CharSequence convertResultToString(Object obj) {
        return this.f14711a.mo27644c((Cursor) obj);
    }

    @Override
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d = this.f14711a.mo27643d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d != null) {
            filterResults.count = d.getCount();
            filterResults.values = d;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b = this.f14711a.mo27645b();
        Object obj = filterResults.values;
        if (obj != null && obj != b) {
            this.f14711a.mo27646a((Cursor) obj);
        }
    }
}
