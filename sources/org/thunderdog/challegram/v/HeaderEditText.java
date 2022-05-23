package org.thunderdog.challegram.v;

import ae.j;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import ce.o;
import ce.p0;
import gd.w;
import ib.d;
import org.thunderdog.challegram.R;
import ud.c2;
import ud.v4;

public class HeaderEditText extends EditTextBase implements ActionMode.Callback, c2 {
    public HeaderEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C();
    }

    public static HeaderEditText A(ViewGroup viewGroup) {
        HeaderEditText headerEditText = (HeaderEditText) p0.v(viewGroup.getContext(), R.layout.input_header_grey, viewGroup);
        headerEditText.setImeOptions(6);
        p0.U(headerEditText, R.drawable.cursor_grey);
        return headerEditText;
    }

    public static HeaderEditText B(ViewGroup viewGroup, boolean z10) {
        HeaderEditText headerEditText = (HeaderEditText) p0.v(viewGroup.getContext(), z10 ? R.layout.input_header_light : R.layout.input_header, viewGroup);
        headerEditText.setImeOptions(6);
        p0.U(headerEditText, R.drawable.cursor_white);
        return headerEditText;
    }

    public static HeaderEditText z(ViewGroup viewGroup, boolean z10, v4<?> v4Var) {
        HeaderEditText headerEditText = (HeaderEditText) p0.v(viewGroup.getContext(), z10 ? R.layout.input_header_light : R.layout.input_header, viewGroup);
        headerEditText.setTextColor(j.L(R.id.theme_color_headerText));
        headerEditText.setHintTextColor(d.a(j.f856a, j.L(R.id.theme_color_headerText)));
        headerEditText.s();
        if (v4Var != null) {
            v4Var.z8(headerEditText, R.id.theme_color_headerText);
            v4Var.s8(headerEditText, R.id.theme_color_headerText).e(j.f856a);
        }
        return headerEditText;
    }

    public final void C() {
        setTypeface(o.k());
        setInputType(106496);
        setHighlightColor(j.z());
        if (Build.VERSION.SDK_INT < 23) {
            setCustomSelectionActionModeCallback(this);
        }
    }

    @Override
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    @Override
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    @Override
    public void onDestroyActionMode(ActionMode actionMode) {
    }

    @Override
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    @Override
    public void s() {
        p0.l0(this, w.F1() | 16);
    }

    public HeaderEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C();
    }
}
