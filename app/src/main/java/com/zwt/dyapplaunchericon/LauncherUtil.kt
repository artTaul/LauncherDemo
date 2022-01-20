package com.zwt.dyapplaunchericon

import android.content.ComponentName
import android.content.Context
import android.content.pm.PackageManager
import androidx.annotation.StringDef

/**
 *
 * @Author:         wentaozhang
 * @CreateDate:     2022/1/20 2:02 下午
 * @Email：zhangwentao01@tojoy.com
 */
class LauncherUtil {
    companion object {

        const val APP = "com.zwt.dyapplaunchericon.MainActivity"
        const val APP_A = "com.zwt.dyapplaunchericon.Launcher_1"
        const val APP_B = "com.zwt.dyapplaunchericon.Launcher_2"

        @StringDef(
            value = [APP, APP_A, APP_B]
        )
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        annotation class AppLauncher

        fun enableLauncher(context: Context, @AppLauncher name: String) {
            context.packageManager.run {
                setComponentEnabledSetting(
                    ComponentName(context, APP),
                    PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                    PackageManager.DONT_KILL_APP
                )
                setComponentEnabledSetting(
                    ComponentName(context, APP_A),
                    PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                    PackageManager.DONT_KILL_APP
                )
                setComponentEnabledSetting(
                    ComponentName(context, APP_B),
                    PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                    PackageManager.DONT_KILL_APP
                )
                setComponentEnabledSetting(
                    ComponentName(context, name),
                    PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                    PackageManager.DONT_KILL_APP
                )
            }
        }
    }
}