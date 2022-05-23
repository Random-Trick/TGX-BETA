package x8;

import java.io.InputStream;
import x8.i;
import y8.b;

public class h extends b {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int[] L;
    public i M;
    public g N;
    public int O;
    public int f26115a;
    public boolean f26116b;
    public boolean f26117c;
    public boolean f26118d;
    public int f26119e;
    public boolean f26120f;
    public boolean f26121g;
    public boolean f26122h;
    public c f26123i;
    public int f26124j;
    public int f26125k;
    public int f26126l;
    public int f26127m;
    public int f26128n;
    public int f26129o;
    public boolean f26130p;
    public int f26131q;
    public long f26132r;
    public boolean f26133s;
    public boolean f26134t;
    public boolean f26135u;
    public boolean f26136v;
    public boolean f26137w;
    public boolean f26138x;
    public int f26139y;
    public int f26140z;

    public static i a(b bVar) {
        i iVar = new i();
        boolean f10 = bVar.f("VUI: aspect_ratio_info_present_flag");
        iVar.f26141a = f10;
        if (f10) {
            a a10 = a.a((int) bVar.g(8, "VUI: aspect_ratio"));
            iVar.f26165y = a10;
            if (a10 == a.f26065b) {
                iVar.f26142b = (int) bVar.g(16, "VUI: sar_width");
                iVar.f26143c = (int) bVar.g(16, "VUI: sar_height");
            }
        }
        boolean f11 = bVar.f("VUI: overscan_info_present_flag");
        iVar.f26144d = f11;
        if (f11) {
            iVar.f26145e = bVar.f("VUI: overscan_appropriate_flag");
        }
        boolean f12 = bVar.f("VUI: video_signal_type_present_flag");
        iVar.f26146f = f12;
        if (f12) {
            iVar.f26147g = (int) bVar.g(3, "VUI: video_format");
            iVar.f26148h = bVar.f("VUI: video_full_range_flag");
            boolean f13 = bVar.f("VUI: colour_description_present_flag");
            iVar.f26149i = f13;
            if (f13) {
                iVar.f26150j = (int) bVar.g(8, "VUI: colour_primaries");
                iVar.f26151k = (int) bVar.g(8, "VUI: transfer_characteristics");
                iVar.f26152l = (int) bVar.g(8, "VUI: matrix_coefficients");
            }
        }
        boolean f14 = bVar.f("VUI: chroma_loc_info_present_flag");
        iVar.f26153m = f14;
        if (f14) {
            iVar.f26154n = bVar.l("VUI chroma_sample_loc_type_top_field");
            iVar.f26155o = bVar.l("VUI chroma_sample_loc_type_bottom_field");
        }
        boolean f15 = bVar.f("VUI: timing_info_present_flag");
        iVar.f26156p = f15;
        if (f15) {
            iVar.f26157q = (int) bVar.g(32, "VUI: num_units_in_tick");
            iVar.f26158r = (int) bVar.g(32, "VUI: time_scale");
            iVar.f26159s = bVar.f("VUI: fixed_frame_rate_flag");
        }
        boolean f16 = bVar.f("VUI: nal_hrd_parameters_present_flag");
        if (f16) {
            iVar.f26162v = c(bVar);
        }
        boolean f17 = bVar.f("VUI: vcl_hrd_parameters_present_flag");
        if (f17) {
            iVar.f26163w = c(bVar);
        }
        if (f16 || f17) {
            iVar.f26160t = bVar.f("VUI: low_delay_hrd_flag");
        }
        iVar.f26161u = bVar.f("VUI: pic_struct_present_flag");
        if (bVar.f("VUI: bitstream_restriction_flag")) {
            i.a aVar = new i.a();
            iVar.f26164x = aVar;
            aVar.f26166a = bVar.f("VUI: motion_vectors_over_pic_boundaries_flag");
            iVar.f26164x.f26167b = bVar.l("VUI max_bytes_per_pic_denom");
            iVar.f26164x.f26168c = bVar.l("VUI max_bits_per_mb_denom");
            iVar.f26164x.f26169d = bVar.l("VUI log2_max_mv_length_horizontal");
            iVar.f26164x.f26170e = bVar.l("VUI log2_max_mv_length_vertical");
            iVar.f26164x.f26171f = bVar.l("VUI num_reorder_frames");
            iVar.f26164x.f26172g = bVar.l("VUI max_dec_frame_buffering");
        }
        return iVar;
    }

    public static h b(InputStream inputStream) {
        b bVar = new b(inputStream);
        h hVar = new h();
        hVar.f26131q = (int) bVar.g(8, "SPS: profile_idc");
        hVar.f26133s = bVar.f("SPS: constraint_set_0_flag");
        hVar.f26134t = bVar.f("SPS: constraint_set_1_flag");
        hVar.f26135u = bVar.f("SPS: constraint_set_2_flag");
        hVar.f26136v = bVar.f("SPS: constraint_set_3_flag");
        hVar.f26137w = bVar.f("SPS: constraint_set_4_flag");
        hVar.f26138x = bVar.f("SPS: constraint_set_5_flag");
        hVar.f26132r = bVar.g(2, "SPS: reserved_zero_2bits");
        hVar.f26139y = (int) bVar.g(8, "SPS: level_idc");
        hVar.f26140z = bVar.l("SPS: seq_parameter_set_id");
        int i10 = hVar.f26131q;
        if (i10 == 100 || i10 == 110 || i10 == 122 || i10 == 144) {
            c a10 = c.a(bVar.l("SPS: chroma_format_idc"));
            hVar.f26123i = a10;
            if (a10 == c.f26070g) {
                hVar.A = bVar.f("SPS: residual_color_transform_flag");
            }
            hVar.f26128n = bVar.l("SPS: bit_depth_luma_minus8");
            hVar.f26129o = bVar.l("SPS: bit_depth_chroma_minus8");
            hVar.f26130p = bVar.f("SPS: qpprime_y_zero_transform_bypass_flag");
            if (bVar.f("SPS: seq_scaling_matrix_present_lag")) {
                d(bVar, hVar);
            }
        } else {
            hVar.f26123i = c.f26068e;
        }
        hVar.f26124j = bVar.l("SPS: log2_max_frame_num_minus4");
        int l10 = bVar.l("SPS: pic_order_cnt_type");
        hVar.f26115a = l10;
        if (l10 == 0) {
            hVar.f26125k = bVar.l("SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else if (l10 == 1) {
            hVar.f26117c = bVar.f("SPS: delta_pic_order_always_zero_flag");
            hVar.B = bVar.h("SPS: offset_for_non_ref_pic");
            hVar.C = bVar.h("SPS: offset_for_top_to_bottom_field");
            int l11 = bVar.l("SPS: num_ref_frames_in_pic_order_cnt_cycle");
            hVar.O = l11;
            hVar.L = new int[l11];
            for (int i11 = 0; i11 < hVar.O; i11++) {
                int[] iArr = hVar.L;
                iArr[i11] = bVar.h("SPS: offsetForRefFrame [" + i11 + "]");
            }
        }
        hVar.D = bVar.l("SPS: num_ref_frames");
        hVar.E = bVar.f("SPS: gaps_in_frame_num_value_allowed_flag");
        hVar.f26127m = bVar.l("SPS: pic_width_in_mbs_minus1");
        hVar.f26126l = bVar.l("SPS: pic_height_in_map_units_minus1");
        boolean f10 = bVar.f("SPS: frame_mbs_only_flag");
        hVar.F = f10;
        if (!f10) {
            hVar.f26121g = bVar.f("SPS: mb_adaptive_frame_field_flag");
        }
        hVar.f26122h = bVar.f("SPS: direct_8x8_inference_flag");
        boolean f11 = bVar.f("SPS: frame_cropping_flag");
        hVar.G = f11;
        if (f11) {
            hVar.H = bVar.l("SPS: frame_crop_left_offset");
            hVar.I = bVar.l("SPS: frame_crop_right_offset");
            hVar.J = bVar.l("SPS: frame_crop_top_offset");
            hVar.K = bVar.l("SPS: frame_crop_bottom_offset");
        }
        if (bVar.f("SPS: vui_parameters_present_flag")) {
            hVar.M = a(bVar);
        }
        bVar.i();
        return hVar;
    }

    public static d c(b bVar) {
        d dVar = new d();
        dVar.f26074a = bVar.l("SPS: cpb_cnt_minus1");
        dVar.f26075b = (int) bVar.g(4, "HRD: bit_rate_scale");
        dVar.f26076c = (int) bVar.g(4, "HRD: cpb_size_scale");
        int i10 = dVar.f26074a;
        dVar.f26077d = new int[i10 + 1];
        dVar.f26078e = new int[i10 + 1];
        dVar.f26079f = new boolean[i10 + 1];
        for (int i11 = 0; i11 <= dVar.f26074a; i11++) {
            dVar.f26077d[i11] = bVar.l("HRD: bit_rate_value_minus1");
            dVar.f26078e[i11] = bVar.l("HRD: cpb_size_value_minus1");
            dVar.f26079f[i11] = bVar.f("HRD: cbr_flag");
        }
        dVar.f26080g = (int) bVar.g(5, "HRD: initial_cpb_removal_delay_length_minus1");
        dVar.f26081h = (int) bVar.g(5, "HRD: cpb_removal_delay_length_minus1");
        dVar.f26082i = (int) bVar.g(5, "HRD: dpb_output_delay_length_minus1");
        dVar.f26083j = (int) bVar.g(5, "HRD: time_offset_length");
        return dVar;
    }

    public static void d(b bVar, h hVar) {
        hVar.N = new g();
        for (int i10 = 0; i10 < 8; i10++) {
            if (bVar.f("SPS: seqScalingListPresentFlag")) {
                g gVar = hVar.N;
                f[] fVarArr = new f[8];
                gVar.f26113a = fVarArr;
                f[] fVarArr2 = new f[8];
                gVar.f26114b = fVarArr2;
                if (i10 < 6) {
                    fVarArr[i10] = f.a(bVar, 16);
                } else {
                    fVarArr2[i10 - 6] = f.a(bVar, 64);
                }
            }
        }
    }

    public String toString() {
        return "SeqParameterSet{ \n        pic_order_cnt_type=" + this.f26115a + ", \n        field_pic_flag=" + this.f26116b + ", \n        delta_pic_order_always_zero_flag=" + this.f26117c + ", \n        weighted_pred_flag=" + this.f26118d + ", \n        weighted_bipred_idc=" + this.f26119e + ", \n        entropy_coding_mode_flag=" + this.f26120f + ", \n        mb_adaptive_frame_field_flag=" + this.f26121g + ", \n        direct_8x8_inference_flag=" + this.f26122h + ", \n        chroma_format_idc=" + this.f26123i + ", \n        log2_max_frame_num_minus4=" + this.f26124j + ", \n        log2_max_pic_order_cnt_lsb_minus4=" + this.f26125k + ", \n        pic_height_in_map_units_minus1=" + this.f26126l + ", \n        pic_width_in_mbs_minus1=" + this.f26127m + ", \n        bit_depth_luma_minus8=" + this.f26128n + ", \n        bit_depth_chroma_minus8=" + this.f26129o + ", \n        qpprime_y_zero_transform_bypass_flag=" + this.f26130p + ", \n        profile_idc=" + this.f26131q + ", \n        constraint_set_0_flag=" + this.f26133s + ", \n        constraint_set_1_flag=" + this.f26134t + ", \n        constraint_set_2_flag=" + this.f26135u + ", \n        constraint_set_3_flag=" + this.f26136v + ", \n        constraint_set_4_flag=" + this.f26137w + ", \n        constraint_set_5_flag=" + this.f26138x + ", \n        level_idc=" + this.f26139y + ", \n        seq_parameter_set_id=" + this.f26140z + ", \n        residual_color_transform_flag=" + this.A + ", \n        offset_for_non_ref_pic=" + this.B + ", \n        offset_for_top_to_bottom_field=" + this.C + ", \n        num_ref_frames=" + this.D + ", \n        gaps_in_frame_num_value_allowed_flag=" + this.E + ", \n        frame_mbs_only_flag=" + this.F + ", \n        frame_cropping_flag=" + this.G + ", \n        frame_crop_left_offset=" + this.H + ", \n        frame_crop_right_offset=" + this.I + ", \n        frame_crop_top_offset=" + this.J + ", \n        frame_crop_bottom_offset=" + this.K + ", \n        offsetForRefFrame=" + this.L + ", \n        vuiParams=" + this.M + ", \n        scalingMatrix=" + this.N + ", \n        num_ref_frames_in_pic_order_cnt_cycle=" + this.O + '}';
    }
}
