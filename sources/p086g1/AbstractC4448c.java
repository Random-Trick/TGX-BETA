package p086g1;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class AbstractC4448c extends AbstractC4443a {
    public int f14712R;
    public int f14713S;
    public LayoutInflater f14714T;

    @Deprecated
    public AbstractC4448c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f14713S = i;
        this.f14712R = i;
        this.f14714T = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override
    public View mo27644g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f14714T.inflate(this.f14713S, viewGroup, false);
    }

    @Override
    public View mo27643h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f14714T.inflate(this.f14712R, viewGroup, false);
    }
}
