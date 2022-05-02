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
    public boolean mo26325C(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override
    public int mo26323f(View view, int i) {
        return C2139ap.m35479W(mo26319z());
    }

    @Override
    public <T extends View & AbstractC5143t> void mo26322i(T t, Canvas canvas, AbstractC6264v vVar, AbstractC6264v vVar2, C6238b bVar) {
    }

    @Override
    public int mo26385l() {
        return this.f15849X;
    }

    @Override
    public int mo26321p() {
        return 0;
    }

    @Override
    public int mo26320q() {
        return 0;
    }

    @Override
    public int mo26319z() {
        return this.f15848W;
    }
}
