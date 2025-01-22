package com.arakadds.arak.model.new_mapping_refactore.response.banners.ads

import com.arakadds.arak.model.new_mapping_refactore.BaseResponse
import com.arakadds.arak.model.new_mapping_refactore.response.banners.ads.ad_reviews.AdReviewsData
import com.google.gson.annotations.SerializedName

data class AdReviewsModel(
    @SerializedName("data") val adReviewsdata: AdReviewsData
) : BaseResponse()
