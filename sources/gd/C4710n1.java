package gd;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import p038ce.C2139ap;
import p111he.AbstractC5143t;
import p156kd.AbstractC6264v;
import p156kd.C6238b;
import td.AbstractC9323v4;

public class C4710n1 extends AbstractC4576a1 {
    public final int f15848W;
    public final int f15849X;

    public C4710n1(AbstractC9323v4<?> v4Var, int i, int i2) {
        super(v4Var, null);
        this.f15848W = i;
        this.f15849X = i2;
    }

    @Override
    public boolean mo26326C(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override
    public int mo26324f(View view, int i) {
        return C2139ap.m35482W(mo26320z());
    }

    @Override
    public <T extends View & AbstractC5143t> void mo26323i(T t, Canvas canvas, AbstractC6264v vVar, AbstractC6264v vVar2, C6238b bVar) {
    }

    @Override
    public int mo26386l() {
        return this.f15849X;
    }

    @Override
    public int mo26322p() {
        return 0;
    }

    @Override
    public int mo26321q() {
        return 0;
    }

    @Override
    public int mo26320z() {
        return this.f15848W;
    }
}
