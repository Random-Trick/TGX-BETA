package org.thunderdog.challegram.v;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.GridLayoutManager;
import java.util.ArrayList;

public class NewFlowLayoutManager extends GridLayoutManager {
    public ArrayList<ArrayList<Integer>> R;
    public int T;
    public int U;
    public SparseIntArray Q = new SparseIntArray();
    public SparseIntArray S = new SparseIntArray();

    public static class a {
        public float f20174a;
        public float f20175b;

        public a() {
        }

        public a(float f10, float f11) {
            this.f20174a = f10;
            this.f20175b = f11;
        }
    }

    public NewFlowLayoutManager(Context context, int i10) {
        super(context, i10);
    }

    @Override
    public boolean J1() {
        return false;
    }

    public final void g3() {
        if (this.Q.size() != h3() || this.T != p0()) {
            this.T = p0();
            p3(p0());
        }
    }

    public int h3() {
        return Y() - this.U;
    }

    public final ArrayList<ArrayList<Integer>> i3(int[] iArr, int i10) {
        int length = iArr.length;
        if (i10 <= 0) {
            return new ArrayList<>();
        }
        if (i10 >= length || length == 1) {
            ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>(iArr.length);
            for (int i11 : iArr) {
                ArrayList<Integer> arrayList2 = new ArrayList<>(1);
                arrayList2.add(Integer.valueOf(i11));
                arrayList.add(arrayList2);
            }
            return arrayList;
        }
        int[] j32 = j3(iArr, i10);
        int i12 = i10 - 1;
        int i13 = length - 1;
        ArrayList<ArrayList<Integer>> arrayList3 = new ArrayList<>();
        for (int i14 = i10 - 2; i14 >= 0; i14--) {
            if (i13 < 1) {
                arrayList3.add(0, new ArrayList<>());
            } else {
                ArrayList<Integer> arrayList4 = new ArrayList<>();
                int i15 = ((i13 - 1) * i12) + i14;
                int i16 = i13 + 1;
                for (int i17 = j32[i15] + 1; i17 < i16; i17++) {
                    arrayList4.add(Integer.valueOf(iArr[i17]));
                }
                arrayList3.add(0, arrayList4);
                i13 = j32[i15];
            }
        }
        ArrayList<Integer> arrayList5 = new ArrayList<>();
        int i18 = i13 + 1;
        for (int i19 = 0; i19 < i18; i19++) {
            arrayList5.add(Integer.valueOf(iArr[i19]));
        }
        arrayList3.add(0, arrayList5);
        return arrayList3;
    }

    public final int[] j3(int[] iArr, int i10) {
        int length = iArr.length;
        int[] iArr2 = new int[length * i10];
        int i11 = i10 - 1;
        int[] iArr3 = new int[(length - 1) * i11];
        int i12 = 0;
        while (i12 < length) {
            iArr2[i12 * i10] = iArr[i12] + (i12 != 0 ? iArr2[(i12 - 1) * i10] : 0);
            i12++;
        }
        for (int i13 = 0; i13 < i10; i13++) {
            iArr2[i13] = iArr[0];
        }
        for (int i14 = 1; i14 < length; i14++) {
            for (int i15 = 1; i15 < i10; i15++) {
                int i16 = Integer.MAX_VALUE;
                int i17 = 0;
                for (int i18 = 0; i18 < i14; i18++) {
                    int i19 = i18 * i10;
                    int max = Math.max(iArr2[(i15 - 1) + i19], iArr2[i14 * i10] - iArr2[i19]);
                    if (i18 == 0 || max < i17) {
                        i16 = i18;
                        i17 = max;
                    }
                }
                iArr2[(i14 * i10) + i15] = i17;
                iArr3[((i14 - 1) * i11) + (i15 - 1)] = i16;
            }
        }
        return iArr3;
    }

    public int k3(int i10) {
        if (this.R == null) {
            p3(i10);
        }
        int i11 = this.U;
        ArrayList<ArrayList<Integer>> arrayList = this.R;
        return i11 + (arrayList != null ? arrayList.size() : 0);
    }

    public a l3(int i10) {
        return new a(100.0f, 100.0f);
    }

    public int m3(int i10) {
        g3();
        int i11 = this.U;
        return i10 < i11 ? V2() : this.Q.get(i10 - i11);
    }

    public boolean n3(int i10) {
        ArrayList<ArrayList<Integer>> arrayList;
        g3();
        return i10 >= this.U && (arrayList = this.R) != null && !arrayList.isEmpty() && i10 - this.U < this.R.get(0).size();
    }

    public boolean o3(int i10) {
        g3();
        int i11 = this.U;
        return i10 < i11 || this.S.get(i10 - i11, -1) != -1;
    }

    public final void p3(float r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.thunderdog.challegram.v.NewFlowLayoutManager.p3(float):void");
    }

    public void q3(int i10) {
        this.U = i10;
    }

    public final a r3(int i10) {
        a l32 = l3(i10);
        if (l32.f20174a == 0.0f) {
            l32.f20174a = 100.0f;
        }
        if (l32.f20175b == 0.0f) {
            l32.f20175b = 100.0f;
        }
        float f10 = l32.f20174a;
        float f11 = l32.f20175b;
        float f12 = f10 / f11;
        if (f12 > 4.0f || f12 < 0.2f) {
            float max = Math.max(f10, f11);
            l32.f20174a = max;
            l32.f20175b = max;
        }
        return l32;
    }
}
