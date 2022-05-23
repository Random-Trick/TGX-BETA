package g;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import g.b;

@SuppressLint({"RestrictedAPI"})
public class d extends b {
    public a W;
    public boolean X;

    public static class a extends b.c {
        public int[][] J;

        public a(a aVar, d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[f()];
            }
        }

        public int A(int[] iArr) {
            int[][] iArr2 = this.J;
            int h10 = h();
            for (int i10 = 0; i10 < h10; i10++) {
                if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override
        public Drawable newDrawable() {
            return new d(this, null);
        }

        @Override
        public void o(int i10, int i11) {
            super.o(i10, i11);
            int[][] iArr = new int[i11];
            System.arraycopy(this.J, 0, iArr, 0, i10);
            this.J = iArr;
        }

        @Override
        public void r() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.J = iArr2;
        }

        public int z(int[] iArr, Drawable drawable) {
            int a10 = a(drawable);
            this.J[a10] = iArr;
            return a10;
        }

        @Override
        public Drawable newDrawable(Resources resources) {
            return new d(this, resources);
        }
    }

    public d(a aVar, Resources resources) {
        h(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override
    public void h(b.c cVar) {
        super.h(cVar);
        if (cVar instanceof a) {
            this.W = (a) cVar;
        }
    }

    @Override
    public boolean isStateful() {
        return true;
    }

    public a b() {
        return new a(this.W, this, null);
    }

    public int[] k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i10 = 0;
        for (int i11 = 0; i11 < attributeCount; i11++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i11);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                i10++;
                if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i10] = attributeNameResource;
            }
        }
        return StateSet.trimStateSet(iArr, i10);
    }

    @Override
    public Drawable mutate() {
        if (!this.X && super.mutate() == this) {
            this.W.r();
            this.X = true;
        }
        return this;
    }

    @Override
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A = this.W.A(iArr);
        if (A < 0) {
            A = this.W.A(StateSet.WILD_CARD);
        }
        return g(A) || onStateChange;
    }

    public d(a aVar) {
        if (aVar != null) {
            h(aVar);
        }
    }
}
