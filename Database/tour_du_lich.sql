PGDMP         	                y            tour_du_lich    13.1    13.1 �    u           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            v           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            w           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            x           1262    17446    tour_du_lich    DATABASE     p   CREATE DATABASE tour_du_lich WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_United States.1252';
    DROP DATABASE tour_du_lich;
                postgres    false            �            1259    17447    dia_diem    TABLE     �   CREATE TABLE public.dia_diem (
    id bigint NOT NULL,
    ten_dia_diem character varying(255),
    dia_chi character varying(255),
    gioi_thieu text,
    hinh_anh bytea,
    id_tinh bigint
);
    DROP TABLE public.dia_diem;
       public         heap    postgres    false            �            1259    17453    dia_diem_id_seq    SEQUENCE     x   CREATE SEQUENCE public.dia_diem_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.dia_diem_id_seq;
       public          postgres    false    200            y           0    0    dia_diem_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.dia_diem_id_seq OWNED BY public.dia_diem.id;
          public          postgres    false    201            �            1259    17455    dich_vu    TABLE     �   CREATE TABLE public.dich_vu (
    id bigint NOT NULL,
    ten_dich_vu character varying(255),
    id_loai_dich_vu bigint NOT NULL,
    id_nha_hang bigint NOT NULL,
    gia_tien integer
);
    DROP TABLE public.dich_vu;
       public         heap    postgres    false            �            1259    17458    dich_vu_id_seq    SEQUENCE     w   CREATE SEQUENCE public.dich_vu_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.dich_vu_id_seq;
       public          postgres    false    202            z           0    0    dich_vu_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.dich_vu_id_seq OWNED BY public.dich_vu.id;
          public          postgres    false    203            �            1259    17460    doan    TABLE     �   CREATE TABLE public.doan (
    id bigint NOT NULL,
    ten_doan character varying(255),
    ngay_khoi_hanh date,
    ngay_ket_thuc date,
    id_tour bigint NOT NULL,
    so_luong integer
);
    DROP TABLE public.doan;
       public         heap    postgres    false            �            1259    17463    doan_id_seq    SEQUENCE     t   CREATE SEQUENCE public.doan_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 "   DROP SEQUENCE public.doan_id_seq;
       public          postgres    false    204            {           0    0    doan_id_seq    SEQUENCE OWNED BY     ;   ALTER SEQUENCE public.doan_id_seq OWNED BY public.doan.id;
          public          postgres    false    205            �            1259    17465    ds_dia_diem_tour    TABLE     g   CREATE TABLE public.ds_dia_diem_tour (
    id_tour bigint NOT NULL,
    id_dia_diem bigint NOT NULL
);
 $   DROP TABLE public.ds_dia_diem_tour;
       public         heap    postgres    false            �            1259    17468    ds_dich_vu_doan    TABLE     {   CREATE TABLE public.ds_dich_vu_doan (
    id_doan bigint NOT NULL,
    id_dich_vu bigint NOT NULL,
    so_luong integer
);
 #   DROP TABLE public.ds_dich_vu_doan;
       public         heap    postgres    false            �            1259    17471    ds_khach_doan    TABLE     a   CREATE TABLE public.ds_khach_doan (
    id_doan bigint NOT NULL,
    id_khach bigint NOT NULL
);
 !   DROP TABLE public.ds_khach_doan;
       public         heap    postgres    false            �            1259    17474    ds_khach_san_doan    TABLE     ~   CREATE TABLE public.ds_khach_san_doan (
    id_doan bigint NOT NULL,
    id_khach_san bigint NOT NULL,
    so_ngay integer
);
 %   DROP TABLE public.ds_khach_san_doan;
       public         heap    postgres    false            �            1259    17477    ds_nhan_vien_doan    TABLE     i   CREATE TABLE public.ds_nhan_vien_doan (
    id_doan bigint NOT NULL,
    id_nhan_vien bigint NOT NULL
);
 %   DROP TABLE public.ds_nhan_vien_doan;
       public         heap    postgres    false            �            1259    17480    ds_phuong_tien_doan    TABLE     m   CREATE TABLE public.ds_phuong_tien_doan (
    id_doan bigint NOT NULL,
    id_phuong_tien bigint NOT NULL
);
 '   DROP TABLE public.ds_phuong_tien_doan;
       public         heap    postgres    false            �            1259    17483 
   khach_hang    TABLE       CREATE TABLE public.khach_hang (
    id bigint NOT NULL,
    ho character varying(10),
    ten character varying(25),
    gioi_tinh boolean,
    cmnd character varying(12),
    sdt character varying(11),
    dia_chi character varying(255),
    hinh_anh bytea
);
    DROP TABLE public.khach_hang;
       public         heap    postgres    false            �            1259    17489    khach_hang_id_seq    SEQUENCE     z   CREATE SEQUENCE public.khach_hang_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE public.khach_hang_id_seq;
       public          postgres    false    212            |           0    0    khach_hang_id_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE public.khach_hang_id_seq OWNED BY public.khach_hang.id;
          public          postgres    false    213            �            1259    17491 	   khach_san    TABLE     �   CREATE TABLE public.khach_san (
    id bigint NOT NULL,
    ten_khach_san character varying(255),
    dia_chi character varying(255),
    gia_tien integer
);
    DROP TABLE public.khach_san;
       public         heap    postgres    false            �            1259    17497    khach_san_id_seq    SEQUENCE     y   CREATE SEQUENCE public.khach_san_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.khach_san_id_seq;
       public          postgres    false    214            }           0    0    khach_san_id_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.khach_san_id_seq OWNED BY public.khach_san.id;
          public          postgres    false    215            �            1259    17499    loai_dich_vu    TABLE     j   CREATE TABLE public.loai_dich_vu (
    id bigint NOT NULL,
    ten_loai_dich_vu character varying(255)
);
     DROP TABLE public.loai_dich_vu;
       public         heap    postgres    false            �            1259    17502    loai_dich_vu_id_seq    SEQUENCE     |   CREATE SEQUENCE public.loai_dich_vu_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.loai_dich_vu_id_seq;
       public          postgres    false    216            ~           0    0    loai_dich_vu_id_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.loai_dich_vu_id_seq OWNED BY public.loai_dich_vu.id;
          public          postgres    false    217            �            1259    17504    loai_du_lich    TABLE     j   CREATE TABLE public.loai_du_lich (
    id bigint NOT NULL,
    ten_loai_du_lich character varying(255)
);
     DROP TABLE public.loai_du_lich;
       public         heap    postgres    false            �            1259    17507    loai_du_lich_id_seq    SEQUENCE     |   CREATE SEQUENCE public.loai_du_lich_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.loai_du_lich_id_seq;
       public          postgres    false    218                       0    0    loai_du_lich_id_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.loai_du_lich_id_seq OWNED BY public.loai_du_lich.id;
          public          postgres    false    219            �            1259    17509    nha_hang    TABLE     �   CREATE TABLE public.nha_hang (
    id bigint NOT NULL,
    ten_nha_hang character varying(255),
    dia_chi character varying(255),
    hinh_anh bytea
);
    DROP TABLE public.nha_hang;
       public         heap    postgres    false            �            1259    17515    nha_hang_id_seq    SEQUENCE     x   CREATE SEQUENCE public.nha_hang_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.nha_hang_id_seq;
       public          postgres    false    220            �           0    0    nha_hang_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.nha_hang_id_seq OWNED BY public.nha_hang.id;
          public          postgres    false    221            �            1259    17517 	   nhan_vien    TABLE       CREATE TABLE public.nhan_vien (
    id bigint NOT NULL,
    ho character varying(255),
    ten character varying(255),
    gioi_tinh boolean,
    dia_chi character varying(255),
    sdt character varying(11),
    hinh_anh bytea,
    id_vai_tro bigint NOT NULL
);
    DROP TABLE public.nhan_vien;
       public         heap    postgres    false            �            1259    17523    nhan_vien_id_seq    SEQUENCE     y   CREATE SEQUENCE public.nhan_vien_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.nhan_vien_id_seq;
       public          postgres    false    222            �           0    0    nhan_vien_id_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.nhan_vien_id_seq OWNED BY public.nhan_vien.id;
          public          postgres    false    223            �            1259    17525    phuong_tien    TABLE     �   CREATE TABLE public.phuong_tien (
    id bigint NOT NULL,
    ten_phuong_tien character varying(255),
    so_cho integer,
    gia_tien integer
);
    DROP TABLE public.phuong_tien;
       public         heap    postgres    false            �            1259    17528    phuong_tien_id_seq    SEQUENCE     {   CREATE SEQUENCE public.phuong_tien_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.phuong_tien_id_seq;
       public          postgres    false    224            �           0    0    phuong_tien_id_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.phuong_tien_id_seq OWNED BY public.phuong_tien.id;
          public          postgres    false    225            �            1259    17530    tinh    TABLE     Z   CREATE TABLE public.tinh (
    id bigint NOT NULL,
    ten_tinh character varying(255)
);
    DROP TABLE public.tinh;
       public         heap    postgres    false            �            1259    17533    tinh_id_seq    SEQUENCE     t   CREATE SEQUENCE public.tinh_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 "   DROP SEQUENCE public.tinh_id_seq;
       public          postgres    false    226            �           0    0    tinh_id_seq    SEQUENCE OWNED BY     ;   ALTER SEQUENCE public.tinh_id_seq OWNED BY public.tinh.id;
          public          postgres    false    227            �            1259    17535    tour    TABLE     �   CREATE TABLE public.tour (
    id bigint NOT NULL,
    ten_tour character varying(255),
    id_loai_du_lich bigint NOT NULL,
    gia_tien integer,
    dac_diem text
);
    DROP TABLE public.tour;
       public         heap    postgres    false            �            1259    17541    tour_id_seq    SEQUENCE     t   CREATE SEQUENCE public.tour_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 "   DROP SEQUENCE public.tour_id_seq;
       public          postgres    false    228            �           0    0    tour_id_seq    SEQUENCE OWNED BY     ;   ALTER SEQUENCE public.tour_id_seq OWNED BY public.tour.id;
          public          postgres    false    229            �            1259    17543    vai_tro    TABLE     `   CREATE TABLE public.vai_tro (
    id bigint NOT NULL,
    ten_vai_tro character varying(255)
);
    DROP TABLE public.vai_tro;
       public         heap    postgres    false            �            1259    17546    vai_tro_id_seq    SEQUENCE     w   CREATE SEQUENCE public.vai_tro_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.vai_tro_id_seq;
       public          postgres    false    230            �           0    0    vai_tro_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.vai_tro_id_seq OWNED BY public.vai_tro.id;
          public          postgres    false    231            �           2604    17548    dia_diem id    DEFAULT     j   ALTER TABLE ONLY public.dia_diem ALTER COLUMN id SET DEFAULT nextval('public.dia_diem_id_seq'::regclass);
 :   ALTER TABLE public.dia_diem ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    201    200            �           2604    17549 
   dich_vu id    DEFAULT     h   ALTER TABLE ONLY public.dich_vu ALTER COLUMN id SET DEFAULT nextval('public.dich_vu_id_seq'::regclass);
 9   ALTER TABLE public.dich_vu ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    203    202            �           2604    17550    doan id    DEFAULT     b   ALTER TABLE ONLY public.doan ALTER COLUMN id SET DEFAULT nextval('public.doan_id_seq'::regclass);
 6   ALTER TABLE public.doan ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    205    204            �           2604    17551    khach_hang id    DEFAULT     n   ALTER TABLE ONLY public.khach_hang ALTER COLUMN id SET DEFAULT nextval('public.khach_hang_id_seq'::regclass);
 <   ALTER TABLE public.khach_hang ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    213    212            �           2604    17552    khach_san id    DEFAULT     l   ALTER TABLE ONLY public.khach_san ALTER COLUMN id SET DEFAULT nextval('public.khach_san_id_seq'::regclass);
 ;   ALTER TABLE public.khach_san ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    215    214            �           2604    17553    loai_dich_vu id    DEFAULT     r   ALTER TABLE ONLY public.loai_dich_vu ALTER COLUMN id SET DEFAULT nextval('public.loai_dich_vu_id_seq'::regclass);
 >   ALTER TABLE public.loai_dich_vu ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    217    216            �           2604    17554    loai_du_lich id    DEFAULT     r   ALTER TABLE ONLY public.loai_du_lich ALTER COLUMN id SET DEFAULT nextval('public.loai_du_lich_id_seq'::regclass);
 >   ALTER TABLE public.loai_du_lich ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    219    218            �           2604    17555    nha_hang id    DEFAULT     j   ALTER TABLE ONLY public.nha_hang ALTER COLUMN id SET DEFAULT nextval('public.nha_hang_id_seq'::regclass);
 :   ALTER TABLE public.nha_hang ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    221    220            �           2604    17556    nhan_vien id    DEFAULT     l   ALTER TABLE ONLY public.nhan_vien ALTER COLUMN id SET DEFAULT nextval('public.nhan_vien_id_seq'::regclass);
 ;   ALTER TABLE public.nhan_vien ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    223    222            �           2604    17557    phuong_tien id    DEFAULT     p   ALTER TABLE ONLY public.phuong_tien ALTER COLUMN id SET DEFAULT nextval('public.phuong_tien_id_seq'::regclass);
 =   ALTER TABLE public.phuong_tien ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    225    224            �           2604    17558    tinh id    DEFAULT     b   ALTER TABLE ONLY public.tinh ALTER COLUMN id SET DEFAULT nextval('public.tinh_id_seq'::regclass);
 6   ALTER TABLE public.tinh ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    227    226            �           2604    17559    tour id    DEFAULT     b   ALTER TABLE ONLY public.tour ALTER COLUMN id SET DEFAULT nextval('public.tour_id_seq'::regclass);
 6   ALTER TABLE public.tour ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    229    228            �           2604    17560 
   vai_tro id    DEFAULT     h   ALTER TABLE ONLY public.vai_tro ALTER COLUMN id SET DEFAULT nextval('public.vai_tro_id_seq'::regclass);
 9   ALTER TABLE public.vai_tro ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    231    230            S          0    17447    dia_diem 
   TABLE DATA           \   COPY public.dia_diem (id, ten_dia_diem, dia_chi, gioi_thieu, hinh_anh, id_tinh) FROM stdin;
    public          postgres    false    200   ��       U          0    17455    dich_vu 
   TABLE DATA           Z   COPY public.dich_vu (id, ten_dich_vu, id_loai_dich_vu, id_nha_hang, gia_tien) FROM stdin;
    public          postgres    false    202   �       W          0    17460    doan 
   TABLE DATA           ^   COPY public.doan (id, ten_doan, ngay_khoi_hanh, ngay_ket_thuc, id_tour, so_luong) FROM stdin;
    public          postgres    false    204   t�       Y          0    17465    ds_dia_diem_tour 
   TABLE DATA           @   COPY public.ds_dia_diem_tour (id_tour, id_dia_diem) FROM stdin;
    public          postgres    false    206   ��       Z          0    17468    ds_dich_vu_doan 
   TABLE DATA           H   COPY public.ds_dich_vu_doan (id_doan, id_dich_vu, so_luong) FROM stdin;
    public          postgres    false    207   ƚ       [          0    17471    ds_khach_doan 
   TABLE DATA           :   COPY public.ds_khach_doan (id_doan, id_khach) FROM stdin;
    public          postgres    false    208   
�       \          0    17474    ds_khach_san_doan 
   TABLE DATA           K   COPY public.ds_khach_san_doan (id_doan, id_khach_san, so_ngay) FROM stdin;
    public          postgres    false    209   B�       ]          0    17477    ds_nhan_vien_doan 
   TABLE DATA           B   COPY public.ds_nhan_vien_doan (id_doan, id_nhan_vien) FROM stdin;
    public          postgres    false    210   ��       ^          0    17480    ds_phuong_tien_doan 
   TABLE DATA           F   COPY public.ds_phuong_tien_doan (id_doan, id_phuong_tien) FROM stdin;
    public          postgres    false    211   ��       _          0    17483 
   khach_hang 
   TABLE DATA           Z   COPY public.khach_hang (id, ho, ten, gioi_tinh, cmnd, sdt, dia_chi, hinh_anh) FROM stdin;
    public          postgres    false    212   �       a          0    17491 	   khach_san 
   TABLE DATA           I   COPY public.khach_san (id, ten_khach_san, dia_chi, gia_tien) FROM stdin;
    public          postgres    false    214   ��       c          0    17499    loai_dich_vu 
   TABLE DATA           <   COPY public.loai_dich_vu (id, ten_loai_dich_vu) FROM stdin;
    public          postgres    false    216   �       e          0    17504    loai_du_lich 
   TABLE DATA           <   COPY public.loai_du_lich (id, ten_loai_du_lich) FROM stdin;
    public          postgres    false    218   ��       g          0    17509    nha_hang 
   TABLE DATA           G   COPY public.nha_hang (id, ten_nha_hang, dia_chi, hinh_anh) FROM stdin;
    public          postgres    false    220   5�       i          0    17517 	   nhan_vien 
   TABLE DATA           _   COPY public.nhan_vien (id, ho, ten, gioi_tinh, dia_chi, sdt, hinh_anh, id_vai_tro) FROM stdin;
    public          postgres    false    222   ��       k          0    17525    phuong_tien 
   TABLE DATA           L   COPY public.phuong_tien (id, ten_phuong_tien, so_cho, gia_tien) FROM stdin;
    public          postgres    false    224   *�       m          0    17530    tinh 
   TABLE DATA           ,   COPY public.tinh (id, ten_tinh) FROM stdin;
    public          postgres    false    226   ��       o          0    17535    tour 
   TABLE DATA           Q   COPY public.tour (id, ten_tour, id_loai_du_lich, gia_tien, dac_diem) FROM stdin;
    public          postgres    false    228   �       q          0    17543    vai_tro 
   TABLE DATA           2   COPY public.vai_tro (id, ten_vai_tro) FROM stdin;
    public          postgres    false    230   ݤ       �           0    0    dia_diem_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.dia_diem_id_seq', 1, false);
          public          postgres    false    201            �           0    0    dich_vu_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.dich_vu_id_seq', 1, false);
          public          postgres    false    203            �           0    0    doan_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.doan_id_seq', 1, false);
          public          postgres    false    205            �           0    0    khach_hang_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.khach_hang_id_seq', 5, true);
          public          postgres    false    213            �           0    0    khach_san_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.khach_san_id_seq', 5, true);
          public          postgres    false    215            �           0    0    loai_dich_vu_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.loai_dich_vu_id_seq', 5, true);
          public          postgres    false    217            �           0    0    loai_du_lich_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.loai_du_lich_id_seq', 7, true);
          public          postgres    false    219            �           0    0    nha_hang_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.nha_hang_id_seq', 5, true);
          public          postgres    false    221            �           0    0    nhan_vien_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.nhan_vien_id_seq', 7, true);
          public          postgres    false    223            �           0    0    phuong_tien_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.phuong_tien_id_seq', 5, true);
          public          postgres    false    225            �           0    0    tinh_id_seq    SEQUENCE SET     9   SELECT pg_catalog.setval('public.tinh_id_seq', 5, true);
          public          postgres    false    227            �           0    0    tour_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.tour_id_seq', 1, false);
          public          postgres    false    229            �           0    0    vai_tro_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.vai_tro_id_seq', 5, true);
          public          postgres    false    231            �           2606    17562    khach_hang UNIQUE_KHACH_HANG 
   CONSTRAINT     ^   ALTER TABLE ONLY public.khach_hang
    ADD CONSTRAINT "UNIQUE_KHACH_HANG" UNIQUE (cmnd, sdt);
 H   ALTER TABLE ONLY public.khach_hang DROP CONSTRAINT "UNIQUE_KHACH_HANG";
       public            postgres    false    212    212            �           2606    17564    nhan_vien UNIQUE_NHAN_VIEN 
   CONSTRAINT     V   ALTER TABLE ONLY public.nhan_vien
    ADD CONSTRAINT "UNIQUE_NHAN_VIEN" UNIQUE (sdt);
 F   ALTER TABLE ONLY public.nhan_vien DROP CONSTRAINT "UNIQUE_NHAN_VIEN";
       public            postgres    false    222            �           2606    17566    dia_diem dia_diem_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.dia_diem
    ADD CONSTRAINT dia_diem_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.dia_diem DROP CONSTRAINT dia_diem_pkey;
       public            postgres    false    200            �           2606    17568    dich_vu dich_vu_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.dich_vu
    ADD CONSTRAINT dich_vu_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.dich_vu DROP CONSTRAINT dich_vu_pkey;
       public            postgres    false    202            �           2606    17570    doan doan_pkey 
   CONSTRAINT     L   ALTER TABLE ONLY public.doan
    ADD CONSTRAINT doan_pkey PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.doan DROP CONSTRAINT doan_pkey;
       public            postgres    false    204            �           2606    17572 &   ds_dia_diem_tour ds_dia_diem_tour_pkey 
   CONSTRAINT     v   ALTER TABLE ONLY public.ds_dia_diem_tour
    ADD CONSTRAINT ds_dia_diem_tour_pkey PRIMARY KEY (id_tour, id_dia_diem);
 P   ALTER TABLE ONLY public.ds_dia_diem_tour DROP CONSTRAINT ds_dia_diem_tour_pkey;
       public            postgres    false    206    206            �           2606    17574 $   ds_dich_vu_doan ds_dich_vu_doan_pkey 
   CONSTRAINT     s   ALTER TABLE ONLY public.ds_dich_vu_doan
    ADD CONSTRAINT ds_dich_vu_doan_pkey PRIMARY KEY (id_doan, id_dich_vu);
 N   ALTER TABLE ONLY public.ds_dich_vu_doan DROP CONSTRAINT ds_dich_vu_doan_pkey;
       public            postgres    false    207    207            �           2606    17576     ds_khach_doan ds_khach_doan_pkey 
   CONSTRAINT     m   ALTER TABLE ONLY public.ds_khach_doan
    ADD CONSTRAINT ds_khach_doan_pkey PRIMARY KEY (id_doan, id_khach);
 J   ALTER TABLE ONLY public.ds_khach_doan DROP CONSTRAINT ds_khach_doan_pkey;
       public            postgres    false    208    208            �           2606    17578 (   ds_khach_san_doan ds_khach_san_doan_pkey 
   CONSTRAINT     y   ALTER TABLE ONLY public.ds_khach_san_doan
    ADD CONSTRAINT ds_khach_san_doan_pkey PRIMARY KEY (id_doan, id_khach_san);
 R   ALTER TABLE ONLY public.ds_khach_san_doan DROP CONSTRAINT ds_khach_san_doan_pkey;
       public            postgres    false    209    209            �           2606    17580 (   ds_nhan_vien_doan ds_nhan_vien_doan_pkey 
   CONSTRAINT     y   ALTER TABLE ONLY public.ds_nhan_vien_doan
    ADD CONSTRAINT ds_nhan_vien_doan_pkey PRIMARY KEY (id_nhan_vien, id_doan);
 R   ALTER TABLE ONLY public.ds_nhan_vien_doan DROP CONSTRAINT ds_nhan_vien_doan_pkey;
       public            postgres    false    210    210            �           2606    17582 ,   ds_phuong_tien_doan ds_phuong_tien_doan_pkey 
   CONSTRAINT        ALTER TABLE ONLY public.ds_phuong_tien_doan
    ADD CONSTRAINT ds_phuong_tien_doan_pkey PRIMARY KEY (id_phuong_tien, id_doan);
 V   ALTER TABLE ONLY public.ds_phuong_tien_doan DROP CONSTRAINT ds_phuong_tien_doan_pkey;
       public            postgres    false    211    211            �           2606    17584    khach_hang khach_hang_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.khach_hang
    ADD CONSTRAINT khach_hang_pkey PRIMARY KEY (id);
 D   ALTER TABLE ONLY public.khach_hang DROP CONSTRAINT khach_hang_pkey;
       public            postgres    false    212            �           2606    17586    khach_san khach_san_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.khach_san
    ADD CONSTRAINT khach_san_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.khach_san DROP CONSTRAINT khach_san_pkey;
       public            postgres    false    214            �           2606    17588    loai_dich_vu loai_dich_vu_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.loai_dich_vu
    ADD CONSTRAINT loai_dich_vu_pkey PRIMARY KEY (id);
 H   ALTER TABLE ONLY public.loai_dich_vu DROP CONSTRAINT loai_dich_vu_pkey;
       public            postgres    false    216            �           2606    17590    loai_du_lich loai_du_lich_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.loai_du_lich
    ADD CONSTRAINT loai_du_lich_pkey PRIMARY KEY (id);
 H   ALTER TABLE ONLY public.loai_du_lich DROP CONSTRAINT loai_du_lich_pkey;
       public            postgres    false    218            �           2606    17592    nha_hang nha_hang_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.nha_hang
    ADD CONSTRAINT nha_hang_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.nha_hang DROP CONSTRAINT nha_hang_pkey;
       public            postgres    false    220            �           2606    17594    nhan_vien nhan_vien_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.nhan_vien
    ADD CONSTRAINT nhan_vien_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.nhan_vien DROP CONSTRAINT nhan_vien_pkey;
       public            postgres    false    222            �           2606    17596    phuong_tien phuong_tien_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.phuong_tien
    ADD CONSTRAINT phuong_tien_pkey PRIMARY KEY (id);
 F   ALTER TABLE ONLY public.phuong_tien DROP CONSTRAINT phuong_tien_pkey;
       public            postgres    false    224            �           2606    17598    tinh tinh_pkey 
   CONSTRAINT     L   ALTER TABLE ONLY public.tinh
    ADD CONSTRAINT tinh_pkey PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.tinh DROP CONSTRAINT tinh_pkey;
       public            postgres    false    226            �           2606    17600    tour tour_pkey 
   CONSTRAINT     L   ALTER TABLE ONLY public.tour
    ADD CONSTRAINT tour_pkey PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.tour DROP CONSTRAINT tour_pkey;
       public            postgres    false    228            �           2606    17602    vai_tro vai_tro_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.vai_tro
    ADD CONSTRAINT vai_tro_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.vai_tro DROP CONSTRAINT vai_tro_pkey;
       public            postgres    false    230            �           2606    17603 $   ds_dia_diem_tour FK_CT_TOUR_DIA_DIEM    FK CONSTRAINT     �   ALTER TABLE ONLY public.ds_dia_diem_tour
    ADD CONSTRAINT "FK_CT_TOUR_DIA_DIEM" FOREIGN KEY (id_dia_diem) REFERENCES public.dia_diem(id);
 P   ALTER TABLE ONLY public.ds_dia_diem_tour DROP CONSTRAINT "FK_CT_TOUR_DIA_DIEM";
       public          postgres    false    206    2966    200            �           2606    17608 #   ds_dia_diem_tour FK_CT_TOUR_ID_TOUR    FK CONSTRAINT     �   ALTER TABLE ONLY public.ds_dia_diem_tour
    ADD CONSTRAINT "FK_CT_TOUR_ID_TOUR" FOREIGN KEY (id_tour) REFERENCES public.tour(id);
 O   ALTER TABLE ONLY public.ds_dia_diem_tour DROP CONSTRAINT "FK_CT_TOUR_ID_TOUR";
       public          postgres    false    228    3004    206            �           2606    17613    dia_diem FK_DIA_DIEM_ID_TINH    FK CONSTRAINT     |   ALTER TABLE ONLY public.dia_diem
    ADD CONSTRAINT "FK_DIA_DIEM_ID_TINH" FOREIGN KEY (id_tinh) REFERENCES public.tinh(id);
 H   ALTER TABLE ONLY public.dia_diem DROP CONSTRAINT "FK_DIA_DIEM_ID_TINH";
       public          postgres    false    200    3002    226            �           2606    17618    dich_vu FK_DICH_VU_LOAI_DV    FK CONSTRAINT     �   ALTER TABLE ONLY public.dich_vu
    ADD CONSTRAINT "FK_DICH_VU_LOAI_DV" FOREIGN KEY (id_loai_dich_vu) REFERENCES public.loai_dich_vu(id);
 F   ALTER TABLE ONLY public.dich_vu DROP CONSTRAINT "FK_DICH_VU_LOAI_DV";
       public          postgres    false    2990    202    216            �           2606    17623    dich_vu FK_DICH_VU_NHA_HANG    FK CONSTRAINT     �   ALTER TABLE ONLY public.dich_vu
    ADD CONSTRAINT "FK_DICH_VU_NHA_HANG" FOREIGN KEY (id_nha_hang) REFERENCES public.nha_hang(id);
 G   ALTER TABLE ONLY public.dich_vu DROP CONSTRAINT "FK_DICH_VU_NHA_HANG";
       public          postgres    false    220    2994    202            �           2606    17628    doan FK_DOAN_TOUR    FK CONSTRAINT     q   ALTER TABLE ONLY public.doan
    ADD CONSTRAINT "FK_DOAN_TOUR" FOREIGN KEY (id_tour) REFERENCES public.tour(id);
 =   ALTER TABLE ONLY public.doan DROP CONSTRAINT "FK_DOAN_TOUR";
       public          postgres    false    3004    228    204            �           2606    17633 *   ds_dich_vu_doan FK_DS_DICH_VU_DOAN_ID_DOAN    FK CONSTRAINT     �   ALTER TABLE ONLY public.ds_dich_vu_doan
    ADD CONSTRAINT "FK_DS_DICH_VU_DOAN_ID_DOAN" FOREIGN KEY (id_doan) REFERENCES public.doan(id);
 V   ALTER TABLE ONLY public.ds_dich_vu_doan DROP CONSTRAINT "FK_DS_DICH_VU_DOAN_ID_DOAN";
       public          postgres    false    207    2970    204            �           2606    17638 (   ds_dich_vu_doan FK_DS_DICH_VU_DOAN_ID_DV    FK CONSTRAINT     �   ALTER TABLE ONLY public.ds_dich_vu_doan
    ADD CONSTRAINT "FK_DS_DICH_VU_DOAN_ID_DV" FOREIGN KEY (id_dich_vu) REFERENCES public.dich_vu(id);
 T   ALTER TABLE ONLY public.ds_dich_vu_doan DROP CONSTRAINT "FK_DS_DICH_VU_DOAN_ID_DV";
       public          postgres    false    202    2968    207            �           2606    17643 &   ds_khach_doan FK_DS_DOAN_KHACH_ID_DOAN    FK CONSTRAINT     �   ALTER TABLE ONLY public.ds_khach_doan
    ADD CONSTRAINT "FK_DS_DOAN_KHACH_ID_DOAN" FOREIGN KEY (id_doan) REFERENCES public.doan(id);
 R   ALTER TABLE ONLY public.ds_khach_doan DROP CONSTRAINT "FK_DS_DOAN_KHACH_ID_DOAN";
       public          postgres    false    2970    208    204            �           2606    17648 '   ds_khach_doan FK_DS_DOAN_KHACH_ID_KHACH    FK CONSTRAINT     �   ALTER TABLE ONLY public.ds_khach_doan
    ADD CONSTRAINT "FK_DS_DOAN_KHACH_ID_KHACH" FOREIGN KEY (id_khach) REFERENCES public.khach_hang(id);
 S   ALTER TABLE ONLY public.ds_khach_doan DROP CONSTRAINT "FK_DS_DOAN_KHACH_ID_KHACH";
       public          postgres    false    212    208    2986            �           2606    17653 .   ds_khach_san_doan FK_DS_KHACH_SAN_DOAN_ID_DOAN    FK CONSTRAINT     �   ALTER TABLE ONLY public.ds_khach_san_doan
    ADD CONSTRAINT "FK_DS_KHACH_SAN_DOAN_ID_DOAN" FOREIGN KEY (id_doan) REFERENCES public.doan(id);
 Z   ALTER TABLE ONLY public.ds_khach_san_doan DROP CONSTRAINT "FK_DS_KHACH_SAN_DOAN_ID_DOAN";
       public          postgres    false    209    2970    204            �           2606    17658 ,   ds_khach_san_doan FK_DS_KHACH_SAN_DOAN_ID_KS    FK CONSTRAINT     �   ALTER TABLE ONLY public.ds_khach_san_doan
    ADD CONSTRAINT "FK_DS_KHACH_SAN_DOAN_ID_KS" FOREIGN KEY (id_khach_san) REFERENCES public.khach_san(id);
 X   ALTER TABLE ONLY public.ds_khach_san_doan DROP CONSTRAINT "FK_DS_KHACH_SAN_DOAN_ID_KS";
       public          postgres    false    2988    209    214            �           2606    17663 .   ds_nhan_vien_doan FK_DS_NHAN_VIEN_DOAN_ID_DOAN    FK CONSTRAINT     �   ALTER TABLE ONLY public.ds_nhan_vien_doan
    ADD CONSTRAINT "FK_DS_NHAN_VIEN_DOAN_ID_DOAN" FOREIGN KEY (id_doan) REFERENCES public.doan(id);
 Z   ALTER TABLE ONLY public.ds_nhan_vien_doan DROP CONSTRAINT "FK_DS_NHAN_VIEN_DOAN_ID_DOAN";
       public          postgres    false    2970    204    210            �           2606    17668 ,   ds_nhan_vien_doan FK_DS_NHAN_VIEN_DOAN_ID_NV    FK CONSTRAINT     �   ALTER TABLE ONLY public.ds_nhan_vien_doan
    ADD CONSTRAINT "FK_DS_NHAN_VIEN_DOAN_ID_NV" FOREIGN KEY (id_nhan_vien) REFERENCES public.nhan_vien(id);
 X   ALTER TABLE ONLY public.ds_nhan_vien_doan DROP CONSTRAINT "FK_DS_NHAN_VIEN_DOAN_ID_NV";
       public          postgres    false    210    2998    222            �           2606    17673 2   ds_phuong_tien_doan FK_DS_PHUONG_TIEN_DOAN_ID_DOAN    FK CONSTRAINT     �   ALTER TABLE ONLY public.ds_phuong_tien_doan
    ADD CONSTRAINT "FK_DS_PHUONG_TIEN_DOAN_ID_DOAN" FOREIGN KEY (id_doan) REFERENCES public.doan(id);
 ^   ALTER TABLE ONLY public.ds_phuong_tien_doan DROP CONSTRAINT "FK_DS_PHUONG_TIEN_DOAN_ID_DOAN";
       public          postgres    false    211    2970    204            �           2606    17678 0   ds_phuong_tien_doan FK_DS_PHUONG_TIEN_DOAN_ID_PT    FK CONSTRAINT     �   ALTER TABLE ONLY public.ds_phuong_tien_doan
    ADD CONSTRAINT "FK_DS_PHUONG_TIEN_DOAN_ID_PT" FOREIGN KEY (id_phuong_tien) REFERENCES public.phuong_tien(id);
 \   ALTER TABLE ONLY public.ds_phuong_tien_doan DROP CONSTRAINT "FK_DS_PHUONG_TIEN_DOAN_ID_PT";
       public          postgres    false    3000    211    224            �           2606    17683 !   nhan_vien FK_NHAN_VIEN_ID_VAI_TRO    FK CONSTRAINT     �   ALTER TABLE ONLY public.nhan_vien
    ADD CONSTRAINT "FK_NHAN_VIEN_ID_VAI_TRO" FOREIGN KEY (id_vai_tro) REFERENCES public.vai_tro(id) NOT VALID;
 M   ALTER TABLE ONLY public.nhan_vien DROP CONSTRAINT "FK_NHAN_VIEN_ID_VAI_TRO";
       public          postgres    false    222    230    3006            �           2606    17688    tour FK_TOUR_LOAI_DU_LICH    FK CONSTRAINT     �   ALTER TABLE ONLY public.tour
    ADD CONSTRAINT "FK_TOUR_LOAI_DU_LICH" FOREIGN KEY (id_loai_du_lich) REFERENCES public.loai_du_lich(id);
 E   ALTER TABLE ONLY public.tour DROP CONSTRAINT "FK_TOUR_LOAI_DU_LICH";
       public          postgres    false    228    218    2992            S   R  x�m��J1���S��®��u{(�K���^bIЦ�f���""�����""��K7�}���ӮHAOI�|��o&JB�/߼}�pVx{�A(M7�C76$�jH7�"�LHo����Ko/���3%��dOy;АI�>ӂ�K7Fo�}0��W���}��&��BZC�L�poo�o1謮w��AWhx�^��"L}���»�AeA���&\©��x�{;�2�Soc�uǄ��/q������9�>�l��f-�1b�8�1b���ԗcE��j~���'ZД��p���6A2�f
�:��N�/?5��J96�XAR��\V�qB�۔�oZ�î      U   y   x�32�t*MKK-Q(>�0/�ӈӐ��� ���`R%E�6$���R�p���'f�䁤8M �&�!wOUH�x�{e�Bqf^�B^��]kK��L8��L9�Lx�k{	X�t��)�D*F��� C.�      W     x�M��J�0���)��$�v�
¡�����(g+��Ip�F��fp���ț�o�7����>"!X6k�������,tp�9�����[�8�7��,c�Kss��B�1l_�h$�wܓո7݉qQ��=Zd3�S�.�5m����-t�t�qrQ1r�=RwS��{5ȃ�����Z\*;�B�i�0َ3��$9R�C�WTZb:��i?'I�q1�]F(�݌�������:��[y0 r;�F*�؉��I�u�      Y   ,   x�3�4�4�4�214�b. ��L�9����b�=... ��      Z   4   x���  �w;��Qwq�9D~��#����зc�'j�?�rw"�w�|6^	�      [   (   x�3�44�4�21RF\& �1���2�2�L�b���� ��      \   0   x�3�44�4�4�212L9��L@"&��\�F@�P�$�\1z\\\ ��/      ]   (   x�3�44�4�21RF\& �1���2�2�L�b���� ��      ^   (   x�3�44�4�21RF\& �1���2�2�L�b���� ��      _   �  x�u��N�@��ۧ�h����#jb�@$�bb��B�M�<y�x6Ao&� x�<,�{�8m)�n��;�7�YJZq�h�'E�%���E��D
Wx�q,�@��܃��+�+iC�v���Twl�gX���Щ�b+��Zd�W8�z9��z�q;�I'��L�p�@�,\�E(*�x���ln�7Å^��POА	�$v�N������9>Gzч:�%f5S�'(����U�S��|ΦI�<Q1�#G�\�
�=����T"e0xd�ά��b�?�Zmڇ\�g���Ś"��.���� ��	e�*���0���1�̎�[(?$��,�*��C$�8^܆"��xE ��73]c��=:Dt�{5˲����S      a   X  x�]P�NQ��~�|���"��M$Da���f�������hmaaL��0�Q��Ҹc1H�O�?q��nq��3sΙc0SEc�U�!�l�K�p���BC�}0
�˙���9��M@_]:�[�q�&��)l�_� �N�e��iiv,p�
�h(�R�f�p
�!�����ɏ�����eN�k��9�P�TT|����AȲ����������dk�1M�1{d=���9�u�ʖ�w�})8�=*� Yf}Q�UΊ����,��j���P�t7�����C'㫤K*��J-B����ʃ�o����r��I}
��v���C֝d(9��&�8,�[Q^�4M����\      c   �   x�3�t�<�89C����b����\����<����3��
%E�g��PT��P
�(=Ө�p�9O���3�y�\�(��/:�8O!9����3�y\&�.ww���^��ql��ݳ��R�Z�����EY���S�f<ܽ2h��M@����\1z\\\ j�S�      e   �   x�3�t)U�y��;9C!;���\� ���p��|��̇��s����@�⇻�*�*�i�S�8�9��I��]+sJ2�ޘ�e�$���TH9����y�\���* �gfr�!	� Q(9�+��I4=����#�/������ �eW�      g   C  x�e��J�@�ϛ�� �'b���)-��%�^B�ln�X�gD�x�ՃX<���1�o�l���aa�ۙ�7;[c�PsБ	|��!(V:�"Htvs�B��b�_�SET���Ll��l�j=?�/e���^�:��m���Y�"�*�3��鿜�T-�>vЦ�c�]��_�D/d��|R�U:{����5b���g���7ͨ�p�(������ҳY�O$"�F˫X�Բ\�}����Ŋ��z���M��Xj42R�Pr�q����8�'���V)��6����á��ޝ�7O���"���i��P��Oռ�˲>��5      i   �  x����N�0�g�)��*�c7�t��Q1uA�h2`Ai$:2 x �U��$c���߄�i��k���s�H��N�(5�����I�6/�O���)D�zw�]jz��~�c�M��ޤ&���&_����o�r�)!�����0���4]��A��m�r���mA�d�Il[�/Ի�C�Ka��.�-0Ƨ:�]7�း�y�$�1�)���1%��=B \�z�C!4��
8�^8��XΡ_,�0���pOr�͒�I���֚X�OP�pj�4Eг�NU��j�p*��
U�T��%/U=GU�Ѳb�he�a
jCp��	ʉ�#n����W�I�;DQuVY�?�C*u�|̼N��$|T����x(��IHYp����͊lR30��O�+��P����q~ <���      k   b   x�3��=��R!)����܄��� ��8#R�3/L��46�44�#	�rZ��EM@���6<�=7/]!�ᮍ��&���m\��䍌8�!�c���� �C)      m   [   x�3��>�9Y!��Hs^:�����
Aww'*�*�]���rxA)��%�O>���ed�闞�pw;�cb��qxa^����M�\1z\\\ >�      o   �   x�e���0Eg���-uUg�@�\ h"5:8;:188�`�tr%��G�D#oz�9�1�ܭL���u",��Q��4*r] ��Ԣ�7g!B��C;_�8|n�A`ypO��nQ�A�Pf��;b��Q'�Iy���\�G������c�4���.B�:�������i�����j��JV=B��
s�      q   [   x�3��9�0S�"�ˈ��؆��g�+�<ܵ:O�,��<.c΀����&+�I.ΐ��[�Jvw'g@՘r�d>�ݘ�PR�p��\�=... �E&{     