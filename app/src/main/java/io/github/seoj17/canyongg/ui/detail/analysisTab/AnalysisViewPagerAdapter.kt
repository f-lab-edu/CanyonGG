package io.github.seoj17.canyongg.ui.detail.analysisTab

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import io.github.seoj17.canyongg.ui.detail.analysisTab.pages.damaged.TeamDamagedFragment
import io.github.seoj17.canyongg.ui.detail.analysisTab.pages.dealt.TeamDealtFragment
import io.github.seoj17.canyongg.ui.detail.analysisTab.pages.gold.TeamGoldFragment
import io.github.seoj17.canyongg.ui.detail.analysisTab.pages.kill.TeamKillsFragment
import io.github.seoj17.canyongg.ui.detail.analysisTab.pages.minion.TeamMinionFragment
import io.github.seoj17.canyongg.ui.detail.analysisTab.pages.vision.TeamVisionScoreFragment


class AnalysisViewPagerAdapter(
    fragment: Fragment,
    matchId: String,
) : FragmentStateAdapter(fragment) {

    private val tabs: List<Fragment> = listOf(
        TeamKillsFragment.newInstance(matchId),
        TeamDealtFragment.newInstance(matchId),
        TeamDamagedFragment.newInstance(matchId),
        TeamGoldFragment.newInstance(matchId),
        TeamMinionFragment.newInstance(matchId),
        TeamVisionScoreFragment.newInstance(matchId),
    )

    override fun getItemCount(): Int = tabs.size

    override fun createFragment(position: Int): Fragment = tabs[position]

}