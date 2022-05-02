package org.thunderdog.challegram.p211v;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.GridLayoutManager;
import java.util.ArrayList;

public class NewFlowLayoutManager extends GridLayoutManager {
    public ArrayList<ArrayList<Integer>> f25760S;
    public int f25762U;
    public int f25763V;
    public SparseIntArray f25759R = new SparseIntArray();
    public SparseIntArray f25761T = new SparseIntArray();

    public static class C7927a {
        public float f25764a;
        public float f25765b;

        public C7927a() {
        }

        public C7927a(float f, float f2) {
            this.f25764a = f;
            this.f25765b = f2;
        }
    }

    public NewFlowLayoutManager(Context context, int i) {
        super(context, i);
    }

    @Override
    public boolean mo14136J1() {
        return false;
    }

    public final void m14135g3() {
        if (this.f25759R.size() != m14134h3() || this.f25762U != m39187p0()) {
            this.f25762U = m39187p0();
            m14127p3(m39187p0());
        }
    }

    public int m14134h3() {
        return m39226Y() - this.f25763V;
    }

    public final ArrayList<ArrayList<Integer>> m14133i3(int[] iArr, int i) {
        int length = iArr.length;
        if (i <= 0) {
            return new ArrayList<>();
        }
        if (i >= length || length == 1) {
            ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>(iArr.length);
            for (int i2 : iArr) {
                ArrayList<Integer> arrayList2 = new ArrayList<>(1);
                arrayList2.add(Integer.valueOf(i2));
                arrayList.add(arrayList2);
            }
            return arrayList;
        }
        int[] j3 = m14132j3(iArr, i);
        int i3 = i - 1;
        int i4 = length - 1;
        ArrayList<ArrayList<Integer>> arrayList3 = new ArrayList<>();
        for (int i5 = i - 2; i5 >= 0; i5--) {
            if (i4 < 1) {
                arrayList3.add(0, new ArrayList<>());
            } else {
                ArrayList<Integer> arrayList4 = new ArrayList<>();
                int i6 = ((i4 - 1) * i3) + i5;
                int i7 = i4 + 1;
                for (int i8 = j3[i6] + 1; i8 < i7; i8++) {
                    arrayList4.add(Integer.valueOf(iArr[i8]));
                }
                arrayList3.add(0, arrayList4);
                i4 = j3[i6];
            }
        }
        ArrayList<Integer> arrayList5 = new ArrayList<>();
        int i9 = i4 + 1;
        for (int i10 = 0; i10 < i9; i10++) {
            arrayList5.add(Integer.valueOf(iArr[i10]));
        }
        arrayList3.add(0, arrayList5);
        return arrayList3;
    }

    public final int[] m14132j3(int[] iArr, int i) {
        int length = iArr.length;
        int[] iArr2 = new int[length * i];
        int i2 = i - 1;
        int[] iArr3 = new int[(length - 1) * i2];
        int i3 = 0;
        while (i3 < length) {
            iArr2[i3 * i] = iArr[i3] + (i3 != 0 ? iArr2[(i3 - 1) * i] : 0);
            i3++;
        }
        for (int i4 = 0; i4 < i; i4++) {
            iArr2[i4] = iArr[0];
        }
        for (int i5 = 1; i5 < length; i5++) {
            for (int i6 = 1; i6 < i; i6++) {
                int i7 = Integer.MAX_VALUE;
                int i8 = 0;
                for (int i9 = 0; i9 < i5; i9++) {
                    int i10 = i9 * i;
                    int max = Math.max(iArr2[(i6 - 1) + i10], iArr2[i5 * i] - iArr2[i10]);
                    if (i9 == 0 || max < i8) {
                        i7 = i9;
                        i8 = max;
                    }
                }
                iArr2[(i5 * i) + i6] = i8;
                iArr3[((i5 - 1) * i2) + (i6 - 1)] = i7;
            }
        }
        return iArr3;
    }

    public int m14131k3(int i) {
        if (this.f25760S == null) {
            m14127p3(i);
        }
        int i2 = this.f25763V;
        ArrayList<ArrayList<Integer>> arrayList = this.f25760S;
        return i2 + (arrayList != null ? arrayList.size() : 0);
    }

    public C7927a mo7529l3(int i) {
        return new C7927a(100.0f, 100.0f);
    }

    public int m14130m3(int i) {
        m14135g3();
        int i2 = this.f25763V;
        return i < i2 ? m39594V2() : this.f25759R.get(i - i2);
    }

    public boolean m14129n3(int i) {
        ArrayList<ArrayList<Integer>> arrayList;
        m14135g3();
        return i >= this.f25763V && (arrayList = this.f25760S) != null && !arrayList.isEmpty() && i - this.f25763V < this.f25760S.get(0).size();
    }

    public boolean m14128o3(int i) {
        m14135g3();
        int i2 = this.f25763V;
        return i < i2 || this.f25761T.get(i - i2, -1) != -1;
    }

    public final void m14127p3(float r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.thunderdog.challegram.p211v.NewFlowLayoutManager.m14127p3(float):void");
    }

    public void m14126q3(int i) {
        this.f25763V = i;
    }

    public final C7927a m14125r3(int i) {
        C7927a l3 = mo7529l3(i);
        if (l3.f25764a == 0.0f) {
            l3.f25764a = 100.0f;
        }
        if (l3.f25765b == 0.0f) {
            l3.f25765b = 100.0f;
        }
        float f = l3.f25764a;
        float f2 = l3.f25765b;
        float f3 = f / f2;
        if (f3 > 4.0f || f3 < 0.2f) {
            float max = Math.max(f, f2);
            l3.f25764a = max;
            l3.f25765b = max;
        }
        return l3;
    }
}
