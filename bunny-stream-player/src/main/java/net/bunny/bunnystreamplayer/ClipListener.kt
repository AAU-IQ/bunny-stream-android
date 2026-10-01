package net.bunny.bunnystreamplayer

/** Events of videos preloaded with [DefaultBunnyPlayer.preloadVideo], keyed by the caller's clip key. */
interface ClipListener {
    fun onClipReady(key: String)
    fun onClipFailed(key: String, message: String)
    fun onClipEnded(key: String)
    fun onClipSeeked(key: String, positionMs: Long)
    fun onSkipTapped(key: String)
}

/** Controls for the active clip: a non-seekable clip hides seeking and shows a skip button with [skipLabel]. */
data class ClipControls(val seekable: Boolean, val skipLabel: String?) {
    companion object {
        val FULL = ClipControls(seekable = true, skipLabel = null)
    }
}
