package info.nightscout.androidaps.historyBrowser

import dagger.android.HasAndroidInjector
import info.nightscout.androidaps.logging.AAPSLogger
import info.nightscout.androidaps.plugins.bus.RxBusWrapper
import info.nightscout.androidaps.plugins.configBuilder.ConfigBuilderPlugin
import info.nightscout.androidaps.plugins.configBuilder.ProfileFunction
import info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin
import info.nightscout.androidaps.plugins.sensitivity.SensitivityAAPSPlugin
import info.nightscout.androidaps.plugins.sensitivity.SensitivityOref1Plugin
import info.nightscout.androidaps.plugins.sensitivity.SensitivityWeightedAveragePlugin
import info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin
import info.nightscout.androidaps.utils.resources.ResourceHelper
import info.nightscout.androidaps.utils.sharedPreferences.SP
import javax.inject.Inject

class IobCobStaticCalculatorPlugin @Inject constructor(
    injector: HasAndroidInjector,
    aapsLogger: AAPSLogger,
    rxBus: RxBusWrapper,
    sp: SP,
    resourceHelper: ResourceHelper,
    profileFunction: ProfileFunction,
    configBuilderPlugin: ConfigBuilderPlugin,
    treatmentsPlugin: TreatmentsPlugin,
    sensitivityOref1Plugin: SensitivityOref1Plugin,
    sensitivityAAPSPlugin: SensitivityAAPSPlugin,
    sensitivityWeightedAveragePlugin: SensitivityWeightedAveragePlugin
) : IobCobCalculatorPlugin(injector, aapsLogger, rxBus, sp, resourceHelper, profileFunction,
    configBuilderPlugin, treatmentsPlugin, sensitivityOref1Plugin, sensitivityAAPSPlugin, sensitivityWeightedAveragePlugin) {

    override fun onStart() { // do not attach to rxbus
    }
}