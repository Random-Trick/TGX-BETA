package ne;

import ae.j;
import android.content.Context;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import ce.j0;
import ce.p0;
import gd.w;
import ie.o;
import org.thunderdog.challegram.R;

public class l2 extends t0 implements InputFilter, View.OnLongClickListener {
    public int M;
    public boolean N;
    public boolean O = true;
    public String f18180c;

    public class a implements ActionMode.Callback {
        public a() {
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
    }

    public l2(Context context) {
        super(context);
        setInputType(524289);
        setFilters(new InputFilter[]{this});
        setCustomSelectionActionModeCallback(new a());
    }

    @Override
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.N) {
            return null;
        }
        if (!this.O) {
            if (charSequence.length() >= 1) {
                return "";
            }
        } else if (this.f18180c == null || i12 >= this.M) {
            return null;
        }
        return spanned.subSequence(i12, i13);
    }

    public String getSuffix() {
        String obj = getText().toString();
        int length = obj.length();
        int i10 = this.M;
        return length <= i10 ? "" : obj.substring(i10);
    }

    @Override
    public boolean onLongClick(View view) {
        j0.i(getText().toString(), R.string.CopiedLink);
        return true;
    }

    @Override
    public void onSelectionChanged(int i10, int i11) {
        if (this.O && i10 < this.M) {
            int length = getText().length();
            int i12 = this.M;
            if (length >= i12) {
                p0.f0(this, i12);
                return;
            }
        }
        super.onSelectionChanged(i10, i11);
    }

    public void setEditable(boolean z10) {
        if (this.O != z10) {
            this.O = z10;
            setClickable(z10);
            setFocusable(z10);
            setFocusableInTouchMode(z10);
            setOnLongClickListener(z10 ? null : this);
        }
    }

    public void setPrefix(int i10) {
        setPrefix(w.i1(i10));
    }

    public void setSuffix(String str) {
        SpannableString spannableString = new SpannableString(this.f18180c + str);
        if (this.f18180c.length() > 0) {
            spannableString.setSpan(new ForegroundColorSpan(j.U0()), 0, this.f18180c.length(), 33);
        }
        z(spannableString);
        p0.f0(this, spannableString.length());
    }

    public void z(Spannable spannable) {
        this.N = true;
        setText(spannable, TextView.BufferType.SPANNABLE);
        this.N = false;
    }

    public void setPrefix(String str) {
        this.f18180c = str;
        SpannableString spannableString = new SpannableString(str);
        if (str.length() > 0) {
            spannableString.setSpan(new o(null, R.id.theme_color_textPlaceholder), 0, str.length(), 33);
        }
        this.M = spannableString.length();
        z(spannableString);
        p0.f0(this, this.M);
    }
}
