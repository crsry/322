package org.edx.mobile.model.iap

data class IAPFlowData(
    var upgradeMode: UpgradeMode = UpgradeMode.NORMAL,
    var productId: String = "",
    var basketId: Long = 0,
    var purchaseToken: String = "",
    var flowType: String = "",
    var screenName: String = "",
    var isVerificationPending: Boolean = false
) {
    fun clear() {
        upgradeMode = UpgradeMode.NORMAL
        productId = ""
        basketId = 0
        purchaseToken = ""
        isVerificationPending = false
        flowType = ""
        screenName = ""
    }

    enum class UpgradeMode {
        NORMAL,
        SILENT;

        fun isSilentMode() = this == SILENT
    }

    enum class IAPAction {
        SHOW_FULL_SCREEN_LOADER,
        PURCHASE_FLOW_COMPLETE
    }

    enum class IAPFlowType(flowType: String) {
        RESTORE("restore"),
        SILENT("silent"),
        USER_INITIATED("user_initiated");
    }
}
