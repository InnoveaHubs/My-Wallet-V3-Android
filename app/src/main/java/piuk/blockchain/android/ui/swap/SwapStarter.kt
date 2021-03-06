package piuk.blockchain.android.ui.swap

import android.content.Context
import com.blockchain.activities.StartSwap
import piuk.blockchain.android.ui.swap.homebrew.exchange.host.HomebrewNavHostActivity
import piuk.blockchain.androidcore.utils.PersistentPrefs

class SwapStarter(private val prefs: PersistentPrefs) : StartSwap {
    override fun startSwapActivity(context: Any) {
        HomebrewNavHostActivity.start(context as Context, prefs.selectedFiatCurrency)
    }
}