package com.breezefieldmaruthiconcreteworks.app.domain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.breezefieldmaruthiconcreteworks.app.AppConstant

@Entity(tableName = AppConstant.SHOP_AUDIO)
data class ShopAudioEntity(
    @PrimaryKey(autoGenerate = true) var sl_no: Int = 0,
    @ColumnInfo var shop_id:String = "",
    @ColumnInfo var audio_path:String = "",
    @ColumnInfo var isUploaded:Boolean = false,
    @ColumnInfo var datetime:String = "",
    @ColumnInfo var revisitYN:String = "0"

)