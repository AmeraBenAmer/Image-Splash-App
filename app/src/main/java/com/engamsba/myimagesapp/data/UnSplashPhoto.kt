package com.engamsba.myimagesapp.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class UnSplashPhoto (
    val id :String,
    val description: String?,
    val urls: PhotoUrls,
    val user: UnsplashUser
):Parcelable{

    @Parcelize
    data class PhotoUrls(
        val raw:String,
        val full: String,
        val regular: String,
        val small: String,
        val thumb: String

    ):Parcelable

    @Parcelize
    data class UnsplashUser(
        val name:String,
        val username: String
    
    ):Parcelable{
        val attributionUrl get() = "https://unsplash.com/$username?utm_source=MyImageApp&utm_medium=referral"
    }
}