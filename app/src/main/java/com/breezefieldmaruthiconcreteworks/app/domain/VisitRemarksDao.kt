package com.breezefieldmaruthiconcreteworks.app.domain

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.breezefieldmaruthiconcreteworks.app.AppConstant

@Dao
interface VisitRemarksDao {

    @Query("SELECT * FROM " + AppConstant.VISIT_REMARKS_TABLE)
    fun getAll(): List<VisitRemarksEntity>

    @Insert
    fun insertAll(vararg visitRemarks: VisitRemarksEntity)

    @Query("DELETE FROM " + AppConstant.VISIT_REMARKS_TABLE)
    fun delete()
}