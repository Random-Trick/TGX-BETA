package g1;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class c extends a {
    public int R;
    public int S;
    public LayoutInflater T;

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.S = i10;
        this.R = i10;
        this.T = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.T.inflate(this.S, viewGroup, false);
    }

    @Override
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.T.inflate(this.R, viewGroup, false);
    }
}
