package io.github.seoj17.canyongg.ui.detail.analysisTab.pages

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import io.github.seoj17.canyongg.ui.detail.analysisTab.pages.damaged.TeamDamagedViewHolder
import io.github.seoj17.canyongg.ui.detail.analysisTab.pages.dealt.TeamDealtViewHolder
import io.github.seoj17.canyongg.ui.detail.analysisTab.pages.gold.TeamGoldViewHolder
import io.github.seoj17.canyongg.ui.detail.analysisTab.pages.kill.TeamKillsViewHolder
import io.github.seoj17.canyongg.ui.detail.analysisTab.pages.minion.TeamMinionsViewHolder
import io.github.seoj17.canyongg.ui.detail.analysisTab.pages.vision.TeamVisionScoreViewHolder
import io.github.seoj17.canyongg.ui.model.SummonerMatchRecord

class AnalysisPageListAdapter(
    private val pageType: Int,
) : ListAdapter<SummonerMatchRecord, RecyclerView.ViewHolder>(SummonerMatchRecord.diffUtil) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): RecyclerView.ViewHolder {
        return when (pageType) {
            0 -> TeamKillsViewHolder(parent)
            1 -> TeamDealtViewHolder(parent)
            2 -> TeamGoldViewHolder(parent)
            3 -> TeamDamagedViewHolder(parent)
            4 -> TeamVisionScoreViewHolder(parent)
            5 -> TeamMinionsViewHolder(parent)
            else -> throw Exception("no page")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val dataSet = getItem(position) ?: return
        when (holder) {
            is TeamKillsViewHolder -> {
                holder.bind(
                    dataSet,
                    currentList.maxOf { it.kill },
                )
            }
            is TeamDealtViewHolder -> {
                holder.bind(
                    dataSet,
                    currentList.maxOf { it.totalDealt },
                )
            }
            is TeamGoldViewHolder -> {
                holder.bind(
                    dataSet,
                    currentList.maxOf { it.spentGold },
                )
            }
            is TeamDamagedViewHolder -> {
                holder.bind(
                    dataSet,
                    currentList.maxOf { it.totalDamaged },
                )
            }
            is TeamVisionScoreViewHolder -> {
                holder.bind(
                    dataSet,
                    currentList.maxOf { it.visionScore },
                )
            }
            is TeamMinionsViewHolder -> {
                holder.bind(
                    dataSet,
                    currentList.maxOf { it.minions },
                )
            }
        }
    }
}