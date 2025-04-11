package com.example.mycity.data

import com.example.mycity.R
import com.example.mycity.model.RecommendationDetail

object RecommendationDetailsDataProvider {

    private val recommendationDetails = mapOf(
        Recommendations.RECOMMENDATION_ID_CAFE_01.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_CAFE_01.id,
            nameId = R.string.recommendation_name_cafe_01,
            score = 3.0F,
            price = "1000-2000",
            imgId = R.drawable.cafe_01,
            address = "〒356-0004 埼玉県ふじみ野市上福岡１丁目１４−２１",
            businessHours = "月曜日\t定休日\n" +
                    "火曜日\t6時30分～14時00分\n" +
                    "水曜日\t6時30分～14時00分\n" +
                    "木曜日\t定休日\n" +
                    "金曜日\t定休日\n" +
                    "土曜日\t8時30分～15時00分\n" +
                    "日曜日\t8時30分～15時00分"
        ),
        Recommendations.RECOMMENDATION_ID_CAFE_02.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_CAFE_02.id,
            nameId = R.string.recommendation_name_cafe_02,
            score = 3.5F,
            price = "1000-2000",
            imgId = R.drawable.cafe_02,
            address = "〒356-0004 埼玉県ふじみ野市上福岡６丁目１−２０ 大原ビル 101",
            businessHours = "月曜日\t定休日\n" +
                    "火曜日\t13時00分～18時00分\n" +
                    "水曜日\t13時00分～18時00分\n" +
                    "木曜日\t11時00分～20時00分\n" +
                    "金曜日\t11時00分～20時00分\n" +
                    "土曜日\t11時00分～20時00分\n" +
                    "日曜日\t11時00分～18時00分"
        ),
        Recommendations.RECOMMENDATION_ID_CAFE_03.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_CAFE_03.id,
            nameId = R.string.recommendation_name_cafe_03,
            score = 4.0F,
            price = "1000-2000",
            imgId = R.drawable.cafe_03,
            address = "〒356-0004 埼玉県ふじみ野市上福岡１丁目６−２６",
            businessHours = "月曜日\t7時30分～20時00分\n" +
                    "火曜日\t7時30分～20時00分\n" +
                    "水曜日\t7時30分～20時00分\n" +
                    "木曜日\t7時30分～20時00分\n" +
                    "金曜日\t7時30分～20時00分\n" +
                    "土曜日\t8時00分～20時00分\n" +
                    "日曜日\t8時00分～20時00分"
        ),
        Recommendations.RECOMMENDATION_ID_CAFE_04.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_CAFE_04.id,
            nameId = R.string.recommendation_name_cafe_04,
            score = 4.5F,
            price = "1000-2000",
            imgId = R.drawable.cafe_04,
            address = "〒356-0003 埼玉県ふじみ野市大原１丁目１−１１",
            businessHours = "月曜日\t17時00分～23時00分\n" +
                    "火曜日\t17時00分～23時00分\n" +
                    "水曜日\t17時00分～23時00分\n" +
                    "木曜日\t17時00分～23時00分\n" +
                    "金曜日\t17時00分～23時00分\n" +
                    "土曜日\t17時00分～23時00分\n" +
                    "日曜日\t17時00分～23時00分"
        ),
        Recommendations.RECOMMENDATION_ID_CAFE_05.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_CAFE_05.id,
            nameId = R.string.recommendation_name_cafe_05,
            score = 5.0F,
            price = "1000-2000",
            imgId = R.drawable.cafe_05,
            address = "〒356-0004 埼玉県ふじみ野市上福岡１丁目２−１６",
            businessHours = "月曜日\t定休日\n" +
                    "火曜日\t定休日\n" +
                    "水曜日\t9時00分～15時00分\n" +
                    "木曜日\t9時00分～15時00分\n" +
                    "金曜日\t9時00分～15時00分\n" +
                    "土曜日\t9時00分～15時00分\n" +
                    "日曜日\t9時00分～15時00分"
        ),
        Recommendations.RECOMMENDATION_ID_PARK_01.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_PARK_01.id,
            nameId = R.string.recommendation_name_park_01,
            score = 3.0F,
            price = "1000-2000",
            imgId = R.drawable.park_01,
            address = "〒356-0004 埼玉県ふじみ野市上福岡６丁目９−１１８８−２",
            businessHours = "月曜日\t24 時間営業\n" +
                    "火曜日\t24 時間営業\n" +
                    "水曜日\t24 時間営業\n" +
                    "木曜日\t24 時間営業\n" +
                    "金曜日\t24 時間営業\n" +
                    "土曜日\t24 時間営業\n" +
                    "日曜日\t24 時間営業"
        ),
        Recommendations.RECOMMENDATION_ID_PARK_02.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_PARK_02.id,
            nameId = R.string.recommendation_name_park_02,
            score = 3.5F,
            price = "1000-2000",
            imgId = R.drawable.park_02,
            address = "〒356-0006 埼玉県ふじみ野市霞ケ丘２丁目",
            businessHours = "月曜日\t24 時間営業\n" +
                    "火曜日\t24 時間営業\n" +
                    "水曜日\t24 時間営業\n" +
                    "木曜日\t24 時間営業\n" +
                    "金曜日\t24 時間営業\n" +
                    "土曜日\t24 時間営業\n" +
                    "日曜日\t24 時間営業"
        ),
        Recommendations.RECOMMENDATION_ID_PARK_03.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_PARK_03.id,
            nameId = R.string.recommendation_name_park_03,
            score = 4.0F,
            price = "1000-2000",
            imgId = R.drawable.park_03,
            address = "〒356-0004 埼玉県ふじみ野市上福岡３丁目１０−９",
            businessHours = "月曜日\t24 時間営業\n" +
                    "火曜日\t24 時間営業\n" +
                    "水曜日\t24 時間営業\n" +
                    "木曜日\t24 時間営業\n" +
                    "金曜日\t24 時間営業\n" +
                    "土曜日\t24 時間営業\n" +
                    "日曜日\t24 時間営業"
        ),
        Recommendations.RECOMMENDATION_ID_PARK_04.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_PARK_04.id,
            nameId = R.string.recommendation_name_park_04,
            score = 4.5F,
            price = "1000-2000",
            imgId = R.drawable.park_04,
            address = "〒356-0036 埼玉県ふじみ野市南台１丁目９",
            businessHours = "月曜日\t24 時間営業\n" +
                    "火曜日\t24 時間営業\n" +
                    "水曜日\t24 時間営業\n" +
                    "木曜日\t24 時間営業\n" +
                    "金曜日\t24 時間営業\n" +
                    "土曜日\t24 時間営業\n" +
                    "日曜日\t24 時間営業"
        ),
        Recommendations.RECOMMENDATION_ID_PARK_05.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_PARK_05.id,
            nameId = R.string.recommendation_name_park_05,
            score = 5.0F,
            price = "1000-2000",
            imgId = R.drawable.park_05,
            address = "〒356-0031 埼玉県ふじみ野市福岡中央２丁目２−２",
            businessHours = "月曜日\t24 時間営業\n" +
                    "火曜日\t24 時間営業\n" +
                    "水曜日\t24 時間営業\n" +
                    "木曜日\t24 時間営業\n" +
                    "金曜日\t24 時間営業\n" +
                    "土曜日\t24 時間営業\n" +
                    "日曜日\t24 時間営業"
        ),
        Recommendations.RECOMMENDATION_ID_RESTAURANT_01.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_RESTAURANT_01.id,
            nameId = R.string.recommendation_name_restaurant_01,
            score = 3.0F,
            price = "1000-2000",
            imgId = R.drawable.restaurant_01,
            address = "〒356-0004 埼玉県ふじみ野市上福岡３丁目７−１３",
            businessHours = "月曜日\t11時30分～14時00分, 17時30分～22時00分\n" +
                    "火曜日\t11時30分～14時00分, 17時30分～22時00分\n" +
                    "水曜日\t11時30分～14時00分, 17時30分～22時00分\n" +
                    "木曜日\t11時30分～14時00分, 17時30分～22時00分\n" +
                    "金曜日\t11時30分～14時00分, 17時30分～22時00分\n" +
                    "土曜日\t17時30分～22時00分\n" +
                    "日曜日\t定休日"
        ),
        Recommendations.RECOMMENDATION_ID_RESTAURANT_02.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_RESTAURANT_02.id,
            nameId = R.string.recommendation_name_restaurant_02,
            score = 3.5F,
            price = "1000-2000",
            imgId = R.drawable.restaurant_02,
            address = "〒356-0004 埼玉県ふじみ野市上福岡１丁目１０−２ エーデルビル 2階",
            businessHours = "月曜日\t17時00分～23時00分\n" +
                    "火曜日\t17時00分～23時00分\n" +
                    "水曜日\t17時00分～23時00分\n" +
                    "木曜日\t11時30分～13時30分, 17時00分～23時00分\n" +
                    "金曜日\t11時30分～13時30分, 17時00分～23時00分\n" +
                    "土曜日\t11時30分～13時30分, 17時00分～23時00分\n" +
                    "日曜日\t定休日"
        ),
        Recommendations.RECOMMENDATION_ID_RESTAURANT_03.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_RESTAURANT_03.id,
            nameId = R.string.recommendation_name_restaurant_03,
            score = 4.0F,
            price = "1000-2000",
            imgId = R.drawable.restaurant_03,
            address = "〒356-0003 埼玉県ふじみ野市大原１丁目２−１１",
            businessHours = "月曜日\t11時00分～14時00分, 17時00分～23時00分\n" +
                    "火曜日\t定休日\n" +
                    "水曜日\t17時00分～23時00分\n" +
                    "木曜日\t11時00分～14時00分, 17時00分～23時00分\n" +
                    "金曜日\t11時00分～14時00分, 17時00分～23時00分\n" +
                    "土曜日\t11時00分～14時00分, 17時00分～23時00分\n" +
                    "日曜日\t17時00分～23時00分"
        ),
        Recommendations.RECOMMENDATION_ID_RESTAURANT_04.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_RESTAURANT_04.id,
            nameId = R.string.recommendation_name_restaurant_04,
            score = 4.5F,
            price = "1000-2000",
            imgId = R.drawable.restaurant_04,
            address = "〒356-0004 埼玉県ふじみ野市上福岡１丁目６−２０",
            businessHours = "月曜日\t11時30分～14時30分, 17時00分～22時00分\n" +
                    "火曜日\t定休日\n" +
                    "水曜日\t11時30分～14時30分, 17時00分～22時00分\n" +
                    "木曜日\t11時30分～14時30分, 17時00分～22時00分\n" +
                    "金曜日\t11時30分～14時30分, 17時00分～22時00分\n" +
                    "土曜日\t11時30分～14時30分, 17時00分～22時00分\n" +
                    "日曜日\t11時30分～14時30分, 17時00分～22時00分"
        ),
        Recommendations.RECOMMENDATION_ID_RESTAURANT_05.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_RESTAURANT_05.id,
            nameId = R.string.recommendation_name_restaurant_05,
            score = 5.0F,
            price = "1000-2000",
            imgId = R.drawable.restaurant_05,
            address = "〒356-0004 埼玉県ふじみ野市上福岡１丁目２−１９",
            businessHours = "月曜日\t18時00分～23時00分\n" +
                    "火曜日\t18時00分～23時00分\n" +
                    "水曜日\t定休日\n" +
                    "木曜日\t11時00分～15時00分, 18時00分～23時00分\n" +
                    "金曜日\t11時00分～15時00分, 18時00分～23時00分\n" +
                    "土曜日\t11時00分～15時00分, 18時00分～23時00分\n" +
                    "日曜日\t定休日"
        ),
        Recommendations.RECOMMENDATION_ID_SHOPPING_CENTER_01.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_SHOPPING_CENTER_01.id,
            nameId = R.string.recommendation_name_shopping_center_01,
            score = 3.0F,
            price = "1000-2000",
            imgId = R.drawable.shopping_center_01,
            address = "〒356-0006 埼玉県ふじみ野市霞ケ丘１丁目２−３",
            businessHours = "月曜日\t9時00分～23時00分\n" +
                    "火曜日\t9時00分～23時00分\n" +
                    "水曜日\t9時00分～23時00分\n" +
                    "木曜日\t9時00分～23時00分\n" +
                    "金曜日\t9時00分～23時00分\n" +
                    "土曜日\t9時00分～23時00分\n" +
                    "日曜日\t9時00分～23時00分"
        ),
        Recommendations.RECOMMENDATION_ID_SHOPPING_CENTER_02.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_SHOPPING_CENTER_02.id,
            nameId = R.string.recommendation_name_shopping_center_02,
            score = 3.5F,
            price = "1000-2000",
            imgId = R.drawable.shopping_center_02,
            address = "〒356-0056 埼玉県ふじみ野市うれし野２丁目１０−８７",
            businessHours = "月曜日\t10時00分～20時00分\n" +
                    "火曜日\t10時00分～20時00分\n" +
                    "水曜日\t10時00分～20時00分\n" +
                    "木曜日\t10時00分～20時00分\n" +
                    "金曜日\t10時00分～20時00分\n" +
                    "土曜日\t10時00分～20時00分\n" +
                    "日曜日\t10時00分～20時00分"
        ),
        Recommendations.RECOMMENDATION_ID_SHOPPING_CENTER_03.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_SHOPPING_CENTER_03.id,
            nameId = R.string.recommendation_name_shopping_center_03,
            score = 4.0F,
            price = "1000-2000",
            imgId = R.drawable.shopping_center_03,
            address = "〒356-0044 埼玉県ふじみ野市西鶴ケ岡１丁目３−１５",
            businessHours = "月曜日\t6時30分～21時00分\n" +
                    "火曜日\t6時30分～21時00分\n" +
                    "水曜日\t6時30分～21時00分\n" +
                    "木曜日\t6時30分～21時00分\n" +
                    "金曜日\t6時30分～21時00分\n" +
                    "土曜日\t6時30分～21時00分\n" +
                    "日曜日\t6時30分～21時00分"
        ),
        Recommendations.RECOMMENDATION_ID_SHOPPING_CENTER_04.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_SHOPPING_CENTER_04.id,
            nameId = R.string.recommendation_name_shopping_center_04,
            score = 4.5F,
            price = "1000-2000",
            imgId = R.drawable.shopping_center_04,
            address = "〒356-0011 埼玉県ふじみ野市福岡２丁目１−６",
            businessHours = "月曜日\t8時00分～23時00分\n" +
                    "火曜日\t8時00分～23時00分\n" +
                    "水曜日\t8時00分～23時00分\n" +
                    "木曜日\t8時00分～23時00分\n" +
                    "金曜日\t8時00分～23時00分\n" +
                    "土曜日\t8時00分～23時00分\n" +
                    "日曜日\t8時00分～23時00分"
        ),
        Recommendations.RECOMMENDATION_ID_SHOPPING_CENTER_05.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_SHOPPING_CENTER_05.id,
            nameId = R.string.recommendation_name_shopping_center_05,
            score = 5.0F,
            price = "1000-2000",
            imgId = R.drawable.shopping_center_05,
            address = "〒354-0036 埼玉県富士見市ふじみ野東１丁目１−１",
            businessHours = "月曜日\t10時00分～23時00分\n" +
                    "火曜日\t10時00分～23時00分\n" +
                    "水曜日\t10時00分～23時00分\n" +
                    "木曜日\t10時00分～23時00分\n" +
                    "金曜日\t10時00分～23時00分\n" +
                    "土曜日\t10時00分～23時00分\n" +
                    "日曜日\t10時00分～23時00分"
        ),
        Recommendations.RECOMMENDATION_ID_BRINGING_CHILDREN_01.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_BRINGING_CHILDREN_01.id,
            nameId = R.string.recommendation_name_bringing_children_01,
            score = 3.0F,
            price = "1000-2000",
            imgId = R.drawable.bringing_children_01,
            address = "〒356-0011 埼玉県ふじみ野市福岡２丁目１−６ イオンタウンふじみ野 3F",
            businessHours = "月曜日\t10時00分～20時00分\n" +
                    "火曜日\t10時00分～20時00分\n" +
                    "水曜日\t10時00分～20時00分\n" +
                    "木曜日\t10時00分～20時00分\n" +
                    "金曜日\t10時00分～20時00分\n" +
                    "土曜日\t10時00分～20時00分\n" +
                    "日曜日\t10時00分～20時00分"
        ),
        Recommendations.RECOMMENDATION_ID_BRINGING_CHILDREN_02.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_BRINGING_CHILDREN_02.id,
            nameId = R.string.recommendation_name_bringing_children_02,
            score = 3.5F,
            price = "1000-2000",
            imgId = R.drawable.bringing_children_02,
            address = "〒356-0004 埼玉県ふじみ野市上福岡６丁目１−２０ 大原ビル 101",
            businessHours = "営業時間外 ⋅ 営業開始: 火 13:00"
        ),
        Recommendations.RECOMMENDATION_ID_BRINGING_CHILDREN_03.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_BRINGING_CHILDREN_03.id,
            nameId = R.string.recommendation_name_bringing_children_03,
            score = 4.0F,
            price = "1000-2000",
            imgId = R.drawable.bringing_children_03,
            address = "〒356-0011 埼玉県ふじみ野市福岡１丁目２−５",
            businessHours = "月曜日\t8時30分～21時30分\n" +
                    "火曜日\t8時30分～21時30分\n" +
                    "水曜日\t8時30分～21時30分\n" +
                    "木曜日\t8時30分～21時30分\n" +
                    "金曜日\t8時30分～21時30分\n" +
                    "土曜日\t8時30分～21時30分\n" +
                    "日曜日\t8時30分～21時30分"
        ),
        Recommendations.RECOMMENDATION_ID_BRINGING_CHILDREN_04.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_BRINGING_CHILDREN_04.id,
            nameId = R.string.recommendation_name_bringing_children_04,
            score = 4.5F,
            price = "1000-2000",
            imgId = R.drawable.bringing_children_04,
            address = "〒356-0011 埼玉県ふじみ野市福岡２丁目１−６",
            businessHours = "月曜日\t10時00分～21時00分\n" +
                    "火曜日\t10時00分～21時00分\n" +
                    "水曜日\t10時00分～21時00分\n" +
                    "木曜日\t10時00分～21時00分\n" +
                    "金曜日\t10時00分～21時00分\n" +
                    "土曜日\t10時00分～21時00分\n" +
                    "日曜日\t10時00分～21時00分"
        ),
        Recommendations.RECOMMENDATION_ID_BRINGING_CHILDREN_05.id to RecommendationDetail(
            id = Recommendations.RECOMMENDATION_ID_BRINGING_CHILDREN_05.id,
            nameId = R.string.recommendation_name_bringing_children_05,
            score = 5.0F,
            price = "1000-2000",
            imgId = R.drawable.bringing_children_05,
            address = "〒356-0017 埼玉県ふじみ野市上野台１丁目４",
            businessHours = "月曜日\t24 時間営業\n" +
                    "火曜日\t24 時間営業\n" +
                    "水曜日\t24 時間営業\n" +
                    "木曜日\t24 時間営業\n" +
                    "金曜日\t24 時間営業\n" +
                    "土曜日\t24 時間営業\n" +
                    "日曜日\t24 時間営業"
        )
    )

    fun getRecommendationDetailById(recommendationId: Int): RecommendationDetail? {
        return recommendationDetails[recommendationId]
    }
}