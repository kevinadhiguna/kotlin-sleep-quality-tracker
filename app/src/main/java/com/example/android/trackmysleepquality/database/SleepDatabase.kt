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

import androidx.room.Dao
import androidx.room.Insert
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
}
