package org.thunderdog.challegram.p211v;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import be.C1389o;
import be.C1399s0;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p108hb.C5064d;
import p364zd.C11524j;
import td.AbstractC9165c2;
import td.AbstractC9323v4;

public class HeaderEditText extends EditTextBase implements ActionMode.Callback, AbstractC9165c2 {
    public HeaderEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m14152C();
    }

    public static HeaderEditText m14154A(ViewGroup viewGroup) {
        HeaderEditText headerEditText = (HeaderEditText) C1399s0.m37146y(viewGroup.getContext(), R.layout.input_header_grey, viewGroup);
        headerEditText.setImeOptions(6);
        C1399s0.m37191b0(headerEditText, R.drawable.cursor_grey);
        return headerEditText;
    }

    public static HeaderEditText m14153B(ViewGroup viewGroup, boolean z) {
        HeaderEditText headerEditText = (HeaderEditText) C1399s0.m37146y(viewGroup.getContext(), z ? R.layout.input_header_light : R.layout.input_header, viewGroup);
        headerEditText.setImeOptions(6);
        C1399s0.m37191b0(headerEditText, R.drawable.cursor_white);
        return headerEditText;
    }

    public static HeaderEditText m14151z(ViewGroup viewGroup, boolean z, AbstractC9323v4<?> v4Var) {
        HeaderEditText headerEditText = (HeaderEditText) C1399s0.m37146y(viewGroup.getContext(), z ? R.layout.input_header_light : R.layout.input_header, viewGroup);
        headerEditText.setTextColor(C11524j.m228N(R.id.theme_color_headerText));
        headerEditText.setHintTextColor(C5064d.m24131a(C11524j.f36589a, C11524j.m228N(R.id.theme_color_headerText)));
        headerEditText.mo8255s();
        if (v4Var != null) {
            v4Var.m9119z8(headerEditText, R.id.theme_color_headerText);
            v4Var.m9170s8(headerEditText, R.id.theme_color_headerText).m85e(C11524j.f36589a);
        }
        return headerEditText;
    }

    public final void m14152C() {
        setTypeface(C1389o.m37258k());
        setInputType(106496);
        setHighlightColor(C11524j.m252B());
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
    public void mo8255s() {
        C1399s0.m37157s0(this, C4403w.m27989F1() | 16);
    }

    public HeaderEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m14152C();
    }
}
