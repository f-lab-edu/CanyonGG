package io.github.seoj17.canyongg.data.model

import io.github.seoj17.canyongg.data.remote.response.match.Info
import io.github.seoj17.canyongg.data.remote.response.match.MatchInfoResponse
import io.github.seoj17.canyongg.data.remote.response.match.Metadata

data class MatchInfoDataModel(
    val info: Info,
    val metadata: Metadata,
) {
    companion object {
        operator fun invoke(response: MatchInfoResponse): MatchInfoDataModel {
            return MatchInfoDataModel(
                info = response.info,
                metadata = response.metadata,
            )
        }
    }
}