package x8;

import java.io.InputStream;
import java.util.Arrays;
import y8.b;

public class e extends b {
    public boolean f26084a;
    public int f26085b;
    public int f26086c;
    public int f26087d;
    public int f26088e;
    public int f26089f;
    public boolean f26090g;
    public int f26091h;
    public int f26092i;
    public boolean f26093j;
    public int f26094k;
    public int f26095l;
    public int f26096m;
    public int f26097n;
    public boolean f26098o;
    public boolean f26099p;
    public boolean f26100q;
    public int[] f26101r;
    public int[] f26102s;
    public int[] f26103t;
    public boolean f26104u;
    public int[] f26105v;
    public a f26106w;

    public static class a {
        public boolean f26107a;
        public g f26108b = new g();
        public int f26109c;
        public boolean[] f26110d;

        public String toString() {
            return "PPSExt{transform_8x8_mode_flag=" + this.f26107a + ", scalindMatrix=" + this.f26108b + ", second_chroma_qp_index_offset=" + this.f26109c + ", pic_scaling_list_present_flag=" + this.f26110d + '}';
        }
    }

    public static e a(InputStream inputStream) {
        b bVar = new b(inputStream);
        e eVar = new e();
        eVar.f26088e = bVar.l("PPS: pic_parameter_set_id");
        eVar.f26089f = bVar.l("PPS: seq_parameter_set_id");
        eVar.f26084a = bVar.f("PPS: entropy_coding_mode_flag");
        eVar.f26090g = bVar.f("PPS: pic_order_present_flag");
        int l10 = bVar.l("PPS: num_slice_groups_minus1");
        eVar.f26091h = l10;
        if (l10 > 0) {
            int l11 = bVar.l("PPS: slice_group_map_type");
            eVar.f26092i = l11;
            int i10 = eVar.f26091h;
            eVar.f26101r = new int[i10 + 1];
            eVar.f26102s = new int[i10 + 1];
            eVar.f26103t = new int[i10 + 1];
            if (l11 == 0) {
                for (int i11 = 0; i11 <= eVar.f26091h; i11++) {
                    eVar.f26103t[i11] = bVar.l("PPS: run_length_minus1");
                }
            } else if (l11 == 2) {
                for (int i12 = 0; i12 < eVar.f26091h; i12++) {
                    eVar.f26101r[i12] = bVar.l("PPS: top_left");
                    eVar.f26102s[i12] = bVar.l("PPS: bottom_right");
                }
            } else {
                int i13 = 3;
                if (l11 == 3 || l11 == 4 || l11 == 5) {
                    eVar.f26104u = bVar.f("PPS: slice_group_change_direction_flag");
                    eVar.f26087d = bVar.l("PPS: slice_group_change_rate_minus1");
                } else if (l11 == 6) {
                    if (i10 + 1 <= 4) {
                        i13 = i10 + 1 > 2 ? 2 : 1;
                    }
                    int l12 = bVar.l("PPS: pic_size_in_map_units_minus1");
                    eVar.f26105v = new int[l12 + 1];
                    for (int i14 = 0; i14 <= l12; i14++) {
                        int[] iArr = eVar.f26105v;
                        iArr[i14] = bVar.j(i13, "PPS: slice_group_id [" + i14 + "]f");
                    }
                }
            }
        }
        eVar.f26085b = bVar.l("PPS: num_ref_idx_l0_active_minus1");
        eVar.f26086c = bVar.l("PPS: num_ref_idx_l1_active_minus1");
        eVar.f26093j = bVar.f("PPS: weighted_pred_flag");
        eVar.f26094k = (int) bVar.g(2, "PPS: weighted_bipred_idc");
        eVar.f26095l = bVar.h("PPS: pic_init_qp_minus26");
        eVar.f26096m = bVar.h("PPS: pic_init_qs_minus26");
        eVar.f26097n = bVar.h("PPS: chroma_qp_index_offset");
        eVar.f26098o = bVar.f("PPS: deblocking_filter_control_present_flag");
        eVar.f26099p = bVar.f("PPS: constrained_intra_pred_flag");
        eVar.f26100q = bVar.f("PPS: redundant_pic_cnt_present_flag");
        if (bVar.b()) {
            a aVar = new a();
            eVar.f26106w = aVar;
            aVar.f26107a = bVar.f("PPS: transform_8x8_mode_flag");
            if (bVar.f("PPS: pic_scaling_matrix_present_flag")) {
                for (int i15 = 0; i15 < ((eVar.f26106w.f26107a ? 1 : 0) * 2) + 6; i15++) {
                    if (bVar.f("PPS: pic_scaling_list_present_flag")) {
                        g gVar = eVar.f26106w.f26108b;
                        f[] fVarArr = new f[8];
                        gVar.f26113a = fVarArr;
                        f[] fVarArr2 = new f[8];
                        gVar.f26114b = fVarArr2;
                        if (i15 < 6) {
                            fVarArr[i15] = f.a(bVar, 16);
                        } else {
                            fVarArr2[i15 - 6] = f.a(bVar, 64);
                        }
                    }
                }
            }
            eVar.f26106w.f26109c = bVar.h("PPS: second_chroma_qp_index_offset");
        }
        bVar.i();
        return eVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!Arrays.equals(this.f26102s, eVar.f26102s) || this.f26097n != eVar.f26097n || this.f26099p != eVar.f26099p || this.f26098o != eVar.f26098o || this.f26084a != eVar.f26084a) {
            return false;
        }
        a aVar = this.f26106w;
        if (aVar == null) {
            if (eVar.f26106w != null) {
                return false;
            }
        } else if (!aVar.equals(eVar.f26106w)) {
            return false;
        }
        return this.f26085b == eVar.f26085b && this.f26086c == eVar.f26086c && this.f26091h == eVar.f26091h && this.f26095l == eVar.f26095l && this.f26096m == eVar.f26096m && this.f26090g == eVar.f26090g && this.f26088e == eVar.f26088e && this.f26100q == eVar.f26100q && Arrays.equals(this.f26103t, eVar.f26103t) && this.f26089f == eVar.f26089f && this.f26104u == eVar.f26104u && this.f26087d == eVar.f26087d && Arrays.equals(this.f26105v, eVar.f26105v) && this.f26092i == eVar.f26092i && Arrays.equals(this.f26101r, eVar.f26101r) && this.f26094k == eVar.f26094k && this.f26093j == eVar.f26093j;
    }

    public int hashCode() {
        int i10 = 1231;
        int hashCode = (((((((((Arrays.hashCode(this.f26102s) + 31) * 31) + this.f26097n) * 31) + (this.f26099p ? 1231 : 1237)) * 31) + (this.f26098o ? 1231 : 1237)) * 31) + (this.f26084a ? 1231 : 1237)) * 31;
        a aVar = this.f26106w;
        int hashCode2 = (((((((((((((((((((((((((((((((((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f26085b) * 31) + this.f26086c) * 31) + this.f26091h) * 31) + this.f26095l) * 31) + this.f26096m) * 31) + (this.f26090g ? 1231 : 1237)) * 31) + this.f26088e) * 31) + (this.f26100q ? 1231 : 1237)) * 31) + Arrays.hashCode(this.f26103t)) * 31) + this.f26089f) * 31) + (this.f26104u ? 1231 : 1237)) * 31) + this.f26087d) * 31) + Arrays.hashCode(this.f26105v)) * 31) + this.f26092i) * 31) + Arrays.hashCode(this.f26101r)) * 31) + this.f26094k) * 31;
        if (!this.f26093j) {
            i10 = 1237;
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "PictureParameterSet{\n       entropy_coding_mode_flag=" + this.f26084a + ",\n       num_ref_idx_l0_active_minus1=" + this.f26085b + ",\n       num_ref_idx_l1_active_minus1=" + this.f26086c + ",\n       slice_group_change_rate_minus1=" + this.f26087d + ",\n       pic_parameter_set_id=" + this.f26088e + ",\n       seq_parameter_set_id=" + this.f26089f + ",\n       pic_order_present_flag=" + this.f26090g + ",\n       num_slice_groups_minus1=" + this.f26091h + ",\n       slice_group_map_type=" + this.f26092i + ",\n       weighted_pred_flag=" + this.f26093j + ",\n       weighted_bipred_idc=" + this.f26094k + ",\n       pic_init_qp_minus26=" + this.f26095l + ",\n       pic_init_qs_minus26=" + this.f26096m + ",\n       chroma_qp_index_offset=" + this.f26097n + ",\n       deblocking_filter_control_present_flag=" + this.f26098o + ",\n       constrained_intra_pred_flag=" + this.f26099p + ",\n       redundant_pic_cnt_present_flag=" + this.f26100q + ",\n       top_left=" + this.f26101r + ",\n       bottom_right=" + this.f26102s + ",\n       run_length_minus1=" + this.f26103t + ",\n       slice_group_change_direction_flag=" + this.f26104u + ",\n       slice_group_id=" + this.f26105v + ",\n       extended=" + this.f26106w + '}';
    }
}
