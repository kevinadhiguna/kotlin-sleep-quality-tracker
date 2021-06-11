/*
 * Copyright 2019, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.trackmysleepquality.database

import androidx.room.Entity

/**
 * SleepNight data class with :
 * - parameters for an ID
 * - a start time (in milliseconds)
 * - an end time (in milliseconds)
 * - a numerical sleep-quality rating.
 */

/**
 * Before the class declaration, annotate the data class with @Entity.
 * This annotation has several possible arguments.
 * By default (no arguments to @Entity), the table name will be the same as the class.
 * But let's use a helpful table name of daily_sleep_quality_table.
 * This argument for the tableName is optional, but highly recommended.
 */

@Entity(tableName = "daily_sleep_quality_table")
data class SleepNight(
    var nightId: Long = 0L,
    val startTimeMilli: Long = System.currentTimeMillis(),
    var endTimeMilli: Long = startTimeMilli,
    var sleepQuality: Int = -1
)
