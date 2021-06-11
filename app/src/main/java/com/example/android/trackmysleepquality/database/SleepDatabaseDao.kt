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

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

// Notice that interface SleepDatabaseDao is annotated with @Dao.
// All DAOs need to be annotated with the @Dao keyword.
@Dao
interface SleepDatabaseDao {
    /**
     * Inside the body of the interface, add an @Insert annotation.
     * Below the @Insert, add an insert() function that takes an instance of the Entity class SleepNight as its argument.
     */
    @Insert
    fun insert(night: SleepNight)

    /**
     * Add an @Update annotation with an update() function for one SleepNight.
     * The entity that's updated is the entity that has the same key as the one that's passed in.
     * You can update some or all of the entity's other properties.
     */
    @Update
    fun update(night: SleepNight)

    /**
     * Add a @Query annotation with a get() function that takes a Long key argument and returns a nullable SleepNight.
     * You'll see an error for a missing parameter.
     */
    // Add a String parameter to @Query that is an SQLite query to retrieve all the columns from a particular SleepNight entry.
    @Query("SELECT * from daily_sleep_quality_table WHERE nightId = :key") // Notice the :key. You use the colon notation in the query to reference arguments in the function.
    fun get(key: Long): SleepNight?

    /**
     * Add another @Query with a clear() function and a SQLite query to DELETE everything from the daily_sleep_quality_table.
     * This query does not delete the table itself.
     */
    @Query("DELETE FROM daily_sleep_quality_table")
    fun clear()

    /**
     * Add a @Query with a getTonight() function.
     * Make the SleepNight returned by getTonight() nullable, so that the function can handle the case where the table is empty.
     * (The table is empty at the beginning, and after the data is cleared.)
     */
    @Query("SELECT * FROM daily_sleep_quality_table ORDER BY nightId DESC LIMIT 1")
    fun getTonight(): SleepNight?

    /**
     * Add a @Query with a getAllNights() function
     */
    @Query("SELECT * FROM daily_sleep_quality_table ORDER BY nightId DESC")
    fun getAllNights(): LiveData<List<SleepNight>>
}
