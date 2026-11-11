package com.anytypeio.anytype.di.main

import android.content.Context
import com.anytypeio.anytype.CrashReporter
import com.anytypeio.anytype.SentryCrashReporter
import com.anytypeio.anytype.core_utils.tools.AppInfo
import com.anytypeio.anytype.presentation.device.BuildProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object CrashReportingModule {

    @JvmStatic
    @Provides
    @Singleton
    fun provideCrashReporter(): CrashReporter = object : CrashReporter {
        override fun init() {
            // Disabled in offline mode
        }
        override fun setUser(userId: String) {
            // Disabled in offline mode
        }
    }
}