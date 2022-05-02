package p084g;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p084g.C4432b;

@SuppressLint({"RestrictedAPI"})
public class C4437d extends C4432b {
    public C4438a f14693W;
    public boolean f14694X;

    public static class C4438a extends C4432b.AbstractC4435c {
        public int[][] f14695J;

        public C4438a(C4438a aVar, C4437d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.f14695J = aVar.f14695J;
            } else {
                this.f14695J = new int[m27697f()];
            }
        }

        public int m27673A(int[] iArr) {
            int[][] iArr2 = this.f14695J;
            int h = m27695h();
            for (int i = 0; i < h; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        @Override
        public Drawable newDrawable() {
            return new C4437d(this, null);
        }

        @Override
        public void mo27672o(int i, int i2) {
            super.mo27672o(i, i2);
            int[][] iArr = new int[i2];
            System.arraycopy(this.f14695J, 0, iArr, 0, i);
            this.f14695J = iArr;
        }

        @Override
        public void mo27671r() {
            int[][] iArr = this.f14695J;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f14695J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f14695J = iArr2;
        }

        public int m27670z(int[] iArr, Drawable drawable) {
            int a = m27702a(drawable);
            this.f14695J[a] = iArr;
            return a;
        }

        @Override
        public Drawable newDrawable(Resources resources) {
            return new C4437d(this, resources);
        }
    }

    public C4437d(C4438a aVar, Resources resources) {
        mo27676h(new C4438a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override
    public void mo27676h(C4432b.AbstractC4435c cVar) {
        super.mo27676h(cVar);
        if (cVar instanceof C4438a) {
            this.f14693W = (C4438a) cVar;
        }
    }

    @Override
    public boolean isStateful() {
        return true;
    }

    public C4438a mo27677b() {
        return new C4438a(this.f14693W, this, null);
    }

    public int[] m27674k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                i++;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    @Override
    public Drawable mutate() {
        if (!this.f14694X && super.mutate() == this) {
            this.f14693W.mo27671r();
            this.f14694X = true;
        }
        return this;
    }

    @Override
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A = this.f14693W.m27673A(iArr);
        if (A < 0) {
            A = this.f14693W.m27673A(StateSet.WILD_CARD);
        }
        return m27706g(A) || onStateChange;
    }

    public C4437d(C4438a aVar) {
        if (aVar != null) {
            mo27676h(aVar);
        }
    }
}
