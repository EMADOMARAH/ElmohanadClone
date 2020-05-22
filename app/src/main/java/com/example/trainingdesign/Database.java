package com.example.trainingdesign;

import com.example.trainingdesign.Models.Fe2atModel;
import com.example.trainingdesign.Models.CategoryModel;
import com.example.trainingdesign.Models.CollectionModel;
import com.example.trainingdesign.Models.StoreModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database
{
    public static List<CategoryModel> getCategories() {
        return new ArrayList<>(Arrays.asList(
                new CategoryModel("بطاقات إتصالات", R.drawable.bg_comm),
                new CategoryModel("بطاقات بيانات", R.drawable.bg_data),
                new CategoryModel("بطاقات آيتونز", R.drawable.bg_itunes),
                new CategoryModel("جوجل بلاي", R.drawable.bg_gplay),
                new CategoryModel("بطاقات العاب", R.drawable.bg_games),
                new CategoryModel("بطاقات خدمات", R.drawable.bg_services)
        ));
    }

    public static List<CollectionModel> getCommCollections() {
        return Arrays.asList(
                new CollectionModel("STC سوا", R.drawable.cv_comm_stc),
                new CollectionModel("Mobily موبايلي", R.drawable.cv_comm_mobily),
                new CollectionModel("Zain زين", R.drawable.cv_comm_zain),
                new CollectionModel("Lebara ليبارا", R.drawable.cv_comm_lebara),
                new CollectionModel("Virgin فيرجين", R.drawable.cv_comm_virgin),
                new CollectionModel("Friendi فريندي", R.drawable.cv_comm_friendi)
        );
    }

    public static List<CollectionModel> getDataCollections() {
        return Arrays.asList(
                new CollectionModel("STC سوا", R.drawable.cv_data_stc),
                new CollectionModel("Mobily موبايلي", R.drawable.cv_data_mobily),
                new CollectionModel("Zain زين", R.drawable.cv_data_zain),
                new CollectionModel("Lebara ليبارا", R.drawable.cv_data_lebara),
                new CollectionModel("Friendi فريندي", R.drawable.cv_data_friendi)
        );
    }

    public static List<CollectionModel> getGamesCollections() {
        return Arrays.asList(
                new CollectionModel("بلايستيشن", R.drawable.cv_games_playstation),
                new CollectionModel("اكس بوكس", R.drawable.cv_games_xbox),
                new CollectionModel("ستيم Steam", R.drawable.cv_games_steam)
        );
    }

    public static List<StoreModel> getStores() {
        return Arrays.asList(
                new StoreModel("المتجر السعودي", R.drawable.cv_store_saudi),
                new StoreModel("المتجر الامريكي", R.drawable.cv_store_america)
        );
    }

    public static List<Fe2atModel> getSTCCommCards() {
        return Arrays.asList(
                new Fe2atModel("سوا فئة 16 ريال", R.drawable.pp_stc, R.drawable.gd_stc, "16 ريال", 16, 0),
                new Fe2atModel("سوا فئة 21 ريال", R.drawable.pp_stc, R.drawable.gd_stc, "20 ريال", 21, 0),
                new Fe2atModel("سوا فئة 31.5 ريال", R.drawable.pp_stc, R.drawable.gd_stc, "30 ريال", 31, 0),
                new Fe2atModel("سوا فئة 52.5 ريال", R.drawable.pp_stc, R.drawable.gd_stc, "50 ريال", 52, 0),
                new Fe2atModel("سوا فئة 105 ريال", R.drawable.pp_stc, R.drawable.gd_stc, "100 ريال", 105, 0),
                new Fe2atModel("سوا فئة 210 ريال", R.drawable.pp_stc, R.drawable.gd_stc, "200 ريال", 210, 0),
                new Fe2atModel("سوا فئة 315 ريال", R.drawable.pp_stc, R.drawable.gd_stc, "300 ريال", 315, 0)
        );
    }

    public static List<Fe2atModel> getMobilyCommCards() {
        return Arrays.asList(
                new Fe2atModel("موبايلي فئة 15 ريال", R.drawable.pp_mobily, R.drawable.gd_mobily, "15 ريال", 15, 0),
                new Fe2atModel("موبايلي فئة 20 ريال", R.drawable.pp_mobily, R.drawable.gd_mobily, "20 ريال", 20, 0),
                new Fe2atModel("موبايلي فئة 30 ريال", R.drawable.pp_mobily, R.drawable.gd_mobily, "30 ريال", 30, 0),
                new Fe2atModel("موبايلي فئة 50 ريال", R.drawable.pp_mobily, R.drawable.gd_mobily, "50 ريال", 50, 0),
                new Fe2atModel("موبايلي فئة 100 ريال", R.drawable.pp_mobily, R.drawable.gd_mobily, "100 ريال", 100, 0),
                new Fe2atModel("موبايلي فئة 150 ريال", R.drawable.pp_mobily, R.drawable.gd_mobily, "150 ريال", 150, 0),
                new Fe2atModel("موبايلي فئة 300 ريال", R.drawable.pp_mobily, R.drawable.gd_mobily, "300 ريال", 300, 0)
        );
    }

    public static List<Fe2atModel> getZainCommCards() {
        return Arrays.asList(
                new Fe2atModel("زين فئة 15 ريال", R.drawable.pp_zain, R.drawable.gd_zain, "15 ريال", 15, 0),
                new Fe2atModel("زين فئة 20 ريال", R.drawable.pp_zain, R.drawable.gd_zain, "20 ريال", 20, 0),
                new Fe2atModel("زين فئة 50 ريال", R.drawable.pp_zain, R.drawable.gd_zain, "50 ريال", 50, 0),
                new Fe2atModel("زين فئة 100 ريال", R.drawable.pp_zain, R.drawable.gd_zain, "100 ريال", 100, 0),
                new Fe2atModel("زين فئة 300 ريال", R.drawable.pp_zain, R.drawable.gd_zain, "300 ريال", 300, 0)
        );
    }

    public static List<Fe2atModel> getLebaraCommCards() {
        return Arrays.asList(
                new Fe2atModel("ليبارا فئة 15 ريال", R.drawable.pp_lebara, R.drawable.gd_lebara, "15 ريال", 15, 0),
                new Fe2atModel("ليبارا فئة 21 ريال", R.drawable.pp_lebara, R.drawable.gd_lebara, "20 ريال", 21, 0),
                new Fe2atModel("ليبارا فئة 53 ريال", R.drawable.pp_lebara, R.drawable.gd_lebara, "50 ريال", 53, 0),
                new Fe2atModel("ليبارا فئة 105 ريال", R.drawable.pp_lebara, R.drawable.gd_lebara, "100 ريال", 105, 0)
        );
    }

    public static List<Fe2atModel> getVirginCommCards() {
        return Arrays.asList(
                new Fe2atModel("فيرجين فئة 10 ريال", R.drawable.pp_virgin, R.drawable.gd_virgin, "10 ريال", 10, 0),
                new Fe2atModel("فيرجين فئة 15 ريال", R.drawable.pp_virgin, R.drawable.gd_virgin, "15 ريال", 15, 0),
                new Fe2atModel("فيرجين فئة 20 ريال", R.drawable.pp_virgin, R.drawable.gd_virgin, "20 ريال", 20, 0),
                new Fe2atModel("فيرجين فئة 30 ريال", R.drawable.pp_virgin, R.drawable.gd_virgin, "30 ريال", 30, 0),
                new Fe2atModel("فيرجين فئة 50 ريال", R.drawable.pp_virgin, R.drawable.gd_virgin, "50 ريال", 50, 0),
                new Fe2atModel("فيرجين فئة 100 ريال", R.drawable.pp_virgin, R.drawable.gd_virgin, "100 ريال", 100, 0)
        );
    }

    public static List<Fe2atModel> getFriendiCommCards() {
        return Arrays.asList(
                new Fe2atModel("فريندي فئة 10 ريال", R.drawable.pp_friendi, R.drawable.gd_friendi, "10 ريال", 10, 0),
                new Fe2atModel("فريندي فئة 15 ريال", R.drawable.pp_friendi, R.drawable.gd_friendi, "15 ريال", 15, 0),
                new Fe2atModel("فريندي فئة 20 ريال", R.drawable.pp_friendi, R.drawable.gd_friendi, "20 ريال", 20, 0),
                new Fe2atModel("فريندي فئة 30 ريال", R.drawable.pp_friendi, R.drawable.gd_friendi, "30 ريال", 30, 0),
                new Fe2atModel("فريندي فئة 50 ريال", R.drawable.pp_friendi, R.drawable.gd_friendi, "50 ريال", 50, 0),
                new Fe2atModel("فريندي فئة 100 ريال", R.drawable.pp_friendi, R.drawable.gd_friendi, "100 ريال", 100, 0)
        );
    }

    public static List<Fe2atModel> getSTCDataCards() {
        return Arrays.asList(
                new Fe2atModel("كويك نتQuicknet\n", R.drawable.pp_stc, R.drawable.gd_stc, "10 جيجا لمدة شهر", 116, 0),
                new Fe2atModel("كويك نتQuicknet\n", R.drawable.pp_stc, R.drawable.gd_stc, "10 جيجا لمدة شهرين", 163, 0),
                new Fe2atModel("كويك نتQuicknet\n", R.drawable.pp_stc, R.drawable.gd_stc, "10 جيجا لمدة 3 أشهر", 188, 0),
                new Fe2atModel("كويك نتQuicknet\n", R.drawable.pp_stc, R.drawable.gd_stc, "50 جيجا لمدة شهرين", 236, 0),
                new Fe2atModel("كويك نتQuicknet\n", R.drawable.pp_stc, R.drawable.gd_stc, "100 جيجا لمدة 3 أشهر", 327, 0),
                new Fe2atModel("كويك نتQuicknet\n", R.drawable.pp_stc, R.drawable.gd_stc, "300 جيجا لمدة 3 أشهر", 492, 0),
                new Fe2atModel("كويك نتQuicknet\n", R.drawable.pp_stc, R.drawable.gd_stc, "انترنت لا محدود لمدة شهر", 328, 0)
        );
    }

    public static List<Fe2atModel> getMobilyDataCards() {
        return Arrays.asList(
                new Fe2atModel("موبايلي\nانترنت", R.drawable.pp_mobily, R.drawable.gd_mobily, "5 جيجا لمدة شهر", 90, 0),
                new Fe2atModel("موبايلي\nانترنت", R.drawable.pp_mobily, R.drawable.gd_mobily, "10 جيجا لمدة شهر", 110, 0),
                new Fe2atModel("موبايلي\nانترنت", R.drawable.pp_mobily, R.drawable.gd_mobily, "10 جيجا لمدة 3 أشهر", 175, 0),
                new Fe2atModel("موبايلي\nانترنت", R.drawable.pp_mobily, R.drawable.gd_mobily, "10 جيجا لمدة 3 أشهر", 230, 0),
                new Fe2atModel("موبايلي\nانترنت", R.drawable.pp_mobily, R.drawable.gd_mobily, "50 جيجا لمدة شهرين", 250, 0),
                new Fe2atModel("موبايلي\nانترنت", R.drawable.pp_mobily, R.drawable.gd_mobily, "50 جيجا لمدة 3 أشهر", 275, 0),
                new Fe2atModel("موبايلي\nانترنت", R.drawable.pp_mobily, R.drawable.gd_mobily, "100 جيجا لمدة 3 أشهر", 330, 0),
                new Fe2atModel("موبايلي\nانترنت", R.drawable.pp_mobily, R.drawable.gd_mobily, "300 جيجا لمدة 3 أشهر", 450, 0)
        );
    }

    public static List<Fe2atModel> getZainDataCards() {
        return Arrays.asList(
                new Fe2atModel("زين انترنتZain\n", R.drawable.pp_zain, R.drawable.gd_zain, "1 جيجا لمدة شهر", 30, 0),
                new Fe2atModel("زين انترنتZain\n", R.drawable.pp_zain, R.drawable.gd_zain, "2 جيجا لمدة شهر", 50, 0),
                new Fe2atModel("زين انترنتZain\n", R.drawable.pp_zain, R.drawable.gd_zain, "5 جيجا لمدة شهر", 80, 0),
                new Fe2atModel("زين انترنتZain\n", R.drawable.pp_zain, R.drawable.gd_zain, "10 جيجا لمدة شهر", 100, 0),
                new Fe2atModel("زين انترنتZain\n", R.drawable.pp_zain, R.drawable.gd_zain, "10 جيجا لمدة 3 أشهر", 175, 0),
                new Fe2atModel("زين انترنتZain\n", R.drawable.pp_zain, R.drawable.gd_zain, "20 جيجا لمدة 3 أشهر", 230, 0),
                new Fe2atModel("زين انترنتZain\n", R.drawable.pp_zain, R.drawable.gd_zain, "50 جيجا لمدة 3 أشهر", 280, 0),
                new Fe2atModel("زين انترنتZain\n", R.drawable.pp_zain, R.drawable.gd_zain, "100 جيجا لمدة شهر", 168, 0),
                new Fe2atModel("زين انترنتZain\n", R.drawable.pp_zain, R.drawable.gd_zain, "100 جيجا لمدة 3 أشهر", 335, 0),
                new Fe2atModel("زين انترنتZain\n", R.drawable.pp_zain, R.drawable.gd_zain, "150 جيجا لمدة 3 أشهر", 380, 0),
                new Fe2atModel("زين انترنتZain\n", R.drawable.pp_zain, R.drawable.gd_zain, "300 جيجا لمدة 3 أشهر", 450, 0),
                new Fe2atModel("زين انترنتZain\n", R.drawable.pp_zain, R.drawable.gd_zain, "انترنت لا محدود لمدة شهر", 341, 0)
        );
    }

    public static List<Fe2atModel> getLebaraDataCards() {
        return Arrays.asList(
                new Fe2atModel("ليبارا انترنتLebara\n", R.drawable.pp_lebara, R.drawable.gd_lebara, "1 جيجا لمدة شهر", 26, 0),
                new Fe2atModel("ليبارا انترنتLebara\n", R.drawable.pp_lebara, R.drawable.gd_lebara, "3 جيجا لمدة شهر", 56, 0),
                new Fe2atModel("ليبارا انترنتLebara\n", R.drawable.pp_lebara, R.drawable.gd_lebara, "10 جيجا لمدة 3 أشهر", 125, 0)
        );
    }

    public static List<Fe2atModel> getFriendiDataCards() {
        return Arrays.asList(
                new Fe2atModel("فريندي\nانترنت", R.drawable.pp_friendi, R.drawable.gd_friendi, "3 جيجا لمدة شهر", 48, 0),
                new Fe2atModel("فريندي\nانترنت", R.drawable.pp_friendi, R.drawable.gd_friendi, "5 جيجا لمدة شهر", 64, 0),
                new Fe2atModel("فريندي\nانترنت", R.drawable.pp_friendi, R.drawable.gd_friendi, "8 جيجا لمدة شهر", 95, 0),
                new Fe2atModel("فريندي\nانترنت", R.drawable.pp_friendi, R.drawable.gd_friendi, "10 جيجا لمدة شهر", 100, 0),
                new Fe2atModel("فريندي\nانترنت", R.drawable.pp_friendi, R.drawable.gd_friendi, "10 جيجا لمدة 3 أشهر", 115, 0),
                new Fe2atModel("فريندي\nانترنت", R.drawable.pp_friendi, R.drawable.gd_friendi, "20 جيجا لمدة 3 أشهر", 198, 0),
                new Fe2atModel("فريندي\nانترنت", R.drawable.pp_friendi, R.drawable.gd_friendi, "50 جيجا لمدة 3 أشهر", 275, 0)
        );
    }

    public static List<Fe2atModel> getSaudiItunesCards() {
        return Arrays.asList(
                new Fe2atModel("آيتونزiTunes\n", R.drawable.pp_itunes, R.drawable.gd_itunes, "50 ريال", 50, R.drawable.cv_store_saudi),
                new Fe2atModel("آيتونزiTunes\n", R.drawable.pp_itunes, R.drawable.gd_itunes, "60 ريال", 60, R.drawable.cv_store_saudi),
                new Fe2atModel("آيتونزiTunes\n", R.drawable.pp_itunes, R.drawable.gd_itunes, "70 ريال", 70, R.drawable.cv_store_saudi),
                new Fe2atModel("آيتونزiTunes\n", R.drawable.pp_itunes, R.drawable.gd_itunes, "100 ريال", 100, R.drawable.cv_store_saudi),
                new Fe2atModel("آيتونزiTunes\n", R.drawable.pp_itunes, R.drawable.gd_itunes, "250 ريال", 250, R.drawable.cv_store_saudi),
                new Fe2atModel("آيتونزiTunes\n", R.drawable.pp_itunes, R.drawable.gd_itunes, "500 ريال", 500, R.drawable.cv_store_saudi)
        );
    }

    public static List<Fe2atModel> getAmericanItunesCards() {
        return Arrays.asList(
                new Fe2atModel("آيتونزiTunes\n", R.drawable.pp_itunes, R.drawable.gd_itunes, "10 دولار", 40, R.drawable.cv_store_america),
                new Fe2atModel("آيتونزiTunes\n", R.drawable.pp_itunes, R.drawable.gd_itunes, "15 دولار", 60, R.drawable.cv_store_america),
                new Fe2atModel("آيتونزiTunes\n", R.drawable.pp_itunes, R.drawable.gd_itunes, "20 دولار", 79, R.drawable.cv_store_america),
                new Fe2atModel("آيتونزiTunes\n", R.drawable.pp_itunes, R.drawable.gd_itunes, "25 دولار", 100, R.drawable.cv_store_america),
                new Fe2atModel("آيتونزiTunes\n", R.drawable.pp_itunes, R.drawable.gd_itunes, "50 دولار", 195, R.drawable.cv_store_america),
                new Fe2atModel("آيتونزiTunes\n", R.drawable.pp_itunes, R.drawable.gd_itunes, "100 دولار", 380, R.drawable.cv_store_america)
        );
    }

    public static List<Fe2atModel> getGooglePlayCards() {
        return Arrays.asList(
                new Fe2atModel("جوجلGoogle\n", R.drawable.pp_gplay, R.drawable.gd_gplay, "20 ريال", 20, R.drawable.cv_store_saudi),
                new Fe2atModel("جوجلGoogle\n", R.drawable.pp_gplay, R.drawable.gd_gplay, "50 ريال", 50, R.drawable.cv_store_saudi),
                new Fe2atModel("جوجلGoogle\n", R.drawable.pp_gplay, R.drawable.gd_gplay, "100 ريال", 100, R.drawable.cv_store_saudi),
                new Fe2atModel("جوجلGoogle\n", R.drawable.pp_gplay, R.drawable.gd_gplay, "300 ريال", 300, R.drawable.cv_store_saudi),
                new Fe2atModel("جوجلGoogle\n", R.drawable.pp_gplay, R.drawable.gd_gplay, "400 ريال", 400, R.drawable.cv_store_saudi)
        );
    }

    public static List<Fe2atModel> getSaudiPlaystationCards() {
        return Arrays.asList(
                new Fe2atModel("بلاي\nستيشن", R.drawable.pp_playstation, R.drawable.gd_playstation, "5 دولار", 22, R.drawable.cv_store_saudi),
                new Fe2atModel("بلاي\nستيشن", R.drawable.pp_playstation, R.drawable.gd_playstation, "10 دولار", 40, R.drawable.cv_store_saudi),
                new Fe2atModel("بلاي\nستيشن", R.drawable.pp_playstation, R.drawable.gd_playstation, "15 دولار", 60, R.drawable.cv_store_saudi),
                new Fe2atModel("بلاي\nستيشن", R.drawable.pp_playstation, R.drawable.gd_playstation, "20 دولار", 80, R.drawable.cv_store_saudi),
                new Fe2atModel("بلاي\nستيشن", R.drawable.pp_playstation, R.drawable.gd_playstation, "30 دولار", 118, R.drawable.cv_store_saudi),
                new Fe2atModel("بلاي\nستيشن", R.drawable.pp_playstation, R.drawable.gd_playstation, "40 دولار", 156, R.drawable.cv_store_saudi),
                new Fe2atModel("بلاي\nستيشن", R.drawable.pp_playstation, R.drawable.gd_playstation, "45 دولار", 175, R.drawable.cv_store_saudi),
                new Fe2atModel("بلاي\nستيشن", R.drawable.pp_playstation, R.drawable.gd_playstation, "50 دولار", 195, R.drawable.cv_store_saudi),
                new Fe2atModel("بلاي\nستيشن", R.drawable.pp_playstation, R.drawable.gd_playstation, "60 دولار", 232, R.drawable.cv_store_saudi),
                new Fe2atModel("بلاي\nستيشن", R.drawable.pp_playstation, R.drawable.gd_playstation, "70 دولار", 270, R.drawable.cv_store_saudi),
                new Fe2atModel("بلاي\nستيشن", R.drawable.pp_playstation, R.drawable.gd_playstation, "اشتراك 3 أشهر", 105, R.drawable.cv_store_saudi),
                new Fe2atModel("بلاي\nستيشن", R.drawable.pp_playstation, R.drawable.gd_playstation, "اشتراك 12 أشهر", 248, R.drawable.cv_store_saudi)
        );
    }

    public static List<Fe2atModel> getAmericanPlaystationCards() {
        return Arrays.asList(
                new Fe2atModel("بلاي\nستيشن", R.drawable.pp_playstation, R.drawable.gd_playstation, "10 دولار", 42, R.drawable.cv_store_america),
                new Fe2atModel("بلاي\nستيشن", R.drawable.pp_playstation, R.drawable.gd_playstation, "20 دولار", 82, R.drawable.cv_store_america),
                new Fe2atModel("بلاي\nستيشن", R.drawable.pp_playstation, R.drawable.gd_playstation, "50 دولار", 190, R.drawable.cv_store_america),
                new Fe2atModel("بلاي\nستيشن", R.drawable.pp_playstation, R.drawable.gd_playstation, "اشتراك 3 أشهر", 100, R.drawable.cv_store_america),
                new Fe2atModel("بلاي\nستيشن", R.drawable.pp_playstation, R.drawable.gd_playstation, "اشتراك 12 أشهر", 225, R.drawable.cv_store_america)
        );
    }

    public static List<Fe2atModel> getXboxCards() {
        return Arrays.asList(
                new Fe2atModel("اكس\nبوكس", R.drawable.pp_xbox, R.drawable.gd_xbox, "25 دولار", 115, R.drawable.cv_store_america),
                new Fe2atModel("اكس\nبوكس", R.drawable.pp_xbox, R.drawable.gd_xbox, "50 دولار", 225, R.drawable.cv_store_america),
                new Fe2atModel("اكس\nبوكس", R.drawable.pp_xbox, R.drawable.gd_xbox, "اشتراك شهر", 40, R.drawable.cv_store_america),
                new Fe2atModel("اكس\nبوكس", R.drawable.pp_xbox, R.drawable.gd_xbox, "اشتراك 3 أشهر", 110, R.drawable.cv_store_america),
                new Fe2atModel("اكس\nبوكس", R.drawable.pp_xbox, R.drawable.gd_xbox, "اشتراك 12 أشهر", 210, R.drawable.cv_store_america)
        );
    }

    public static List<Fe2atModel> getSteamCards() {
        return Arrays.asList(
                new Fe2atModel("ستيم\nSteam", R.drawable.pp_steam, R.drawable.gd_steam, "20 دولار", 88, R.drawable.cv_store_america),
                new Fe2atModel("ستيم\nSteam", R.drawable.pp_steam, R.drawable.gd_steam, "50 دولار", 225, R.drawable.cv_store_america),
                new Fe2atModel("ستيم\nSteam", R.drawable.pp_steam, R.drawable.gd_steam, "100 دولار", 440, R.drawable.cv_store_america)
        );
    }

    public static List<Fe2atModel> getServicesCards() {
        return Arrays.asList(
                new Fe2atModel("أمازونAmazon\n", R.drawable.pp_amazon, R.drawable.gd_amazon, "25 دولار", 105, R.drawable.cv_store_america),
                new Fe2atModel("أمازونAmazon\n", R.drawable.pp_amazon, R.drawable.gd_amazon, "50 دولار", 210, R.drawable.cv_store_america),
                new Fe2atModel("كاش يوCash U\n", R.drawable.pp_cashu, R.drawable.gd_cashu, "500 نقطة-10 دولار", 47, 0),
                new Fe2atModel("كاش يوCash U\n", R.drawable.pp_cashu, R.drawable.gd_cashu, "150 نقطة-30 دولار", 140, 0),
                new Fe2atModel("كاش يوCash U\n", R.drawable.pp_cashu, R.drawable.gd_cashu, "250 نقطة-50 دولار", 225, 0),
                new Fe2atModel("كاش يوCash U\n", R.drawable.pp_cashu, R.drawable.gd_cashu, "500 نقطة-100 دولار", 430, 0),
                new Fe2atModel("بطاقة\nكريم", R.drawable.pp_careem, R.drawable.gd_careem, "130 ريال", 130, 0),
                new Fe2atModel("بطاقة\nكريم", R.drawable.pp_careem, R.drawable.gd_careem, "360 ريال", 360, 0)
        );
    }
}
