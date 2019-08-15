package com.ricknout.rugbyranker.prediction.vo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.UUID

@Parcelize
data class MatchPrediction(
    val id: String,
    val homeTeamId: Long,
    val homeTeamName: String,
    val homeTeamAbbreviation: String,
    val homeTeamScore: Int,
    val awayTeamId: Long,
    val awayTeamName: String,
    val awayTeamAbbreviation: String,
    val awayTeamScore: Int,
    val noHomeAdvantage: Boolean,
    val rugbyWorldCup: Boolean
) : Parcelable {

    companion object {
        const val NO_SCORE = -1
        fun generateId() = UUID.randomUUID().toString()
    }
}
